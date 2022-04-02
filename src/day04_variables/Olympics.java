package day04_variables;

public class Olympics {
    /*
    class name Olympics

        create a variable for the year
        print the country and year for next couple events
        reassign year value each time. Country name is hard coded

        data:

            China 2022
            France 2024
            Italy 2026

        Look forward to the year $year for the Olympics to be in $location

     */

    public static void main(String[] args) {

        int year;

        System.out.println("The Olympics will be in these locations for the coming years:");

        year = 2022;
        System.out.println("Look forward to the year " + year + " for the Olympics to be in China");

        year = 2024;
        System.out.println("Look forward to the year " + year + " for the Olympics to be in France");

        year = 2026;
        System.out.println("Look forward to the year " + year + " for the Olympics to be in Italy");



    }
}
