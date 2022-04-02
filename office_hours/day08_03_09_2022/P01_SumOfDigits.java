package day08_03_09_2022;

public class P01_SumOfDigits {

    public static void main(String[] args) {
        /*
        Task 01 : SumOfDigits

        Write a program that can return the sum of digits from  a  string
             		Ex:
             			input: A1B2C3D4E5

             			output: 6
             					1+2+3
         */

        String str="A1B2C3D4";

        //          012345

        // Manually - HARDCODED -- IT will run and give correct output only for this data

        // str.charAt(1) -- returns us char data

        System.out.println("HardCoded "+(str.charAt(1)-48+str.charAt(3)-48+str.charAt(5)-48));


        // DYNAMIC -- it will run for all kind of data

       // String str="A1B2C3";

        //            012345

        // first check each char

        int sum=0;

        for (int i = 0; i < str.length(); i++) {

            char each=str.charAt(i);

            if(each>='0' && each<='9'){

                sum+=each-48;
            }

        }

        System.out.println("Dynamic "+sum);


    }
}
