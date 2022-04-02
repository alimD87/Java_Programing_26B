package day26_nested_loops;

public class NestedLoopExample2 {

    public static void main(String[] args) {

        for(int i = 0;  i < 5; i++){

            System.out.print("A" + i);

            for(int j = 0; j < i; j++){
                System.out.print("B" + j);
            }

            System.out.println();

        }


        System.out.println(" --------------------- ");

        String s = "java";

        for(int i = 0; i < s.length(); i++){

            for(int j = 0; j <= i; j++){
                System.out.print(s.charAt(j));
            }

            System.out.println();
        }


    }
}
