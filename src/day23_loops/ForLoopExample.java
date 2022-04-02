package day23_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++ ){
            System.out.println(i);
        }

        /*

            flow of for loop

            1) the loop executes the initialization part to declare and assign a variable

               in our ex: int i = 1;

                initialization part runs once in the beginning

             2) boolean condition/ termination condition

                -> if the boolean is true: the loop will execute the statements

                -> if the boolean is false: the loop will stop

                in our ex: i <= 10

              3) the statements in the code body are executed top to bottom

                in our ex: System.out.println(i);

               4) update happens -- this is the end of an iteration

                in our ex: i++

               5) goes back to step 2 and repeats


         */


        // if you did the same code as above with while loop:

        int z = 1;

        while(z <= 10){
            System.out.println(z);
            z++;
        }



    }
}
