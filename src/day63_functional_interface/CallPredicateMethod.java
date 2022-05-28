package day63_functional_interface;

public class CallPredicateMethod {
    public static void main(String[] args) {

        boolean b = UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(UsePredicate.isPalindrome.test("abc"));

        System.out.println(UsePredicate.isPrime.test(5));

        System.out.println(UsePredicate.isPrime.test(10));

    }
}
