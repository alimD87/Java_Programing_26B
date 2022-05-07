package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {

            Target target = new Target();
            target.price = 10;
            target.buyItems();
            target.returnItem();
           // target.payForShipping(true); target class does not implement the Shipping interface

            Amazon amazon = new Amazon();
            amazon.price = 1000;
            amazon.buyItem();
            amazon.returnItem();
            amazon.payForShipping(true);
            amazon.viewCart();
    }
}
