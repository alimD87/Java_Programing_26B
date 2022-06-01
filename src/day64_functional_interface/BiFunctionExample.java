package day64_functional_interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        // compare two numbers, find the biggest one

        // first two types are your parameter types, and last one is the return type
        BiFunction<Integer, Integer, Integer> maxNumber = (one, two) -> {
            return one > two ? one : two;
        };

        System.out.println(maxNumber.apply(5, 2));

        /*
        List<Integer> --> keys -> first param
        List<String> --> values --> second param
        Map<Integer, String> --> final map that will be returned
         */

        BiFunction<List<Integer>, List<String>, Map<Integer, String>> createMap = (keys, value) -> {

            Map<Integer, String> map = new HashMap<>();

            for(int i = 0 ; i < keys.size(); i++){
                map.put(keys.get(i), value.get(i));
            }
            return map;
        };


    }
}
