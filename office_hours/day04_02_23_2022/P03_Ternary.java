package day04_02_23_2022;

import java.util.Scanner;

public class P03_Ternary {
    public static void main(String[] args) {


        /*

        ? ---  if
        : ---  else

        condition ? true statemnets : false statements

  */


        int a = 15;
        int b = 10;
        System.out.println(a>b?a:b);

        System.out.println(" ======= SQUARE TASK WITH TERNARY =============");
        int x = 4;
        int y = 4;

        String result=(x==y)?"Square":"Rectangle";
        System.out.println("result = " + result);

        System.out.println(" ======= BMI TASK WITH TERNARY =============");

        double mass=82.4;
        double height=1.82;
        double BMI= mass/ (height*height);


        result=(BMI<18.5)?"Underweight": (BMI>=18.5 && BMI <25 )?"Normal weight":
                    (BMI>=25 && BMI<30)?"Overweight":"Obese";

        System.out.println("Your BMI Index refers : "+ result);


        System.out.println(" ======= DONATE BLOOD TASK WITH TERNARY =============");


        int age =25;
        int weight=80;



        result=(age>=18)?(weight>=50)?"You are eligible to donate blood":"You are not eligible to donate blood":"Age must be greater than 18";
        System.out.println("result = " + result);


    }
}
