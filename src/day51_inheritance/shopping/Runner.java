package day51_inheritance.shopping;

public class Runner {
    public static void main(String[] args) {

            Target target = new Target();
            target.price = 10;
            System.out.println(target.price);
            target.buyItems();
            target.returnItem();
           // target.payForShipping(true); target class does not implement the Shipping interface

            Amazon amazon = new Amazon();
            amazon.price = 1000;
            amazon.buyItem();
            amazon.returnItem();
            amazon.payForShipping(true);
            amazon.viewCart();
            System.out.println(amazon.country);

            System.out.println(Shipping.country); // proper way to access static information in the interface
    }
}
