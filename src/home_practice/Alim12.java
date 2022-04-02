package Home_Practice;


//Task : CarpetShop
//
//        - Ask the user which room do they need carpet? (String)
//        List of Rooms
//        Bedroom
//        Kitchen
//
//        -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"
//
//        - Ask the user roomType dimensions (as meter and double)
//        Kitchen is circle.Take radius from user
//        Bedroom is square or Rectangle.Take lenght and width from user
//
//        - Ask the user to delivery address (String, multiple words)
//        - unitPriceForCarpet = 3.92
//        - totalcost = area*unitPriceForCarpet;
//
//        - Print in the following format:
//        Ex:
//        inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010
//
//        "TotalCost for your carpet is 51.84 and it will be delivery 1300 Lamar St Houston TX 77010 in one week"

import java.util.Scanner;

public class Alim12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter room");
        String room = input.next();
        int lenght = 1, width=2, radius;
        int area = (lenght * width);
        double unitPrePrice = 3.92;
        double totalCost = area* unitPrePrice;


        System.out.println("Enter address");
        String address = input.nextLine();
        input.nextLine();


        if(room =="bedroom" && address== "505 walker"){
            System.out.println("Enter lenght");
            lenght = input.nextInt();
            System.out.println("Enter width");
            width = input.nextInt();
            System.out.println("TotalCost for your carpet is "+ totalCost +" and it will be delivery "+address+" in a week");
        }else if(room == "Kitchen"){
            System.out.println("Enter radius");
            radius = input.nextInt();

        }else{
            System.out.println("Invalid room");
        }

    }
}
