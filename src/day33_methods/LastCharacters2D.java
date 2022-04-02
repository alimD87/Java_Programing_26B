package day33_methods;

public class LastCharacters2D {

    public static void main(String[] args) {

        /*
        Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

        Ex:

            {"James", "is", "back"}
            {"he", "was", "never", "gone"}
            {"methods", "tomorrow"}

        Output:
            ssk
            esre
            sw

         */
        String[][] words = { {"James", "is", "back"}, {"he", "was", "never", "gone"}, {"methods", "tomorrow"}};

        for(String [] eachArray : words){

            for(String eachWord : eachArray){
                System.out.print(eachWord.charAt(eachWord.length() - 1)); // words[i][j].charAt(words[i][j].length() -1));
            }
            System.out.println();

        }



    }

}
