package dp;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    /**
     * print a list of fibonacci series for a given in put n
     * ex. input n=5, output {1,1,2,3,5}
     *
     */

    public static void main(String[] args) {
        System.out.println(generateFibonacci(10));
    }
    public static List<Long> fiboncci(int n){
        List<Long> fibonacciSeries= new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(i==1||i==2){
                    fibonacciSeries.add(1l);
                }else{
                    fibonacciSeries.add(fibonacciSeries.get(i-2)+fibonacciSeries.get(i-3));
                }
            }
        return fibonacciSeries;
    }

    /**
     * chatGPT solution
     * @param n
     * @return
     */
    public static List<Integer> generateFibonacci(int n) {
        List<Integer> fibonacciSeries = new ArrayList<>();

        // Base cases
        if (n >= 1) {
            fibonacciSeries.add(1);
        }
        if (n >= 2) {
            fibonacciSeries.add(1);
        }

        // Generate Fibonacci series
        for (int i = 2; i < n; i++) {
            int nextFibonacci = fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2);
            fibonacciSeries.add(nextFibonacci);
        }

        return fibonacciSeries;
    }
}
