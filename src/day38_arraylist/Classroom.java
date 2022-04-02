package day38_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {



    ArrayList <String> group = new ArrayList();
        System.out.println(group.size());

        group.add("Alim");
        group.add("Evelina");
        group.add("Nial");
        group.add("Adel");
        group.add("Lemana");
        System.out.println(group);
        System.out.println(group.size());

        System.out.println("First student: " + group.get(0));
        System.out.println("Second student: " + group.get(1));
        System.out.println("Third student: " + group.get(2));
        System.out.println("Forth student: " + group.get(3));
        System.out.println("Fifth student: " + group.get(4));

        System.out.println();

        //this is the same meaning and do the same thing as above but with for loop
        for (int i = 0; i < group.size(); i++) {
            System.out.println("Student " + (i + 1) + " " + group.get(i));

        }

        System.out.println();
        // this is the same thing as above but with each loop
        for (String student : group){ // student == group.size(i);
            System.out.println("Student " + student);
        }

 }
}