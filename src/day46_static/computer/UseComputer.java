package day46_static.computer;

import day46_static.computer.Computer;

public class UseComputer {
    public static void main(String[] args) {

        Computer device1=new Computer(500,"Acer","Black");
        Computer device2=new Computer(1100,"Apple","Silver");

        //Accessing instance vxs-> called by object, belong to each object
        System.out.println(device1.price);
        System.out.println(device1.brand);
        System.out.println(device1.color);

        System.out.println(device2.price);
        System.out.println(device2.brand);
        System.out.println(device2.color);

        //Accessing static vxs ->called by class, belong to the class
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasScreen);


    }
    }

