package day05_variables;

public class CellPhone {

    /*
	create a class CellPhone
	create a main method
	declare and assign these variables:
		brand, model, color, price, storage, hasCamera, sim(char A, B, C)

	Print all the variables

		sample data: apple, iphone 10, black, 1000.99, 128, true, A
     */

    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone 10";
        String color = "Black";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from "+ brand);
        System.out.println("It came in the color " + color + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $" + price);

        // approach 2 with String variable:

        String fullMessage = "\nI have an " + model + " from "+ brand + "\nIt came in the color " + color + " and it has " + storage + "GB \nFor the sim type" + sim + " with a camera" + hasCamera + " the total price was $" + price;

        System.out.println(fullMessage);
        System.out.println(fullMessage); // the point that, we can print the whole message again, very easily


    }



}
