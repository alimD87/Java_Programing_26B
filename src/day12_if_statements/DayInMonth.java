package day12_if_statements;

public class DayInMonth {
    /*
    create a int variable to represent the month number, where 1 is January and 12 is December.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
	Months that has 30 days: 4, 6, 9, 11
	Month that has 28 days: 2

	ex:
		12
		31 days

	ex:
		9
		30 days
     */
    public static void main(String[] args) {

        int month = 1; // scanner.nextInt();

        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        boolean has28Days = month == 2;

        if(has31Days) {
            System.out.println("31 days");
        }

        if(has30Days) {
            System.out.println("30 days");
        }

        if(has28Days) {
            System.out.println("28 days");
        }

        // above is 3 single if statements, below is one multi branch if

        if(has31Days){
            System.out.println("31 days");
        } else if(has30Days) {
            System.out.println("30 days");
        } else if(has28Days){
            System.out.println("28 days");
        } else {
            System.out.println("Invalid number for month");
        }


    }


}
