package day06_03_02_2022;

public class P02_SearchResult {
    public static void main(String[] args) {
        /*
        Task 2 : Assume that you searched a word in Google  Search Engine.After that you took a result message like this


	   "About 3,640,000,000 results (0.78 seconds)"

		According to this result print out search Time and number of Result

		Input :  "About 640,000,000 results (0.78 seconds)"

		Output:
					Result number is 640,000,000
					Response time is 0.78 seconds
         */
        String result="About 649823402394803280,000,000 results (0.78 seconds)";

        int startIndex=result.indexOf(" ");
        int endIndex=result.indexOf(" ",startIndex+1);

        String searchResult=result.substring(startIndex+1,endIndex);
        System.out.println("searchResult = " + searchResult);


        startIndex =result.indexOf("(");
        endIndex = result.indexOf(")");

        String searchTime=result.substring(startIndex+1,endIndex);
        System.out.println("searchTime = " + searchTime);


    }
}
