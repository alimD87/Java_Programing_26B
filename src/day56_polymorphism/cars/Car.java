package day56_polymorphism.cars;

public class Car {
}


class BMW extends Car{}

class Tesla extends  Car{}

class Toyota extends Car{}

class Ford extends Car{}

class LandRover extends Car{}

class DealerShip{

    public static void lease(Car car){
        System.out.println("Leasing a car" + car.getClass().getName());
    }
    public static Car getCar(int option){
        if (option == 1){
            return new Tesla();
        }else if(option == 2){
            return new Toyota();
        }else{
            return new Car();
        }
    }
}

class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        DealerShip.lease(car);

        Tesla tesla = new Tesla ();
        DealerShip.lease(tesla);

        DealerShip.lease(new LandRover());
        DealerShip.lease(new Toyota());
    }
}