package day46_static.phone;

public class IPhone {

    String model;
    double price;

    static String company;
    static String os;

    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "IOS";

    }

    public IPhone(String model, double price){
        System.out.println("CONSTRUCTOR RUN");
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
