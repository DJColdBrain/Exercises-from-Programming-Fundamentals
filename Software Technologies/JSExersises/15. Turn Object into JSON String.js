/**
 * Created by DJColdBrain on 25-Jul-17.
 */


function a(pairs) {
    let obj = {};
    for(let i = 0; i< pairs.length; i++){
        let pair = pairs[i].split(' -> ');
        let key= pair[0];
        let value = TryParseInt(pair[1], pair[1]);

            obj[key] = value;

    }
    let string = JSON.stringify(obj);
    console.log(string);
    function TryParseInt(str,defaultValue) {
        var retValue = defaultValue;
        if(str !== null) {
            if(str.length > 0) {
                if (!isNaN(str)) {
                    retValue = parseInt(str);
                }
            }
        }
        return retValue;
    }
}
