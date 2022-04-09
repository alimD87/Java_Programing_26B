package day42_custom_classes;

public class usingCoffe {
    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();

        coffee1.price = 3.99;
        coffee1.size = 16;
        coffee1.brand = "StarBucks";
        coffee1.type = "Regular";

        System.out.println(coffee1);

        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();

        coffee1.refill(8);

        System.out.println(coffee1);


    }
}
