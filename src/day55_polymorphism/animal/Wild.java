package day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        // all possible reference/object of Lizard

        // itself
        Lizard lizard = new Lizard();
        lizard.eat();

        // super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();

        // super class - animal
        Animal animal = new Lizard();
        animal.eat();

        /*

            We made 3 Lizard objects with 3 different references:
            Lizard (itself), Reptile (super class), Animal (super class)

            but when it comes to execution, the object implementation is run

         */

    }

}
