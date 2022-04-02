package day04_02_23_2022;

public class P01_BMI {
    public static void main(String[] args) {

          /*
				BMI: Program will ask user to enter their mass (kilogram) and their height (meters).
				Calculate their BMI and then print the appropriate message based on the provided values:
				All numbers taken as doubles

								—> BMI Formula: BMI = mass / height^2
								—> Values:

									Less than <18.5> — Underweight
									From 18.5 to 25 — Normal weight
									From 25 to 30 — Overweight
									More than or equal to 30 — Obese

								 	Output :  Underweigth    or    Normal weight    or   etc.

		*/


        double mass=82.4;
        double height=1.82;
        double BMI= mass/ (height*height);
        String result="";

        if(BMI<18.5){
            result="Underweight";
        }else if (BMI>=18.5 && BMI <25 ){
            result="Normal weight";
        }else if (BMI>=25 && BMI<30){
            result="Overweight";
        }else {
            result="Obese";
        }

        System.out.println("Your BMI index refers : " + result);
        System.out.println("BMI = " + BMI);

    }

    }

