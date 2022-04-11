package day43_custom_classes;

public class UsingEmployee {
    public static void main(String[] args) {
        HWEmployee employee = new HWEmployee("Sean Paul", 1234, "SDET", 150_000);
        employee.goToMeeting();

        System.out.println(employee);

    }
}
