package day63_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {

    public static void main(String[] args) {

        Consumer<Integer> printToN = n -> {
            for(int i = 0; i <= n; i++){
                System.out.print(i + " ");
            }
        };

        printToN.accept(50); // accept() is the abstract method defined in the Consumer interface

        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Summer", "Pool", "Warm"));
        list.forEach( e -> System.out.println(e)); // print each object
        list.forEach( e -> {
            System.out.println(e.charAt(0)  + " " + e.charAt(e.length()-1));
        }); // print each first and last characters

        list.forEach( word -> {
            if(word.length() < 5){
                System.out.println(word);
            }
        });

    }


}
