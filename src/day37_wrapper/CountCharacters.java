package day37_wrapper;

import java.util.Arrays;

/*

   given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters

       aP3d572&*jd@jdJU

    */
public class CountCharacters {
    public static void main(String[] args) {

        String s = "aP3d572&*jd@jdJU";
        int upper = 0, lower = 0, number = 0, other = 0;
        String uppercaseChars = "";

        for (int i = 0; i < s.length(); i++) {

            char letter = s.charAt(i);

            if (Character.isUpperCase(letter)){
                upper++;
                uppercaseChars += letter;
            }else if (Character.isLowerCase(letter)){
                lower++;
            }else if (Character.isDigit(letter)){
                number++;
            }else{
                other++;
            }


        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Uppercase  letters: " + Arrays.toString(uppercaseChars.toCharArray()));
        System.out.println("Lowercase: " + lower);
        System.out.println("Numbers: " + number);
        System.out.println("Other: " + other);


    }
}
