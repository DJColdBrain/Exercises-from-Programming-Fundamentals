/**
 * Created by DJColdBrain on 25-Jul-17.
 */

function a(lines) {
    for (let i=0; i<lines.length; i++){

        if(lines[i].localeCompare("Stop") != 0){
            console.log(lines[i]);
        }else{
            break;
        }
    }
}