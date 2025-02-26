package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumber {

    public static void main(String[] args) {
        /**
         * Write a program that uses the Stream API to filter a list of integers,
         * keeping only the even numbers, and then print them.
         */
        List<Integer> numbers= Arrays.asList(2,1,56,142,875,2145,125);

        System.out.println(numbers.stream().filter(n->{
            if(n%2==0){
                return true;
            }
            return false;
        }).collect(Collectors.toList()));
    }
}
