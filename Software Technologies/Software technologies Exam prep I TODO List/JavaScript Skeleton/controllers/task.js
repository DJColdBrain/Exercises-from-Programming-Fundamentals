const Task = require('mongoose').model('Task');

module.exports = {
    index: (req, res) => {
        Task.find({}).then(tasks =>{
		res.render('task/index', {'tasks': tasks});
		})
	},
	createGet: (req, res) => {
        res.render('task/create');
	},
	createPost: (req, res) => {
        let taskArgs = req.body;


        if (!taskArgs.title || !taskArgs.comments){
        	res.redirect('task/create');
        	return
		}

        Task.create(taskArgs).then(task => {
            res.redirect("/");
		})
	},
	deleteGet: (req, res) => {

    	let id = req.params.id;

        Task.findById(id).then(task =>{
        	if (!task){
        		res.redirect('/');
        		return
			}
        	res.render('task/delete', task);
		});



	},
	deletePost: (req, res) => {
        let id = req.params.id;

        Task.findById(id).then(task =>{
            if (!task){
                res.redirect('task/delete');
                return
            }

            Task.deleteOne(task).then(task =>{
                res.redirect('/');
			});


        });
	}
};