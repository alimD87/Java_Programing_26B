package day43_custom_classes;
/*
create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO

        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO


        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects

 */
public class Offer {

    String location;
    String company;
    double salary;
    boolean fullTime;
    int pto;

    public Offer(String location, String company) {
        this.location = location;
        this.company = company;
    }

    public Offer(String location, String company, double salary) {
        this.location = location;
        this.company = company;
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, boolean fullTime, int pto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.fullTime = fullTime;
        this.pto = pto;
    }
    public void loveMySalary(){
        System.out.println(salary + " I Love my salary offer");
    }

    @Override
    public String toString() {
        return "Offer" +
                "Location=: " + location + '\'' +
                ", Company=: " + company + '\'' +
                ", Salary=: " + salary +
                ", FullTime=: " + fullTime +
                ", PTO:= " + pto;
    }
}
