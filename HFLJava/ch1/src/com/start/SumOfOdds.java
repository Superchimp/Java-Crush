package com.start;

import java.lang.reflect.Array;

public class SumOfOdds {


    public int sumOfOdds(int[] nums) {
        int numsSize = nums.length;
        boolean firstNum = true;
        boolean lastNum = false;
        int timesAdded = 0;
        int totalSum = 0;

        for (int num : nums){
            if(num % 2 == 1){
                totalSum += num;
                timesAdded++;
            }
            if(timesAdded == 10){
                return totalSum;
            }
        }

////        while (lastNum = false) {
//            for (int num : nums) {
//                if (num % 2 == 1) {
//                    if (firstNum) {
//                        totalSum = num;
//                        firstNum = false;
//                    } else {
//                        totalSum += totalSum;
//                    }
//                    timesAdded++;
//                }
//                if (timesAdded == 9){
//                    return totalSum;
//                }
//            }
////        }
//        return totalSum;
    return totalSum;
    }
}