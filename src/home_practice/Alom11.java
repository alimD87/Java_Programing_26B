package Home_Practice;

import java.util.Scanner;

public class Alom11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Player");
        int house = input.nextInt();
        System.out.println("house");
        int player = input.nextInt();
        if(player >21 ){
            System.out.println("bust");
        }else if (player == house){
            System.out.println("tie");
        }else if (player == 21){
            System.out.println("Win");
        }else if (house > player){
            System.out.println("Lose");
        }else if (player > house){
            System.out.println("player win");
        }
        System.out.println("It was a good game");


    }
}
