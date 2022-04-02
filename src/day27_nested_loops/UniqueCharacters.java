package day27_nested_loops;

public class UniqueCharacters {
    /*
    [IQ] Unique characters

    Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            BDF

        -> the characters B D and F are only found in the String once so they are unique

     */

    public static void main(String[] args) {

        String str = "AABCCDEEFYZZX";

        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++){

                char inner = str.charAt(j);

                //System.out.println(letter + " - " + inner);

                if(letter == inner){
                    count++;
                }

            }

            if(count == 1){ // the counter will be one when the character was unique. the character will always match with itself one time, so it will never be 0, but if the counter value is more than 1 then that character matched with multiple other characters, which means it is not unique
                System.out.print(letter);
            }

            //System.out.println();

        }


    }



}
