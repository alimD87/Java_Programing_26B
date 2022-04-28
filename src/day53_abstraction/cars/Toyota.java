package day53_abstraction.cars;

import day53_abstraction.cars.Car;

public class Toyota extends Car {

    @Override
    public void start(){
        System.out.println("Insert Key");
        System.out.println("Turn the key");
    }

}
