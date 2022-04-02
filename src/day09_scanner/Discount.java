package day09_scanner;

public class Discount {

    /*
        Task
            declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day and you must be one of the given professions

     */
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isPoliceOfficer = true;
        boolean isFireFighter = false;

        boolean getDiscount = isWeekend &&
                (isTeacher || isPoliceOfficer || isFireFighter);

        System.out.println(getDiscount);

    }
}
