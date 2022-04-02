package day09_scanner;

public class OperatorPractice {
    public static void main(String[] args) {
        int w = 78 / 2 * 2 + 3 - 5 % 5;
        /*        39 * 2 + 3 - 5 % 5
                  78 + 3 - 5 % 5
                  78 + 3 - 0
                  78 + 3
                  81
         */
        System.out.println(w);

        int a = 8; // 8 -> 7
        int b = a--; // b = 8

        System.out.println(a);
        System.out.println(b);

        int L = 50; // L = 50 -> 49 -> 50 -> 49 -> 50
        int P = --L + L++ + L-- + L++;
        //       49 + 49 + 50 + 49
        System.out.println(L);
        System.out.println(P);


        int R = 20; // R = 20 -> 19 -> 20 -> 19 -> 18
        int W = -R-- + -R++ + --R * R-- % 2;
        //      -20  + -19  +  19 * 19 % 2
        //      -20  + -19  +  361 % 2
        //      -20  + -19  +  1
        //      -39  + 1
        //      -38

        /*
            361 % 2
            how many times does 2 go into 360 evenly
            2 into 361, 180 times -> 360

            361 - 360 -> 1

         */
        System.out.println(R);
        System.out.println(W);

        int e = 1; // e = 1 -> 0 -> 1 -> 0 -> -1
        int f = -e-- + e++ / -e-- * --e;
        //      -1  + 0  / - 1 * -1
        //      -1 + 0 * -1
        //      -1 + 0
        //      -1

        System.out.println(e);
        System.out.println(f);

    }
}
