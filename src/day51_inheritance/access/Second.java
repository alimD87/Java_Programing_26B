package day51_inheritance.access;

public class Second {
    // different class, same package

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        //System.out.println(obj.four);
    }

    // four is not accessible because it is private
}
