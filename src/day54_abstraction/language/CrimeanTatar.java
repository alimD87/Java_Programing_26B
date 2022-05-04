package day54_abstraction.language;

public class CrimeanTatar implements Language{
    @Override
    public void hi() {
        System.out.println("Selyam Aleykum");
    }

    @Override
    public void bye() {
        System.out.println("Salhne Hal");

    }
}
