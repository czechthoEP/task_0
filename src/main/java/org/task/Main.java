package org.task;

public class Main {
    public static void main(String[] args) {
        int[] someArray = {1,2,3};
        int result = getClosestValueToZero(someArray);
        System.out.println(result);
    }

    /*
    Returns the closest value to 0 in the given array.
    On a tie only the positive number gets returned.

    @param nums contains numbers
    @return closest value to 0, for multiple return values only the positive value gets returned
    */
    public static int getClosestValueToZero(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int closest = Integer.MAX_VALUE;
        int currentNumber;
        boolean flag_MinValue = false;
        int minValueCounter = 0;

        //check if nums contains Integer.MIN_VALUE and if there are other elements
        for(int num : nums) {
            if(num == Integer.MIN_VALUE) {
                minValueCounter +=1;
            }
        }

        // array contains only Integer.MIN_VALUE
        if(nums.length == minValueCounter) {
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < nums.length; i+=1) {

            if(nums[i] == Integer.MIN_VALUE) {
                continue;
            }

            if (Math.abs(nums[i]) < Math.abs(closest)) {
                // current number is closer to zero
                closest = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(closest)) {
                // tie, choose the positive number
                if (nums[i] > closest) {
                    closest = nums[i];
                }
            }
        }

        return closest;
    }

}