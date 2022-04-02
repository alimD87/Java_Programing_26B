package day35_methods;
/*
    create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type

        Use the following information to convert from given dollars to the desired currency type

        1 dollar = 0.91 euro
        1 dollar = 121.03 yen
        1 dollar = 14.85 lira
        1 dollar = 1,217.52 won
        1 dollar = 181.45 rupee

        Note: Don't worry about decimal formats, focus on method

        Ex:
            Input:
                euro, 100

            Output:
                91

        Ex:
            Input:
                yen, 50

            Output:
                6051.5
     */
public class CurrencyConverter {

    public static double convert(String type, double amount){

        switch (type.toLowerCase()){
            case "euro":
                return amount * 0.91;
            case "yen":
                return  amount * 121.03;
            case "lira":
                return  amount * 12.85;
            case "won":
                return  amount * 1_217.52;
            case "rupee":
                return amount * 181.45;
            default:
                return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(convert("euro", 1000)); // convert(next(), nextDouble()) ===> Scanner output
    }
}
