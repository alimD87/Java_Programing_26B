package day49_inheritance;

public class Building {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.name = "James Bond";
        obj.age = 34;
        obj.favoriteHobby = "spy stuff";
        obj.talk();
        //obj.study(); this was a method made in the child class

        Student obj2 = new Student ();
        obj2.name = "Alim";
        obj2.age = 34;
        obj2.favoriteHobby = "workout";
        // the above variable and method were inherited from the Person class

        obj2.funLevel = 100;
        obj2.study();
    }
}
