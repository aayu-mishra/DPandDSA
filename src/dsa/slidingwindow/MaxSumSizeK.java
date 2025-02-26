package dsa.slidingwindow;

public class MaxSumSizeK {

    /**
     * Given an array of integers nums and an integer K,
     * find the maximum sum of any contiguous subarray of size K.
     *
     * Input: nums = [2, 1, 5, 1, 3, 2], K = 3
     * Output: 9
     * Explanation: Subarray [5, 1, 3] has the maximum sum = 9.
     */

    public static void main(String[] args) {
        int[] nums={2, 1, 9, 1, 3, 2};
        int k= 6;

        System.out.println(maxSum(k,nums));;
    }

    private static int maxSum(int k, int[] nums) {
        int maxSum= Integer.MIN_VALUE;
        int currentSum=0;

        for(int j=0;j<k;j++){
            currentSum+= nums[j];
        }
        for(int i=k;i<nums.length;i++){
            currentSum = currentSum-nums[i-k]+nums[i];
            maxSum= Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
