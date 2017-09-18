var express = require('express');
var path = require('path');
var session = require('express-session');
var passport = require('passport');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');

module.exports = (app, config) =>{
    //View engine setup
    app.set('views', path.join(config.rootFolder, './views'));
    app.set('view engine', 'hbs');

    //This setup the witch is the parser for the required data
    app.use(bodyParser.json());
    app.use(bodyParser.urlencoded({ extended: false }));

    //We will use cookies
    app.use(cookieParser());

    //Session is storage for cookies , witch will be de/encrypted with that 'secret' key
    app.use(session({secret:"I have depression and I want to kill myself please help me", resave: false, saveUninitialized: false}));

    //For password validation we will use passport module
    app.use(passport.initialize());
    app.use(passport.session());

    app.use((req,res,next) =>{
        if(req.user){
            res.locals.user = req.user;
        }

        next();
    });

    //This make the content in the "public" folder accessible for every user
    app.use(express.static(path.join(config.rootFolder, '/public')));

};