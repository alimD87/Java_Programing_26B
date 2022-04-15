package day41_arraylist.day43_custom_classes;

public class Marker {

    String type;
    String brand;
    String color;

    @Override
    public String toString() {
        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Marker(String inputType, String inputBrand, String inputColor){
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }

}
