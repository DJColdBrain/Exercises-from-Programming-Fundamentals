const Task = require('../models/Task');

module.exports = {
	index: (req, res) => {
		let taskPromises = [
            Task.find({status:"Open"}),
            Task.find({status:"In Progress"}),
            Task.find({status:"Finished"})
		];
		Promise.all(taskPromises).then(taskResults =>{
            res.render('task/index', {'openTasks': taskResults[0],
									'inProgressTasks': taskResults[1],
									'finishedTasks': taskResults[2]
            });
		});
		/*
		OR
		 Task.find().then(tasks =>{
		 res.render('task/index', {'openTasks':tasks.filter(t => t.status === "Open"),
		 'inProgressTasks':tasks.filter(t => t.status === "In Progress"),
		 'finishedTasks':tasks.filter(t => t.status === "Finished")});
		 });
		 */

	},
	createGet: (req, res) => {
		res.render('task/create');
	},
	createPost: (req, res) => {
        let taskArgs = req.body;


        if (!taskArgs.title || !taskArgs.status){
            res.redirect('task/create');
            return
        }

        Task.create(taskArgs).then(task => {
            res.redirect("/");
        })
	},
	editGet: (req, res) => {
		// TODO: Implement me...
	},
	editPost: (req, res) => {
		// TODO: Implement me...
	}
};