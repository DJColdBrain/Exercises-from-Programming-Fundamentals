/**
 * Created by DJColdBrain on 25-Jul-17.
 */


function a (nums) {
    let undex = Number(nums[0]) - 1;
    let arr = [];
    let biggestIndex =0;
    for(let i = 1; i<=nums.length-1; i++){
        let numbers = nums[i].split(' - ');
        let index = Number(numbers[0]);
        let value = Number(numbers[1]);
        arr[index] = value;
        if (biggestIndex < index){
            biggestIndex= index;
        }
    }
    for (let i =0; i <= undex; i++){
        if(arr[i] != undefined){
        console.log(arr[i]);
        }else{
            console.log("0");
        }
    }
}