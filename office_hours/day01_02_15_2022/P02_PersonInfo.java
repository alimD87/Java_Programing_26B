package day01_02_15_2022;

public class P02_PersonInfo {
    public static void main(String[] args) {
        /*
         Task02:   Variables(Primitives - Non Primitives ),Concatenation and Escape Sequences

					  Create class named "PersonInfo" and make a main method

						    Create variables and give value related to you:

						        - String name
						        - byte age
						        - char gender
						        - boolean student
						        - short number of siblings
						        - long favorite number
						        - int number of seasons in your area
						        - double birth date: (month.day)
						        - int year
						        - String full birthday date with year
						        - String favorite quote
						        - Print the person information with using concat/escape characters

         */

        String name="Mehmet";
        byte age=40;
        char gender='M';
        boolean isStudent=false;
        short numberOfSiblings=2;
        long favoriteNumber=13;
        int numberOfSeasons=4, year=1980;
        double birthDate=06.17;
        String favoriteQuote="Never give up";

        String fullBirthDay="0"+birthDate+"_"+year;

        System.out.println(fullBirthDay);

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("favoriteQuote = " + favoriteQuote);


        System.out.println("============ Escape Seq ============ ");

        System.out.println("\tname :"+name+"\n\tage :"+age+"\n\tgender :"+ gender);

        // DRY --> Don't Repeat Yourself
        // Keep It Simple






    }
}
