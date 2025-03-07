package dsa.leetcode.problems;

public class LongestSubstring {
    public static void main(String[] args) {
        String str= "abcabcbb";

        int start= 0;
        int current=1;
        int maxLength= Integer.MIN_VALUE;
        int currentLength=1;
        while(current<str.length()){
            if(str.charAt(current)!=str.charAt(start)&&str.charAt(current)!=str.charAt(current-1)){
                currentLength++;
                current++;
            }else {
                start++;
                current = start+1;
                maxLength= Math.max(maxLength,currentLength);
                currentLength=1;
            }
        }

        System.out.println(maxLength);
    }
}
