package day63_functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {

            if (n % 2 == 0){
                System.out.println(n + " Even");
            }else{
                System.out.println(n + " Odd");
            }
        };
        evenOrOdd.apply(20);
        evenOrOdd.apply(25);
    }
}
