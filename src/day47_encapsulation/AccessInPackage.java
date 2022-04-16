package day47_encapsulation;

public class AccessInPackage {

// different class same package

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
//        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
//        System.out.println(AccessModifier.z);

        // c and z were not accessible outside the class because they are private


    }
}
