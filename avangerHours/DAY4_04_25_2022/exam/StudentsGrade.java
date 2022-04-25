package DAY4_04_25_2022.exam;

import DAY4_04_25_2022.exam.FinalExam;

import java.util.Scanner;

public class StudentsGrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalQuestions;
        int missed;

        System.out.println("How many questions are there in the final exam?");
        totalQuestions = input.nextInt();

        System.out.println("How many questions did student miss?");
        missed = input.nextInt();

        FinalExam math = new FinalExam(totalQuestions,missed);
        System.out.println(math.getScore());
        System.out.println(math.getGrade());
    }
}
