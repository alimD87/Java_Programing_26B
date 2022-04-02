package day02_02_16_2022;

public class P03_TimeConverter {

    /*
       2.Create class named "TimeConverter" and make a main method

						- Write a Java program to convert time from second to hours/min/sec format
						- Input Seconds : 3695


							Expected Output:
							inputSeconds is 3695
							1 hours 1 minutes 35 seconds

							How many sec we have ?

							60 sec = 1 min
							60 min = 1 hours
							60*60  = 3600 in hours



     */

    public static void main(String[] args) {

        int inputSeconds=3695;

        int hours,minutes,seconds;

        // day

        hours = inputSeconds/3600;     // hours = 1;

        minutes = inputSeconds % 3600 /60 ;

        seconds = inputSeconds % 60  ;   // 35

        // 3695          1 min = 60 sec
        // 3600 -- > 1 hour
        // 60    --> 1 min
        // 35    sec

        System.out.println("inputSeconds is 3695");
        System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");



        //  Extra -->     day/hours/min/sec
        //  Hint for day
        //  1 hour is 3600
        // 24 hour * 3600 -->



    }
}
