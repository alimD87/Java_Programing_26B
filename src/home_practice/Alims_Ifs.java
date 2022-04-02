package Home_Practice;

public class Alims_Ifs {

    public static void main(String[] args) {
        System.out.println("Please see attached scores for the students\n_____________________________");
        int score = 80;
        int score2 = 70;
        char grade = 'A';
        char grade2 = 'A';
        if(score +score2 >= 90){
            grade  = 'A';
            grade2 = 'A';
        }else if (score +score2 >= 80){
            grade = 'B';
            grade2 = 'B';
        }else if (score + score2 >= 70){
            grade = 'C';
            grade2 = 'B';
        }else if (score >= 60){
            grade = 'D';

        }else{
            grade = 'F';
        }
            System.out.println(" See list of students who pass or failed the test \n Alim Djemilev grade : " +grade+ "\nSecond student Evelina Smailova, Grade for the yesterdays test is: " + grade2);


    }
}
