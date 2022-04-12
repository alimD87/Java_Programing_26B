package day44_custom_classes;

public class OfferV2 {
     /*
        create a class called Offer
        - data:
            location, company, salary, is full time, number of PTO
    */

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    /*
        - constructor
            - create a constructor that creates an Offer object with the company and location
            - create a constructor that creates an Offer object with the company, location, and salary
            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO
    */

    public OfferV2(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public OfferV2(String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }

    public OfferV2(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    /*
        - method:
            toString()
                print all the employees information
     */

    public String toString() {

        String info = company + " located in " + location;

        info += "\n " + (salary > 0 ? salary : "");

        info += "\n " + (isFullTime ? "Full Time" : "Contract");

        info += "\n " + (numberOfPTO > 0 ? numberOfPTO : "");

        return info;

    }
}
