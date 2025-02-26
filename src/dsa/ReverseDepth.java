package dsa;

import java.util.List;
import java.util.Stack;

public class ReverseDepth {

    // Helper function to determine the maximum depth of the list iteratively
    private static int getMaxDepth(List<Object> list) {
        int maxDepth = 1;
        Stack<List<Object>> stack = new Stack<>();
        stack.push(list);

        while (!stack.isEmpty()) {
            List<Object> currentList = stack.pop();
            for (Object item : currentList) {
                if (item instanceof List) {
                    stack.push((List<Object>) item);
                    maxDepth++;
                }
            }
        }
        return maxDepth;
    }

    // Helper function to calculate the weighted sum based on reverse depth
    public static int calculateWeightedSum(List<Object> list) {
        // Step 1: Find the maximum depth of the list
        int maxDepth = getMaxDepth(list);

        // Step 2: Iterate through the list and calculate the weighted sum
        int totalSum = 0;
        Stack<List<Object>> stack = new Stack<>();
        stack.push(list);
        int currentDepth = 1;

        // To manage the reverse depth while traversing iteratively
        while (!stack.isEmpty()) {
           List<Object> currentList = stack.pop();

            int reverseDepth = maxDepth - currentDepth + 1;
            for (Object item : currentList) {
                if (item instanceof List) {
                    stack.push((List<Object>) item);
                    currentDepth++;
                } else if (item instanceof Integer) {
                    totalSum += (Integer) item * reverseDepth;
                }
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // Example 1: [[1, 1], 2, [1, 1]]
        List<Object> list1 = List.of(
                List.of(1, 1),
                2,
                List.of(1, 1)
        );
        System.out.println(calculateWeightedSum(list1));  // Output: 8

        // Example 2: [1, [4, [6, 2]]]
        List<Object> list2 = List.of(
                1,
                List.of(4, List.of(6, 2))
        );
        System.out.println(calculateWeightedSum(list2));  // Output: 19
    }
}

