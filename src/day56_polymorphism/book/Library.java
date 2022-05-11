package day56_polymorphism.book;

public class Library {
    public static void main(String[] args) {

        JavaTextbook book1 = new JavaTextbook();
        book1.name = "Java Programming";
        book1.size = 20.5;
        book1.fun = true;
        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JavaTextbook();
        book2.name = "Java Programming";
        book2.size = 20.5;
       // book2.fun = true;
        book2.read();
        book2.open();
        book2.download();

    }
}
