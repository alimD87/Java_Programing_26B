package day04_02_23_2022;

public class P04_SwitchEx {

    public static void main(String[] args) {

    /*

    boolean - float - double - long are not allowed

    switch(variableName){

        case constant1 :   // No curly brackects

            statements
            .
            ..
            ...
            break;        // it stops and exit from switch
                          // All the case block statements are OPTIONAL including break

         case constant2 :    //  constant2 or constant3 or constant4
         case constant3 :
         case constant4 :

            statements
                .
                ..
                ...
                break;


          default :     //      we can put it anywhere in the code
            statements
                .
                ..
                ...
                break;
    }

      /*
      	1-Create  a program that accepts animal as String

							DOG 	- domestic animal
							CAT 	- domestic animal
							TIGER 	- wild  animal

							For other animals - unknown animal

							INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal
     */

        String animal="MONKEY";
        String result;

        switch (animal){

            case "DOG":
            case "CAT":
                result="Domestic animal";
                break;
            case "TIGER":
                result="Wild animal";
                break;
            default :
                result="Unknown animal";
                break;
        }
        System.out.println(result);


    }
}
