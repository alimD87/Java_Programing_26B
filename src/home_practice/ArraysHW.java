package Home_Practice2;

/*
Given a String of words that are separate by commas. Find and print any words that have more than one word

Example

	Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

	Output:
	wooden spoons
	trash can
	dish washer
___________________________
 */
public class ArraysHW {
    public static void main(String args[]) {

//

            String words =" knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
            String[]wordArray = words.split(",");

            for (String eachWord:wordArray) {

                if (eachWord.trim().contains(" ")) {
                    System.out.println("\t"+eachWord);
                }
            }
        }
    }

