package day24_loops;

public class CountChars {
    /*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
     */

    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i); // get the character at the index number i for this iteration, and stores into the variable letter for re-usability

            if(letter >= 'A' && letter <= 'Z'){
                upper++;
            } else if (letter >= 'a' && letter <= 'z') {
                lower++;
            } else if(letter >= '0' && letter <= '9'){
                number++;
            }

        }

        // the purpose of the loop was to check every character and see is it uppercase, lowercase, or a number. We want the loop to finish which means every character was checked. Then we will print one time after the loop the results

        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lowercase characters: " + lower);
        System.out.println("Number characters: " + number);


    }
}
