package day36_methods;

public class OverLoadAndReturn {

    public static void method(){
        System.out.println("default empty method");
    }

    // I will try to overload by changing the return type

//    public static int method(){
//
//    }
//    this is not valid, changing the return type does not overload

    public static int method(int a){
        return 0;
    }


}
