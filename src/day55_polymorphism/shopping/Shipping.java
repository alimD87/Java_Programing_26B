package day55_polymorphism.shopping;

/*
Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)
 */
public interface Shipping {

    String country = "US";

    void payForShipping(boolean b);

}
