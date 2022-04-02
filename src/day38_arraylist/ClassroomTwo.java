package day38_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Alim");
        System.out.println(group);

        group.add(0,"Evelina");
        System.out.println(group);

        System.out.println(group.get(0));
        System.out.println(group.get(1));

        group.add("Nial");
        System.out.println(group);

        group.add(1, "Adel");
        System.out.println(group);

        System.out.println(group.add("Lemana"));
        System.out.println(group);
    }
}
