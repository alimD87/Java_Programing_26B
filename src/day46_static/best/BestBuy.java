package day46_static.best;

public class BestBuy {

    String location;

    static String headquarters = "Richfield, Minnesota, United States";
    static String day = "Wednesday";
    static int numberOfComputer = 100;

    public BestBuy(String location) {
        this.location = location;
    }

    public void openStore(){
        System.out.println("Opening the " + location);
    }
    public static void reStock(){
        numberOfComputer += 20;
    }
    }
