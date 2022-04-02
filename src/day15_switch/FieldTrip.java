package day15_switch;

public class FieldTrip {

    public static void main(String[] args) {

    /*
    Create a class called FieldTrip.
    Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip. Print the information at the end.

    declare and assign the grade level variable

        only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
            so print: "Grade must be between 1-6"

        Data based on grade:
            grade - 1
            location -  Apple orchard
            number of groups - 3
            teacher in charge - Ms. Smith
     */

        int grade = 1; // scanner.nextInt();
        String location = "", teacher = "";
        int numberOfGroups = 0;

        // giving default value to the variables will help avoid any compile issues, in this case the code covers all cases and does not need any defaults assigned

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple orchard";
                numberOfGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater";
                numberOfGroups = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacher = "Ms. Lela";
            } else {
                // this one is for grade 6
                location = "Six Flags";
                numberOfGroups = 8;
                teacher = "Mr. Watt";
            }


            System.out.println("Field trip information for grade " + grade);
            System.out.println("Location: " + location);
            System.out.println("Number of Groups: " + numberOfGroups);
            System.out.println("Teacher in charge: " + teacher);


        } else {
            System.out.println("Grade must be between 1-6");
        }


    }

}
