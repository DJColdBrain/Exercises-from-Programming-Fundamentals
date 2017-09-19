const Product = require('../models/Product');

module.exports = {
	index: (req, res) => {
        Product.find({}).then(entries =>{
            res.render('product/index', {'entries': entries});
        })
    	},
	createGet: (req, res) => {
        res.render('product/create');
	},
	createPost: (req, res) => {
        let productArgs = req.body;


        if (!productArgs.name || !productArgs.priority || !productArgs.quantity || !productArgs.status ){
            res.redirect('/create');
            return
        }

        Product.create(productArgs).then(product => {
            res.redirect("/");
        })
	},
	editGet: (req, res) => {
        let id = req.params.id;

        Product.findById(id).then(product =>{
            if (!product){
                res.redirect('/');
                return
            }
            res.render('product/edit', product);
        });
	},
	editPost: (req, res) => {
        let productId = req.params.id;
        let productArgs = req.body;


        if (!productArgs.name || !productArgs.priority || !productArgs.quantity || !productArgs.status ){
            res.redirect('edit');
            return
        }


        Product.findByIdAndUpdate(productId,productArgs, {runValidators:true}).then(product => {
            res.redirect("/");
        })
	}
};