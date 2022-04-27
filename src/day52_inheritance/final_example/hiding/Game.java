package day52_inheritance.final_example.hiding;

public class Game {
    public static void main(String[] args) {

        Sports.cheer(); // calling the cheer method from the Sports class
        System.out.println();
        Soccer.cheer(); // calling the cheer method from the Soccer class

    }
}
