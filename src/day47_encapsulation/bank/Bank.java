package day47_encapsulation.bank;

public class Bank {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType);

        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567891112141L, "Alim", 10000000);
        System.out.println(obj1);

        System.out.println();
        DebitCard obj2 = new DebitCard(123456789111L, "Evelina", 100000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);

        // valid values
        System.out.println();
        DebitCard obj3 = new DebitCard(1234567891112141L, "Nial", "Visa", 7000, 10000000);
        System.out.println(obj3);

        // invalid values
        System.out.println();
        DebitCard obj4 = new DebitCard(1234567891L, "Adel", "Money", 7, 10000000);
        System.out.println(obj4);

    }
    }

