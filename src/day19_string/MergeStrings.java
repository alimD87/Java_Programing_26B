package day19_string;

public class MergeStrings {
    public static void main(String[] args) {

        /*

            two Strings: hard code to have 3 characters each
            merge the Strings together

            ex:
                abc
                xyz

                output: axbycz

         */

        String a = "abc";
        String b = "XYZ";
        String merged = "";
        merged += a.charAt(0); // merged = merged + a.charAt(0)
        merged += b.charAt(0);
        merged += a.charAt(1);
        merged += b.charAt(1);
        merged += a.charAt(2);
        merged += b.charAt(2);
        System.out.println(merged);

    }
}
