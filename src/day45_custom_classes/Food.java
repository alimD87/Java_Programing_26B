package day45_custom_classes;

public class Food {
    /*
     create a class called Food

        - data:

            name, quantity, unit price, total price
*/

    /*
        - constructor

            - create a constructor that creates a Food object with the name

            - create a constructor that creates a Food object with the name and quantity

            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

*/
    /*
        - method:

            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information

    Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20

  */

 /*
     create a class called Food
        - data:
            name, quantity, unit price, total price
*/

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    /*
        - constructor
            - create a constructor that creates a Food object with the name
            - create a constructor that creates a Food object with the name and quantity
            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here
*/

    public Food(String name){
        this.name = name;
    }

    public Food(String name, int quantity){
        this(name);
        this.quantity = quantity;
    }

    public Food(String name, int quantity, double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    /*
        - method:
            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
            - toString()
                print all the Food information
  */

    public void calculatePrice(){
        totalPrice = quantity * unitPrice;
    }

    public String toString(){
        return "Item: " + name + " ~ " + quantity + " x " + unitPrice + " for $" + totalPrice;
    }

    public static class Offer {

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

        public Offer(String company, String location) {
            this.company = company;
            this.location = location;
        }

        public Offer(String company, String location, double salary) {
            this.company = company;
            this.location = location;
            this.salary = salary;
        }

        public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
            this.company = company;
            this.location = location;
            this.salary = salary;
            this.isFullTime = isFullTime;
            this.numberOfPTO = numberOfPTO;
        }

        /*
            - method:
                toString()
                    print all the employees information
         */

        public String toString(){

            String info = company + " located in " + location;

            info += " - " + (salary > 0 ? salary : "");

            info += " - " + (isFullTime ? "Full Time" : "Contract");

            info += " - " + (numberOfPTO > 0 ? numberOfPTO : "");

            return info;

        }

    }
}
