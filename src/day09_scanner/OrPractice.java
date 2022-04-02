package day09_scanner;

public class OrPractice {
    public static void main(String[] args) {

        int apples = 5;
        int oranges = 10;

        System.out.println(apples > 1 || oranges < 5);
        System.out.println(apples > 10 || oranges == 10); //false || true  --> true
        System.out.println(apples > 10 && oranges == 10);
        // false && true -> false

        // get a discount if its a friday and you are a teacher or police office, or firefighter

    }
}
