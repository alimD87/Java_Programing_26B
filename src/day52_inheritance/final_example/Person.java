package day52_inheritance.final_example;

public class Person {
    String name = "James Bond";

}

class SecretIdentity extends Person{

    String name = "DNOB SEMAJ"; // we created another name variable in the sub class, but it was already being inherited, so now we are hidding the one from the parent
}

class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        SecretIdentity secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);

}
