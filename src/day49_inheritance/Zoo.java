package day49_inheritance;

public class Zoo {
    public static void main(String[] args) {


        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numberOfLegs = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;

        Lion lion = new Lion();
        // Q: How many instance variables does the lion object have access to?  3

        // Q: How many instance methods does the lion object have access to?  2

        lion.roar();
        lion.species = "lion";
        lion.walk();

    }


    }


