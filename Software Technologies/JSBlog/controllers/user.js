const encryption = require("../utilities/encryption.js");
const User = require('mongoose').model('User');

module.exports = {
    details: (req, res) =>{
      res.render('user/details');
    },
    registerGet: (req, res) =>{
        res.render('user/register');
    },
    registerPost: (req, res) =>{
        let registerArgs = req.body;
        User.findOne({email: registerArgs.email}).then(user =>{
            let errorMsg = "";
            if (user){
                errorMsg = "User with the same name already exist";
            }else if(registerArgs.password !=  registerArgs.repeatedPassword){
                errorMsg = "Passwords doesn't match";
            }
            if (errorMsg){
                registerArgs.error = errorMsg;
                res.render('user/register', registerArgs);
            }else{
                let salt = encryption.generateSalt();
                let passwordHash = encryption.hashPassword(registerArgs.password, salt);

                let userObject = {
                    email: registerArgs.email,
                    passwordHash: passwordHash,
                    fullName:registerArgs.fullName,
                    salt:salt
                };
                User.create(userObject).then(user =>{
                    req.logIn(user, (err) =>{
                        if(err){
                            registerArgs.error = err.set(errorMsg);
                            res.render('user/register', registerArgs);
                            return;
                        }

                        res.redirect('/');
                    })
                })
            }

        })


    },
    loginGet: (req, res)=>{
        res.render('user/login');
    },
    loginPost: (req, res) =>{
        let loginArgs = req.body;
        User.findOne({email: loginArgs.email}).then(user =>{
            let errorMsg = "";
            if(!user || !user.authenticate(loginArgs.password)){
                errorMsg = "Either username or password is invalid";
                loginArgs.error = errorMsg;
                res.render('user/login', loginArgs);
                return;
            }
            req.logIn(user, (err) => {
                if (err) {
                    loginArgs.error = err.set(errorMsg);
                    res.render('user/login', loginArgs);
                    return;
                }

                res.redirect('/');


            })
        })
    },
    logout:(req, res) => {
        req.logOut();
        res.redirect('/');
    }
};