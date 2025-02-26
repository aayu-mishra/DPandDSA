import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InfosysQ {

    /**
     * Given list of integers. Write logic to find numbers starting with 1.
     *
     * input: 15,31,12
     * output: 15,12
     */

    public static void main(String[] args) {

//        List<Integer> list= Arrays.asList(15,31,12,112,1,1323,256);
//        List<Integer> result=new ArrayList<>();
//        result=list.stream().filter(n->String.valueOf(n).startsWith("1")).collect(Collectors.toList());
//        result.stream().forEach(n->{
//            System.out.println(n);
//        });
        List<Integer> numbers= Arrays.asList(1,2,8,4,5,8);
//        int sum = numbers.stream()
//                .reduce(0, Integer::sum);
//
//        System.out.println(sum);

        //System.out.println(numbers.stream().filter(n->n%2==0).distinct().collect(Collectors.toList()));
        String object1 = new String("Hello");
        object1="Zyush";
        System.out.println(object1);
    }




}
