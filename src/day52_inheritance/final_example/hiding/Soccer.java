package day52_inheritance.final_example.hiding;

public class Soccer extends Sports {

    public static void cheer(){
        System.out.println("Cheering from the Child class");
    }
 /*
        Note:

        it looks like we are overriding
        but we are not, because the method static

        we are hiding the cheer method from the parent class


     */

}
