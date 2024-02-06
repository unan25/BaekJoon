package org.example;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                result = nums[i] + nums[j];
                if (result == target && i != j) {
                    resultArr[0] = i;
                    resultArr[1] = j;
                    Arrays.sort(resultArr);
                    return resultArr;
                } else {
                    result = 0;
                }
            } // for(j)

        } // for(i)
        return null;
    }
}
    