package Day23_For_DoLoops;

import java.util.Scanner;

public class HomePractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();


        String firstName,lastName,domain;
        int firstNameEnd, lastNameStarts;
        firstNameEnd = email.indexOf("-");
       firstName =  email.substring(0,firstNameEnd);
       lastNameStarts = email.indexOf('@');
       lastName = email.substring(firstNameEnd+1,lastNameStarts);
       domain = email.substring(lastNameStarts +1, email.length());
        System.out.println("first name: " +firstName);
        System.out.println("last name: " +lastName);
        System.out.println("email: " +domain);
    }
}











//    /public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String sentence = input.nextLine();
//        int howManyWords = 1;
//        String space = " ";
//        for (int i = 0; i <= sentence.length()-1; i++) {
//
//            if(sentence.substring(i,i+1).equals(space)){
//                howManyWords++;
//
//            }
//
//
//        }
//        System.out.println(howManyWords);