package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CountVowels {

    /**
     * count Vowels and consonent
     * Java Programming - vowels: 5
     * @param args
     */
    public static void main(String[] args) {
        String input= "Java Programming";
        countVowelsAndConsonents(input);
    }

    private static void countVowelsAndConsonents(String input) {
        int countVowel= 0;
        int countConsonents= 0;
        List<Character> vowelList= List.of('a','e','i','o','u');
        List<Character> vowelLists= new ArrayList<>();
        List<Character> consonentLists= new ArrayList<>();
        for(char character: input.toCharArray()){
            if(vowelList.contains(character)){
                countVowel++;
                vowelLists.add(character);
            }else{
                countConsonents++;
                consonentLists.add(character);
            }
        }
//        Arrays.asList(input.toCharArray()).stream().distinct().forEach(x->{
//            if(vowelList.contains(x)){
//               countVowel++;
//            }else {
//                countConsonents++;
//            }
//        });
        System.out.println("count of vowel is "+ countVowel + "\n"+ "count of consonents is "+ countConsonents);
    }
}
