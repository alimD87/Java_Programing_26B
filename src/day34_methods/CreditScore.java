package day34_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore();// this value is not used

        int score = getCreditScore();
        System.out.println(score);

        System.out.println(getCreditScore());
        System.out.println(getCreditScore() + 50);

        System.out.println(isGoodCreditScore(680)); // this is hard coded value
        System.out.println(isGoodCreditScore(720));// this is hard coded value as well
        System.out.println(isGoodCreditScore(getCreditScore()));// this is a dynamic way to do it

        System.out.println(isGoodCreditScore(500) ? "Good Score" : "Bad Score"); // you also can do that way with message printed

    }

    public static int getCreditScore(){
        return 800;
    }

    public static boolean isGoodCreditScore(int creditScore){ // you can use String method instead of boolean
        if (creditScore >= 700){
            return true;
        }else{
            return false;
        }
    }


/*
    public static boolean isGoodCreditScore(int creditScore){
        if (creditScore >= 700){
            return true;
        }else{
            return false;

 */

}
