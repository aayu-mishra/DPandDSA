package dsa.slidingwindow;

public class MaxSum {

    /**
     * Given an array of positive integers nums and an integer K,
     * find the length of the longest contiguous subarray whose sum is at most K.
     *
     * input nums = [3, 1, 2, 7, 4, 2, 1, 1, 5]
     * K = 8
     *
     * output: 4
     */

    public static void main(String[] args) {
        int k= 8;
        int[] nums2 = {2, 3, 5, 1, 9};
        int k2 = 10;
        int[] nums= {3, 1, 2, 7, 4, 2, 1, 1, 5};
        System.out.println(maxSubArray(k2, nums2));
    }

    private static int maxSubArray(int k, int[] nums) {
        int maxLength= Integer.MIN_VALUE;
        int currentSum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            currentSum+=nums[right];
            while(currentSum>k){
                currentSum-=nums[left];
                left++;
            }
            maxLength=Math.max(right-left+1, maxLength);
        }
        return maxLength;
    }
}
