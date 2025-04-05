package basic;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(isPrime(n));;
    }

    private static String isPrime(int n) {
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        return "Prime Number";
    }
}
