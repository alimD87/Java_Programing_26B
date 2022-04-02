package day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        // this is a valid do while where the boolean is true, for the first 10 numbers. We see 0 - 10

        int a = 0;

        do {
            // everything between the curly brackets are in the loop

            System.out.println(a);
            a++;

        } while (a <= 10);

        // this loop has a boolean of false, but it still runs through the code body one time because it is a do while

        System.out.println("With False boolean:");

        int a2 = 0;

        do {
            // everything between the curly brackets are in the loop

            System.out.println(a2);
            a2++;

        } while (a2 == 10);


        // this is a while loop that is the same as the do while above, but nothing will print from this one because it is false, the loop never starts

        System.out.println("as while loop:");

        int a3 = 0;

        while(a3 == 10){
            System.out.println(a3);
            a3++;
        }


    }
}
