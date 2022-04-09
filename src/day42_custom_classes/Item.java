package day42_custom_classes;

public class Item {

    String name;
    double price;

    @Override
    public String toString() {
        return   "name='" + name + '\'' +
                ", price=" + price;
    }
}

