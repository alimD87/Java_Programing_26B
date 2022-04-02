package day30_arrays;

public class LongestPalindrome {

    /*
    [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
        Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome

     */

    public static void main(String[] args) {

        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        // outer loop is iterating through the array
        for(String eachWord : words){ // eachWord == words[i]

            boolean isPalindrome = true;

            // inner loop is iterating through each String element
            for(int i = 0; i < eachWord.length()/2; i++){

                if(eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }

            }

            if(isPalindrome && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }

        }

        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);

        /*
            if(longestPalindrome.isEmpty()){
                System.out.println("No Palindrome");
             } else {
                System.out.println(longestPalindrome);
              }

         */

    }

    /*

        civic

        eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i

        int i = 0
            eachWord.charAt(0) != eachWord.charAt(5 - 1 - 0) --> charAt(4)
                c       !=     c

         i = 1
            eachWord.charAt(1) != eachWord.charAt(5 - 1 - 1) --> charAt(3)
                i       !=     i
     */

}
