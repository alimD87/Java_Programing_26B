package day52_inheritance.final_example;

public class B extends A {

    @Override
    public void instanceMethodA(){
        staticMethod();
    }

    //    @Override --> we cannot override the static methods, but we can declare this method and the staticMethod from the parent class will become hidden
    public static void staticMethod(){
        System.out.println("Static method from the CHILD class");

    }
}
