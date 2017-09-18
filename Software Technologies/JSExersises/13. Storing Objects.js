/**
 * Created by DJColdBrain on 25-Jul-17.
 */


function a(infos) {
    let students = [];
    for(let i =0; i < infos.length; i++){
        let info = infos[i].split(" -> ");
        let name = info[0];
        let age = info[1];
        let grade = info[2];
        let student = {Name: name, Age:age, Grade:grade};
        students.push(student);
    }
    for (let i =0; i< students.length; i++){
        let student = students[i];
        console.log("Name: " + student["Name"]);
        console.log("Age: " + student["Age"]);
        console.log("Grade: " + student["Grade"]);
    }
}