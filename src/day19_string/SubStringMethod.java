package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "sunday";
        //            012345
        System.out.println(str.substring(1));
        System.out.println(str.substring(3));
        System.out.println(str);
        System.out.println("satur" + str.substring(3));

        System.out.println(str.substring(2 , 4));
        System.out.println(str.substring(0 , 5));
        System.out.println(str.substring(0 , 6)); // okay, because the index 6 is just the stopping point
      //  System.out.println(str.substring(0,7));  out of bounds because 6 index is read





    }
}
