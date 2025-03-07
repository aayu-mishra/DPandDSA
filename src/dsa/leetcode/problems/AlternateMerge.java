package dsa.leetcode.problems;

public class AlternateMerge {
    /**
     * Input: word1 = "abc", word2 = "pqr"
     * Output: "apbqcr"
     * Explanation: The merged string will be merged as so:
     * word1:  a   b   c
     * word2:    p   q   r
     * merged: a p b q c r
     */

    public static void main(String[] args) {
        String word1= "";
        String word2= "pq";
        System.out.println(mergedString(word1,word2));;
    }

    public static String mergedString(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (index < word1.length() || index < word2.length()) {
            if (index < word1.length()) {
                sb.append(word1.charAt(index));
            }
            if (index < word2.length()) {
                sb.append(word2.charAt(index));
            }
            index++;
        }
        return sb.toString();
    }
}
