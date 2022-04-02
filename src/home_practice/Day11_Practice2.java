package Home_Practice;

//create an int value for the time of the day. Use a 24 hour format
//        use the given time of day to display a message
//        hint: use seperate if statements
//
//        if the hours are from 6 - 11, print: Good morning
//        if the hours are from 12 - 16, print: Good evening
//        if the hours are from 17 - 23, print: Good night



public class Day11_Practice2 {

    public static void main(String[] args) {


       int hours = 24;
       int hours2 = 0;
        hours2 += hours;

        if(hours2 <6 - 11){
            System.out.println("Good Morning" );
        }
        if (hours > 12-16){
            System.out.println("Good Evening" );

        }

        if (hours < 17 -23){
            System.out.println("Good Night");
        }




    }

}
