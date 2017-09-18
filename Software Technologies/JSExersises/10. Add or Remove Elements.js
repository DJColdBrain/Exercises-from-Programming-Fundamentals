/**
 * Created by DJColdBrain on 25-Jul-17.
 */


function a(comands) {
    let arr = [];
    for(let i = 0; i < comands.length; i++){
        let comand = comands[i].split(' ');
        let cmd= comand[0];
        let value = comand[1];

        if(cmd === "add"){
            arr.push(value);
        }else if(cmd === "remove"){
            arr.splice(value, 1);
        }
    }
    for(let i = 0; i <arr.length; i++){
        console.log(arr[i]);
    }
}