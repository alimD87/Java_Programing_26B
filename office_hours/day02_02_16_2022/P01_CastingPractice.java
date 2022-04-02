package day02_02_16_2022;

public class P01_CastingPractice {


        /*

            byte < short < INT < long < float < DOUBLE


            TYPE CASTING

            1- IMPLICIT CASTING

                double a = 5 ;
                System.out.println(a); --> 5.0

                - Done BY Compiler
                - Smaller type to Bigger Type
                - No loss data
                - Called as WIDENING


            2- EXPLICIT CASTING

                double b =5.0;
                int i=(int)b;
               System.out.println(a); --> 5

                - Done By Developer
                - larger type to smaller type
                -  we may loss date
                - Called as NARROWING

         */

    public static void main(String[] args) {
       // byte to short
        byte b = 10;
        short s = b;    // Implicit Casting

       // double to int
       double a=5.3;
       int i = (int) a;  // Explicit Casting
       System.out.println("i = " + i);
       a=i;
       System.out.println("a = " + a);

       //long to int
       // long l=99;        // Implicit Casting
       long l=9999999999l;  // There is no casting
       int i2= (int) l;
       System.out.println("i2 = " + i2);


       double d=15.2;
       int i3      =     (short) d;
       // Implicit        Explicit Casting
       System.out.println("i3 = " + i3);



    }



}
