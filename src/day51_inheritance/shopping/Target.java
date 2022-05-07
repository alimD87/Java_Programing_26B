package day51_inheritance.shopping;

public final class Target extends Shopping {

    @Override
    public void buyItems() {
        System.out.println("Buying from Target");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Target");

    }
}
