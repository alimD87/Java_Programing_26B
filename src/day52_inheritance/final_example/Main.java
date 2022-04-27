package day52_inheritance.final_example;

public class Main {
}

class Parent {

    public final void  walk(){
        System.out.println("You are walking");
    }
}

class Child extends Parent{

//    @Override
//    public final void walk(){}
    //we cannot override final method

}
