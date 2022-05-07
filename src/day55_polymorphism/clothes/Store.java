package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {

        // All possible objects of TShirt

        TShirt tshirt1 = new TShirt(); // reference of itself
        tshirt1.wear();

        Clothes tshirt2 = new TShirt(); // reference of parent
        tshirt2.wear();

        Object tshirt3 = new TShirt();
//        tshirt3.wear(); Object class does not have reference to the wear() method

//        HasHood tshirt4 = new TShirt(); Tshirt class does not implement HasHood interface

        // -------------------------------

        // All possible objects of Jacket
        System.out.println();

        Jacket jacket1 = new Jacket(); // reference of itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2 = new Jacket(); // reference of the super class
        jacket2.wear();
//        jacket2.putOnHood(); Clothes reference does not have access to a putOnHood()

        Object jacket3 = new Jacket(); // reference of super class Object
//        jacket3.wear();
//        jacket3.putOnHood();
        //Object class does not have reference to wear() or putOnHood() methods

        HasHood jacket4 = new Jacket();
//        jacket4.wear(); HasHood reference does not have visibility to wear() method
        jacket4.putOnHood();

    }
}
