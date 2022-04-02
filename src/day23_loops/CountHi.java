package day23_loops;

public class CountHi {

    public static void main(String[] args) {

        String str = "aaaahiahhihibbbcch";
        int count = 0;

        for(int index = 0; index < str.length() - 1; index++){ // index <= str.length() - 2

            if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
                count++;
            }

        }

        System.out.println(count);


    }
}

/*
     String str = "aaaahiahhihibbbcch";

     aa
     aa
     aa
     ah
     hi

 */
