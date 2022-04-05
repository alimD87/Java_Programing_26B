package Day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchBadPairs {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i = 0; i < words.size(); i += 2) {

            String temp = words.get(i);
            words.set(i,words.get(i+1));
            words.set(i + 1, temp);

        }
        System.out.println(words);
    }
}
