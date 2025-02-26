package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class WeightedReverseDepth {

    static int max = 1;

    /**
     * Given a nested list of integers, returns the sum of all integers in the list weighted by their reversed level #.
     * * For example, given the list {{1,1},2,{1,1}} the deepest level is 2. Thus the function should return 8 (four 1's with weight 1, one 2 with weight 2)
     * * Given the list {1,{4,{6,2}}} the function should return 19 (1 with weight 3, 4 with weight 2, 6 with weight 1, 2 with weight 1)
     * *
     * * It is the "reverse depth" of the item in the list: eg for the above item { 1, {4, { 6, 2 } } }
     * *
     * *  1 (reverse-depth 3) . = 1 * 3 = 3
     * *   \
     * *   { 4 } (reverse-depth 2) = 4 * 2 = 8
     * *      \
     * *      { 6, 2 } (reverse-depth 1) = 6 * 1 + 2 * 1 = 8
     * *
     * *                                  = 3 + 8 + 8 = 19
     */

    public static void main(String[] args) {
        //List<Object> list = Arrays.asList(Arrays.asList(6, 2, Arrays.asList(7, 3,Arrays.asList(7,5))), 9, 5, Arrays.asList(3, 2));
        List<Object> list = Arrays.asList(1,Arrays.asList(4,Arrays.asList(6,2)));
        System.out.println(getMaxDepth(list));
        System.out.println(weightedReverseDepthSum(list,getMaxDepth(list),1));
    }

    private static int getMaxDepth(List<Object> nestedList) {
        int maxDepth = 1;
        for (Object obj : nestedList) {
            if (obj instanceof List) {
                maxDepth = Math.max(maxDepth, 1 + getMaxDepth((List<Object>) obj));
            }
        }
        return maxDepth;
    }

    public static int weightedReverseDepthSum(List<Object> nestedList, int maxDepth, int currentDepth){
        int sum=0;
        maxDepth=maxDepth-currentDepth+1;
        for(Object obj: nestedList){
            if(obj instanceof Integer){
                sum=sum+(Integer)obj*maxDepth;
            }else if(obj instanceof List){
                currentDepth++;
                sum= sum+weightedReverseDepthSum((List<Object>) obj, maxDepth,currentDepth);
            }
        }

        return sum;
    }
}
