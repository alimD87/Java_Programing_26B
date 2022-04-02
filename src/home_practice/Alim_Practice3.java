package Home_Practice;

public class Alim_Practice3 {
    public static void main(String[] args) {
        System.out.println("Please calculate how much overtime do we have to pay to our employee");
        int narimanhours = 40;
        int narimanOverPayHours = 15;
        double narimanRegPayRate = 30.6;
        double narimanOverTimePayRate = 15.6;

        System.out.println("Nariman Useinov reqular pay & overtime $" + narimanhours * narimanRegPayRate + narimanOverPayHours * narimanOverTimePayRate);
    }
}
