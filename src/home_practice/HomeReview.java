package Home_Practice2;
/*
    task:
           Task:
        declare and assign a gift card with 200
        buy 2 items.
        buy item 1 for x price and subtract from your gift card
        buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card
        100
        40

 */

public class HomeReview {
    public static void main(String[] args) {

        double giftCard = 200;
        System.out.println("Buy item for $100" );
        giftCard -= 100.50;

        System.out.println("Buy item for $50.99");
        giftCard -=50.99;

        System.out.println("Your gift card balance is $" + giftCard);







    }
}
