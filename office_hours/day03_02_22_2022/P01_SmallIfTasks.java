package day03_02_22_2022;

public class P01_SmallIfTasks {
    public static void main(String[] args) {

        /*

		1-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
		2-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater than 100

         */

        //		1-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80

        int temp = 75;
        String result="";

        if (temp >= 70 && temp <= 80) {
            result = "Ideal Temp";
            //System.out.println("Ideal Temp");
        }

        System.out.println(result);


        //		2-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater than 100

            int a=0;
            int b=50;
            int c=150;

            if(b==50 && c>100 ){
                a=20;

            }

            System.out.println(a);





    }
}
