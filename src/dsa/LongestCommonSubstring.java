package dsa;

public class LongestCommonSubstring {

    // Function to find the longest common substring
    public static String longestCommonSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // DP table to store the length of longest common substring
        int[][] dp = new int[m + 1][n + 1];

        int maxLength = 0;  // Store length of longest common substring
        int endIndex = 0;   // Store the ending index of the longest common substring

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    // If this is the largest length so far, update maxLength and endIndex
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;  // Ending index of the longest common substring in str1
                    }
                } else {
                    dp[i][j] = 0;  // No common substring ends here
                }
            }
        }

        // Extract the longest common substring using the endIndex and maxLength
        return str1.substring(endIndex - maxLength + 1, endIndex + 1);
    }

    public static void main(String[] args) {
        String str1 = "ABCDEF";
        String str2 = "ZBCDF";

        String result = longestCommonSubstring(str1, str2);
        System.out.println("Longest Common Substring: " + result);
    }
}

