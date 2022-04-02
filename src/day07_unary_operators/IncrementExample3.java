package day07_unary_operators;

public class IncrementExample3 {

    public static void main(String[] args) {

        int i = 5; // i = 6
        int z = i++; // z = 5

        System.out.println(i);
        System.out.println(z);

        int a = 10;
        int b = a + 1;

        System.out.println(a);
        System.out.println(b);

        int c = ++a; // a - 10 -> 10 + 1 = 11

        System.out.println(c);
        System.out.println(a);

    }
}
