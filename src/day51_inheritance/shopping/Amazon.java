package day51_inheritance.shopping;
/*
Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods

 */
public final class Amazon extends OnlineShopping{
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Pay for shipping" : "Free Shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void buyItems() {

    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Amazon drop location");
    }
}
