package day18_string;

public class RecapMethod {
    public static void main(String[] args) {

        String s = "pen"; // s is a String literal, so it is in the String pool
        String s2 = new String("pen"); // s2 is object in the heap, because we used new

        System.out.println("Compare with == " + (s == s2));
        System.out.println("Compare with .equals() " + s.equals(s2));

        System.out.println("compare with .equals() " + s.equals("Pen"));
        System.out.println("compare with .equalsIgnoreCase() " +s.equalsIgnoreCase("Pen"));

        boolean isSame = s.equalsIgnoreCase("PEN");

        if(s.equals("pen")){

        }

        int len = s.length();
        System.out.println(len);

        System.out.println(s.length());

        // int a = 9;
        // a.length() -> invalid
        // a.equals() -> invalid

        if(s.length() > 4){
            System.out.println("long word");
        } else {
            System.out.println("short word");
        }

        System.out.println(("aaaa").length());
        System.out.println(("aa aa").length());

    }
}
