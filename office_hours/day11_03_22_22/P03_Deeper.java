package day11_03_22_22;

public class P03_Deeper {
    public static void deeper(){
        System.out.println("  Deeper");
    }



    public static void deep(){
        System.out.println(" Deep");
        deeper();
        System.out.println(" Deep");
    }

    public static void main(String[] args) {

        System.out.println("Not Deep");
        deep();
        System.out.println("Not Deep");

    }


}
