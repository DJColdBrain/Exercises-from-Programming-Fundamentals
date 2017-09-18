/**
 * Created by DJColdBrain on 25-Jul-17.
 */


function a(pairs) {
    let obj = {};
    for (let i = 0; i < pairs.length; i++) {
        let pair = pairs[i].split(' ');
        let key = pair[0];
        let value = pair[1];

        if (value != undefined) {
            if (obj[key] != undefined) {
                obj[key].push(value);
            } else {
                let m = [];
                m.push(value);
                obj[key] = m;
            }
        }
        else {
            if (obj[key] != undefined) {
                let arr = obj[key];
                for (let y = 0; y <arr.length; y++) {
                 console.log(arr[y]);
                 }
            } else if(key != "") {
                console.log("None")
            }
        }
    }
}
