package org.task;

public class Main {
    public static void main(String[] args) {
        int[] someArray = {1,2,3};
        int result = getClosestValueToZero(someArray);
        System.out.println(result);
    }

    /*
    Returns the closest value to 0 in the given array.

    @param nums contains numbers
    @return closest value to 0, for multiple return values only the positive value gets returned
    */
    public static int getClosestValueToZero(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int closest = nums[0];

        for (int i = 1; i < nums.length; i+=1) {

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