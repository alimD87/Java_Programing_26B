package day05_variables;

public class MyName {

    /*
	create a class MyName
	create a main method
	create multiple char variables, one for each letter of your name
	print your name
		print each letter in a different line
		print your name in the same line
     */

    public static void main(String[] args) {

        char first = 'S';
        char second = 'a';
        char third = 'i';
        char fourth = 'm';

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        System.out.println();

        System.out.println("My name: " + first + second + third + fourth);

        // or you can make a variable of the name

        String name = "" + first + second + third + fourth + first; // String name = "saim"
        System.out.println("My name: " + name);

    }
}
