package day21_loops;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println();

//        while(true){
//
//            System.out.println("Hello World");
//
//        }

        int num = 1;

        while(num <= 100){
            System.out.println("Hello World " + num++);
        }

        System.out.println();

        int z = 1;
        while(z <= 50){
            System.out.println("Hello Universe " + z);
            z++;
        }

        /*

        flow of above:
            z = 1
            z <= 50 --> 1 <= 50 --> true --> goes into loop
            runs code:  System.out.println("Hello Universe " + z); --> Hello Universe 1
            z++ --> 2

            2 <= 50 --> true --> goes into loop
              runs code:  System.out.println("Hello Universe " + z); --> Hello Universe 2
            z++ --> 3

            .. goes until

            z = 51
            51 <= 50 --> false -> loop stops
         */



    }
}
