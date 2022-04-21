package day50_inheritance.book;

public class Library {
    public static void main(String[] args) {

        // not doing any inheritance here, just a main method to create my objects

        Book obj1 = new Book();
        // obj1 will have access to 6 instance variables

        AudioBook obj2 = new AudioBook();
        // obj2 has access to the 6 variables from the Book class and the 2 new variables in the AudioBook class:
        obj2.duration = 100;
        obj2.narrator = "Morgan Freeman";
        // obj2 has access to the instance method listen()
        obj2.title = "Java is fun";
        obj2.listen();

        EBook obj3 = new EBook();
        // obj3 has access to the 6 variables from the Book class and the 2 new variables in the EBook class:
        obj3.size = 20.4;
        obj3.pages = 1004;
        // obj3 has access to the instance method read()
        obj3.title = "Soft skills is important";
        obj3.read();

        // using the updated Author information

        Book obj4 = new Book();
        obj4.author = new Author("JK Rowling", 40); // made an Author object it belongs to the Book obj4 object
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());

    }
}
