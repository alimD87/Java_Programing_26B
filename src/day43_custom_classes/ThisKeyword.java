package day43_custom_classes;

public class ThisKeyword {

    int a = 100;

    public ThisKeyword(int a){
        a = 400;
        System.out.println(a);
        this.a = 600;
    }
}
