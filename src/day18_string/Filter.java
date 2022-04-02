package day18_string;

import java.util.Scanner;

public class Filter {
    /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

	$message sent
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your message");
        String msg = input.nextLine(); // input.nextLine().toLowerCase().trim();
        msg = msg.toLowerCase();
        msg = msg.trim();

        if(msg.contains("java is bad") || msg.contains("quit") || msg.contains("have fun") || msg.contains("crying")){
            System.out.println("Message failed to send");
        } else {
            System.out.println("\"" + msg +  "\"" + " was sent");
        }




    }
}
