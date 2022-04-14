package day46_static.cydeo;

public class CydeoStudent {

    String name;
    int groupNumber;

    static int batchNumber;
    static String [] instructors;
    static String schoolName;


    static {
        batchNumber = 26;
        instructors = new String[] {"Nadir", "Mehmet", "Austin", "Asun", "Saim"};
        schoolName = "Cydeo";
    }

    public CydeoStudent(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }
}
