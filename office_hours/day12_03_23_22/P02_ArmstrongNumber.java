package day12_03_23_22;

public class P02_ArmstrongNumber {
    public static void main(String[] args) {
        /*
        	Task 4 :   Write a method that can check if a number is Armstrong number
				Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.
                print all the armstrong numbers with three digit
				Armstrong numbers are     === 153 370 371 407 === for 3 digits
				 153   ==  (1*1*1)+(5*5*5)+(3*3*3)
                             1       125      27  == 153
                153
                3     ---  153 % 10   ---  153 / 10 -->  15
                5     ---  15 % 10    ---  15 / 10  -->  1
                1     ---  1 % 10     ---   1 / 10  -->  0
               0 --> when we got this result , it means stop execution
            To see div / remainder operator
               153 % 3 -->    0
               153 / 3 -->    51
         */

        for (int i = 100; i <1000 ; i++) {
            isArmstrong(i);
        }



    }

    public static void isArmstrong(int number){

        int lastDigit=0;
        int totalDigits=0;
        int originalNumber=number;

        while(number>0){

            lastDigit=number%10;    // to find last digit

            // System.out.println("lastDigit "+lastDigit);

            number/=10;
            //number=number/10;

            totalDigits+=lastDigit*lastDigit*lastDigit;

            // Math class -- has pow method

        }

        if(totalDigits==originalNumber){

            System.out.println(originalNumber);

        }

    }
}
