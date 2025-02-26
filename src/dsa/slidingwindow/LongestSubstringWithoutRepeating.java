package dsa.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

    /**
     * Given a string s, find the length of the longest substring without repeating characters.
     *
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: "abc" is the longest substring without repeating characters.
     */

    public static void main(String[] args) {
        String str= "abcabcddbb";

        System.out.println(longestSubstringWithoutRepeating(str));;
    }

    public static int longestSubstringWithoutRepeating(String str) {
        if (str.length() == 0) return 0; // Edge case: empty string

        HashSet<Character> set = new HashSet<>();
        int maxSubStrLength = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) { 
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxSubStrLength = Math.max(maxSubStrLength, right - left + 1);
        }
        return maxSubStrLength;
    }
}


