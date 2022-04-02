package day07_unary_operators;

public class Pizza {

    /*
        create a class Pizza
        add a main method
        declare and assign these variables:

           type of pizza,  the number of slices,  the number of people eating

        calculate how many slices each person will get
        calculate how many slices are left over

        Sample print statement:

           We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
     */

    public static void main(String[] args) {

        String typeOfPizza = "Cheese";
        int numberOfSlices = 10;
        int numberOfPeople = 4;
        int slicesPerPerson = numberOfSlices / numberOfPeople;
        int slicesLeftOver = numberOfSlices % numberOfPeople;

        String report = "We ordered " + typeOfPizza + " pizza with " + numberOfSlices + " slices, " + numberOfPeople + " people ate " + slicesPerPerson + " each with " + slicesLeftOver + " left over";

        System.out.println(report);


    }
}
