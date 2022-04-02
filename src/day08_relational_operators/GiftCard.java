package day08_relational_operators;

public class GiftCard {

    /*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

     */

    public static void main(String[] args) {

        double giftCard = 200;
        System.out.println("Buy item 1 for 100$");
        giftCard -= 100.50; // giftCard = giftCard - 100;

        System.out.println("Buy item 2 for 40$");
        giftCard -= 40; // giftCard = giftCard - 40;

        System.out.println("Your gift card balance is now: " + giftCard);



    }
}
