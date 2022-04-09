package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {

//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(Person.name );
//        System.out.println(Person.age);

        // creating object of the person class
        Person personOne = new Person(); // creates an object of the Person class
        Person personTwo = new Person();

        // Accessing the instance variable

        personOne.name = "Alim";
        personOne.age = 34;
        personOne.height = 5.11;
        personOne.isMarried = true;

        // printing instance variables

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);


        // printing instance variables for PersonTwo

        System.out.println();

        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);
  }
}
