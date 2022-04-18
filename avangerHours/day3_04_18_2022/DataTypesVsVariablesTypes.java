package day3_04_18_2022;

import day33_methods.Car;

public class DataTypesVsVariablesTypes {
     /*
    how many different data types do we have in java?
    2 types
    1-Primitive
    2-Non primitive
    ========================================================
    Q= How many types of variables are there in java?

    1-Local
    2-Instance
    3-Static

     */

    public static void main(String[] args) {
        int number = 5; // primitive data type -Local variables
        boolean flag = true; // primitive -local
        //....

        String str = "word"; //non primitive -local
        Integer num = 100; // non primitive -local
        Car car1 = new Car(); // non primitive -local
        //static int x =5;

    }
    public static void method1(){
        //number=6;
        if(true){
            String str = "java";
        }
        //str= "nothing"; can not be accessible
    }
}
