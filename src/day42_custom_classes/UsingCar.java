package day42_custom_classes;

public class UsingCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = "Mercedes Benz";
        car1.year = 2022;
        car1.color = "Black";
        car1.fuelLevel = 25;
        System.out.println(car1);

        System.out.println();

        car1.drive();

        System.out.println(car1);

        System.out.println();

        car1.fillTank();
        System.out.println(car1);

        System.out.println();
        car1.isLow();
        System.out.println(car1);


    }
}
