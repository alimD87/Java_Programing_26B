package day04_variables;

public class School {
    /*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/

    public static void main(String[] args) {

        int numberOfStudentInGrade1 = 40;
        int numberOfStudentInGrade2 = 25;
        int numberOfStudentInGrade3 = 34;
        int numberOfStudentInGrade4 = 19;
        int numberOfStudentInGrade5 = 28;

        int totalNumberOfStudents = numberOfStudentInGrade1 + numberOfStudentInGrade2 + numberOfStudentInGrade3 + numberOfStudentInGrade4 + numberOfStudentInGrade5;

        double numberOfDaysInYear = 101.5;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.6;

        System.out.println("numberOfStudentInGrade1 = " + numberOfStudentInGrade1);
        System.out.println("numberOfStudentInGrade2 = " + numberOfStudentInGrade2);
        System.out.println("numberOfStudentInGrade3 = " + numberOfStudentInGrade3);
        System.out.println("numberOfStudentInGrade4 = " + numberOfStudentInGrade4);
        System.out.println("numberOfStudentInGrade5 = " + numberOfStudentInGrade5);

        System.out.println("totalNumberOfStudents = " + totalNumberOfStudents);

        System.out.println("total number of days in the year: " + numberOfDaysInYear);
        System.out.println("number snow days " + numberOfSnowDays);
        System.out.println("average gpa " + averageGpaInSchool);



    }



}
