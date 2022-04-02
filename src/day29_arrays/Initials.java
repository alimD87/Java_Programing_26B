package day29_arrays;

public class Initials {

    /*
    Initials
• Given an array of classmate’s names, first name and last separated by a space, print the initials of everyone
    Ex: Input:
    [ “James Bond”, “Eve Rell”, “Anna Johnson” ] Output:
    JB ER AJ
     */

    public static void main(String[] args) {

        String[] names = {"James Bond", "Eve Rell", "Anna Johnson", "       Willy Orange"};

        for (int i = 0; i < names.length; i++) {

            String fullName = names[i].trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

        }

        for (String str : names) {

            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

            // option 2:
//            str = str.trim();
//            System.out.println(str.substring(0, 1) + str.substring(str.indexOf(" ")).trim().charAt(0));
        }


    }


}
