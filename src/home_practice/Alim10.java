package Home_Practice;

//Season Finder
//
//        declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month
//
//
//        12, 1, 2 	--> Winter
//        3, 4, 5 	--> Spring
//        6, 7, 8 	--> Summer
//        9, 10, 11 	--> Fall
//
//        Ex:
//        2
//        It is winter, so wear a winter coat, gloves and a hat


import java.util.Scanner;

public class Alim10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter month");
        String season = "";
        int month = input.nextInt();

        switch (month){
            case 12:
                season = "winter" ;
                System.out.println("It is still a " + season + " wear coat ");
           break;
            case 1:
                season = "winter" ;
                System.out.println("It's a " +season + " put on hat ");
            break;
            case 2:
                season = "winter" ;
                System.out.println("It is a " + season + " wear a boots");
        }


    }

    }

