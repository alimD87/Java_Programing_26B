package day06_arithmetic_operators;

public class CastingExamples {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne; // short is smaller than float, so no casting is needed from us

        System.out.println(numOne);
        System.out.println(numTwo);

        float num3 = 100.5F;
        short num4 = (short)num3; // float is bigger, so we cast down to short

        System.out.println(num3);
        System.out.println(num4);

        float num5 = 300; // 300 is int by default, at it automatically goes up to float
        byte num6 = (byte)num5;

        System.out.println(num5);
        System.out.println(num6);

        char letter = 'A';
        int letter2 = letter;

        System.out.println(letter);
        System.out.println(letter2);
        System.out.println((int)letter);
        System.out.println((char)66);
        System.out.println((int)'&');



    }
}
