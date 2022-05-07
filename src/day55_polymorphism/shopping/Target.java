package day55_polymorphism.shopping;

/*
Create a concrete class Target
    - Make the class final
    - Inherit Shopping and implement all abstract methods
 */

public final class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Target");
    }

}