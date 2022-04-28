package day53_abstraction.exercise;

public class Gym {
    public static void main(String[] args) {

        Running obj2 = new Running ();
        System.out.println(obj2.name);
        obj2.performExercise();
        System.out.println(obj2.getCaloriesBurned(20));
    }
}
