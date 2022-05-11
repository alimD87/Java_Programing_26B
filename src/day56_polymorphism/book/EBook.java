package day56_polymorphism.book;
/*
Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
 */
public abstract class EBook extends Book implements Downloadable{

    double size;

    public abstract void open();
}
