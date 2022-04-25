package DAY4_04_25_2022.exam.packageB;

import DAY4_04_25_2022.exam.packageA.First;

public class Third {
    public static void main(String[] args) {
        First obj = new First();

        System.out.println(obj.a);
//        System.out.println(obj.b);
//        System.out.println(obj.c);
//        System.out.println(obj.d);

        System.out.println(First.e);
    }
}
