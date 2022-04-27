package day52_inheritance.final_example;

public class UseFinalExample {
    public static void main(String[] args) {

        System.out.println(FinalExample.PLANET);
       // FinalExample.PLANET = "Mars";

        FinalExample obj = new FinalExample(20);
        System.out.println(obj.a);
        System.out.println(obj.b);

        FinalExample obj2 = new FinalExample(100);
        System.out.println(obj2.b);

    }
}
