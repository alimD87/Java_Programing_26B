package day46_static.cydeo;

import java.util.Arrays;

public class CydeoStudent {

    public String name;
    public int groupNumber;

    public static int batchNumber;
    public static String[] instructors;
    public static String schoolName;

    // you can assign and declare at the same time, but it is not recommended, we will use static block to assign
    static {
        batchNumber = 26;
        instructors = new String[]{"Nadir", "Mehmet", "Austin", "Aysun", "Saim"};
        schoolName = "Cydeo";
        printInfo();
    }

    public CydeoStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    public static void printInfo(){
        System.out.println("School Name: " + schoolName);
        System.out.println("Batch Number " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
