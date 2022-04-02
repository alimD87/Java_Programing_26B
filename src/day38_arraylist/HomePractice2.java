package day38_arraylist;

import java.util.ArrayList;

public class HomePractice2 {
    /*
    Create an ArrayList of Strings
add these elements:
	Iron Man, Spider Man, Thor, Captain America, Hawkeye

	remove Thor by index

	remove Iron Man by element

	remove the first index

Print the ArrayList after each action to see how the change is made
     */
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Iron Man");
        movies.add("Spider Man");
        movies.add("Thore");
        movies.add("Captain America");
        movies.add("Strange");
        System.out.println(movies);

        movies.remove(2);
        System.out.println(movies);
        movies.remove("Iron Man");
        System.out.println(movies);
        movies.remove(1);
        System.out.println(movies);

    }

}
