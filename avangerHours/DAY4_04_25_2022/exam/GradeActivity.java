package DAY4_04_25_2022.exam;

public class GradeActivity {
    /*
	- Create a class GradeActivity (Encapsulated)
                    - instance variable "score";
                    - getter and setter
                    - getGrade() instance method; (returns the grade based on the score value)
                        100>=score>=90 -> return A
                        90>score>=80 -> return B
                        80>score>=70 -> return C
                        70>score>=60 -> return D
                        score<60     -> return F
	 */

        private double score;

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
        public char getGrade(){
            if(score >= 90){
                return 'A';
            } else if(score >= 80){
                return 'B';
            } else if (score >=70) {
                return 'C';
            } else if (score>=60) {
                return 'D';
            }else {
                return 'F';
            }

        }
}
