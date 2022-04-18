package day3_04_18_2022;

public class UseVariables {

    public static void main(String[] args) {
        Variables var1 = new Variables(); // non primitive -local

        var1.price=1;
        Variables.count = 10 ;
        //var1.count = 15;

        Variables var2 = new Variables();
        var2.price=2;

        //instance variables has unique value fer each obj
        System.out.println("var1 = " + var1.price);
        System.out.println("var2 = " + var2.price);

        //static variables is common property of class
        System.out.println(Variables.count);

        System.out.println(var1.count);
        System.out.println(var2.count);
    }
}
