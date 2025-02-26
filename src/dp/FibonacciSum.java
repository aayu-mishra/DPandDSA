package dp;

import java.util.List;

public class FibonacciSum {

    public static void main(String[] args) {
        System.out.println( fibonacciSum(4));
    }

    public static int fibonacciSum(int n){
        if(n<=1){
            return 1;
        }
//        if(n==2){
//            return 2;
//        }
        return fibonacciSum(n-1)+fibonacciSum(n-2);
    }
}
