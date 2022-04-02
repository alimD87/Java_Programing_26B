package day03_02_22_2022;

public class P02_CodilityTest {
    public static void main(String[] args) {
        /*
        	 Task : 	 Write a function:
				    		 that, given a positive integer N  However, any number divisible by 2, 3 or 5 should be replaced by the word

				    			Codility -- 2
				    			Test     -- 3
				    			Coders   -- 5

				    			- If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

				    			EXPECTED

				    						 numbers divisible by both 2 and 3 should be replaced by CodilityTest
				    						 INPUT : 6    OUTPUT :  CodilityTest

				    						 numbers divisible by both 3 and 5 should be replaced by TestCoders
                                             INPUT : 15    OUTPUT :  TestCoders

				    			 			 numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
				    			 			 INPUT : 30    OUTPUT :  CodilityTestCoders
         */


        int number = 30;
        String result = "";


        if (number % 2 == 0) {
            result += "Codility";
            //System.out.print("Codility");
        }

        if (number % 3 == 0) {
            result += "Test";
            //System.out.print("Test");
        }

        if (number % 5 == 0) {
            result += "Coders";
            //System.out.print("Coders");
        }

        System.out.println("result = " + result);


        // with multi branch if
        number = 15;

        if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
            result = "CodilityTestCoders";
        } else if (number % 2 == 0 && number % 3 == 0) {
            result = "CodilityTest";
        } else if (number % 2 == 0 && number % 5 == 0) {
            result = "CodilityCoders";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "TestCoders";
        } else if (number % 5 == 0) {
            result = "Coders";
        } else if (number % 3 == 0) {
            result = "Test";
        } else if (number % 2 == 0) {
            result = "Codility";
        }

        System.out.println("result = " + result);


    }
}
