package day01_02_15_2022;

public class P01_Intro {

    public static void main(String[] args) {

        // Single Comment

       /*
            MultiLine Comments

            Primitives
                -Integer  --> byte < short < int < long    default is int
                -Floating  -> float < double               default is double
                -Character -> char
                -Boolean   -> boolean

            Non -Primitives

                - String
                - etc
       */

        /**
         *  Java docs comments
         */

        // TODO -- It creates reminders


        System.out.println("======= Declaration of Variables=========");

        // First
        String name="Mehmet";   // declare and asgging the value

        // Second
        String name1;      // declaration
        name1="Mehmet";    // assigning

        // Third
        String name2="Mehmet",lastName="Cydeo";

        String fullName=name2+" "+lastName;

        System.out.println("this my fullname "+fullName);
        System.out.println("fullName = " + fullName);
        System.out.println("My full name is : " + fullName);

    }

}

