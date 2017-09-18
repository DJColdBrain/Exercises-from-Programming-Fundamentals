/**
 * Created by DJColdBrain on 25-Jul-17.
 */

function a(nums) {
        let num1 = nums[0];
        let num2 = nums[1];
        let num3 = nums[2];
        let count = 0;
        if (num1 == 0 || num2 == 0 || num3 == 0){
           console.log("Positive") ;
        }else{
            if (num1 < 0){
                count++;
            }
            if (num2 < 0){
                count++;
            }
            if (num3 < 0){
                count++;
            }
            if (count % 2 == 0 ){
                console.log("Positive") ;
            }else{
                console.log("Negative") ;

            }
        }

}