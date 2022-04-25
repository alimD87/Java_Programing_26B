package DAY4_04_25_2022.exam;

/*
- Create a class FinalExam (subclass of GradeActivity)
                     - Instance variables: -int numQuestion (total question number in the exam)
                                       -double pointsEach  (points per each question)
                                       -int numMissed   (number of wrong answers)

                     - Constructor; parameters -> numQuestions, numMissed
                        assign these parameters

                     - Instance method ; calcNumericScore()
                         first calculate the pointsEach  (based on 100 pts)
                         then declare a numericScore variable and calculate => formula;  (100-(numMissed*pointsEach))
                         then call setScore() method with numericScore variable

 */
public class FinalExam  extends GradeActivity {
    int numQuestions;
    double pointEach;
    int numMissed;

    public FinalExam(int numQuestions, int numMissed) {
        this.numQuestions = numQuestions;
        this.numMissed = numMissed;
        calculateNumericScore();
    }

    public void calculateNumericScore(){
        pointEach = 100.00/numQuestions;
        double numericScore = 100.0 - (numMissed*pointEach);
        setScore(numericScore);

    }
}
