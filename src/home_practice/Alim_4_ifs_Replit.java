package Home_Practice;


// Use `if statements` to help the Blackjack dealer determine who won. There will be an `int` `house` value and an `int` `player` value. Use the following rules of blackjack to print out the result:
//
//         > - if the `player` score is bigger than `21`, the result is `player bust`
//         > - if the `player` score is equal to the `house` score, the result is `its a tie`
//         > - if the `player` score is equal to `21`, the result is `player win`
//         > - if the `house` score is bigger than the `player` score, the result is `player lose`
//         > - if the `player` score is bigger than the `house` score, the result is `player win`
//
//         #### Note: Can be done with separate if statement or a multi branch if statement
//
//         Main topics: if statements, primitive variables, operators

import java.util.Scanner;

public class Alim_4_ifs_Replit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("House Dealer");
        int house = input.nextInt();
        System.out.println("Player");
        int player = input.nextInt();



        int score = 21;
        if (score > 21) {
            System.out.println("Player bust");
        } else if (player == house) {
            System.out.println("It's a tie");
        } else if (player + score == 21) {
            System.out.println("The result of the play is win");
        } else if (house + score > player + score) {
            System.out.println("Player lose");
        } else if (player + score > house + score) {
            System.out.println("Player win");
        }
        System.out.println( player);





//        if (player > 21) {
//            System.out.println("Player bust");
//        } else if (player == house) {
//            System.out.println("It's a tie");
//        } else if (player == house) {
//            System.out.println("The result of the play is win");
//        } else if (player<=21 && player>house) {
//            System.out.println("Player win");
//        } else {
//            System.out.println("Player lose");
//        }
//        System.out.println( player);

    }

}
