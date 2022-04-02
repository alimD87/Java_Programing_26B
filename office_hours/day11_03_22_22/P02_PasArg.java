package day11_03_22_22;

public class P02_PasArg {
    public static void main(String[] args) {

        sum(3,4);

        int a=3;
        int b=4;

        sum(a,b);

        // sum(3.3,4); Compiler can do only Implicit Casting

        sum((int) 3.3,4);  // we did casting Explicitly

    }

    public static void sum(int a,int b){

        int c=0;

        System.out.println(a+b);

    }





}
