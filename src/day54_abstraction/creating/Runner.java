package day54_abstraction.creating;

public class Runner {
    public static void main(String[] args) {

      //  Create obj = new Create (); //cannot use object of interface

        Book obj = new Book();// Book is a normal (non-abstract) class
        obj.read();
        obj.write();

    }
}
