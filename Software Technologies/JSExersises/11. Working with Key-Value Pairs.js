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
                let m = [obj[key]];
                m.push(value);
                obj[key] = m;
            } else {
                obj[key] = value;
            }
        }
        else {
            if (obj[key] != undefined) {
                let arr = obj[key];
                /*for (let y = arr.length-1; y >= 0; y--) {
                    console.log(arr[y]);
                }*/
                console.log(arr[arr.length-1]);
            } else {
                console.log("None")
            }
        }
    }
}
