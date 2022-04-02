package day13_if_statements;

public class IfWithoutBrackets {

    public static void main(String[] args) {

        if(4 > 2)
            System.out.println("Hello");

        if(4 > 10)
            System.out.println("Bye");
            System.out.println("other line"); // this has nothing to do with the if

        if( 3 % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");


        if(2 == 2)
            System.out.println("2 number");
        else if (4 > 3)
            System.out.println("other line2");
        else if (4 > 1)
            System.out.println("dont do it");

    }
}
