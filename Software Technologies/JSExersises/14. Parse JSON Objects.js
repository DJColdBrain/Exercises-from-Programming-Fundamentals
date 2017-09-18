/**
 * Created by DJColdBrain on 25-Jul-17.
 */

function a(objects) {
    for(let i =0; i< objects.length; i++){
        let jsobj = JSON.parse(objects[i]);
        console.log("Name: " + jsobj["name"] );
        console.log("Age: " + jsobj["age"]);
        console.log("Date: " + jsobj["date"] );
    }
}