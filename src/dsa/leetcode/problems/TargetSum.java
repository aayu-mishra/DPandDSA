package dsa.leetcode.problems;

import java.util.Arrays;

public class TargetSum {

    public static void main(String[] args) {
        Arrays.stream(targetSum()).forEach(n-> System.out.print(n+ " "));
    }

    public static int[] targetSum(){
        int[] nums={3,2,4};
        int target=6;
        int start=0;
        int end= nums.length-1;
        int[] result= new int[2];
        nums= Arrays.stream(nums).sorted().toArray();
        while (start<=end){
            int sum=nums[start]+nums[end];
            if(sum==target){
                result[0]= start;
                result[1]=end;
                break;
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return result;
    }
}
