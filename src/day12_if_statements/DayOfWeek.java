package day12_if_statements;

public class DayOfWeek {
    /*

        Declare and assign a number (day)

            1 - Monday
            2 - Tuesday
            ..
            6 - Saturday
            7 - Sunday

            Ex: 2
                Tuesday

                // website: ww.google.com

     */
    public static void main(String[] args) {

        int day = 4;

        if(day == 1){
            System.out.println("Monday");
        } else if(day == 2){
            System.out.println("Tuesday");
        } else if(day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if(day == 6) {
            System.out.println("Saturday");
        } else if(day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number");
        }

//        if(day == 1){
//            System.out.println("Monday");
//        }
//        if(day == 2){
//            System.out.println("Tuesday");
//        }
//        if(day == 3){
//            System.out.println("Wednesday");
//        }
//        if (day == 4){
//            System.out.println("Thursday");
//        }
//        if (day == 5){
//            System.out.println("Friday");
//        } if(day == 6) {
//            System.out.println("Saturday");
//        }
    }
}
