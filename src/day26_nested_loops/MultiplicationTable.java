package day26_nested_loops;

public class MultiplicationTable {

    /*

        print the multiplication by the numbers from 1 to 10
        we will see for all numbers 1 - 10

        1 x 1 = 1
        1 x 2 = 2
        ...
        2 x 1
        2 x 2
        ..
        3 x 1
        ..

        10 x 10

     */
    public static void main(String[] args) {
        //  separate hard coded loops
//        for(int i = 1; i <= 10; i++){
//            System.out.print(1 + " x " + i + " = " + (1 * i) + " | ");
//        }
//
//        for(int i = 1; i <= 10; i++){
//            System.out.println(2 + " x " + i + " = " + (2 * i));
//        }

        // nested loop

        for(int num = 1; num <= 10; num++){

            for(int multi = 1; multi <= 15; multi++){

                System.out.print(num + " x " + multi + " = " + (num * multi) + " | " );

            } // end of the inner loop

            System.out.println();

        } // end of the outer loop


    } // end of the main method

} // end of the class
