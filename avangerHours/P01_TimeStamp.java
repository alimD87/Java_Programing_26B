public class P01_TimeStamp {
    public static void main(String[] args) {
        /*
    Write a method that accepts a String (date with time) and creates a timeStamp for your
    automation report
    String date= "10/10/2022 14:59:00";
          timeStamp(date); // 10102020145900
          */

        String date= "10/10/2022 14:59:00"; //a new obj created in str pool

        date = date.replace("/",""); //a new obj created in str pool
        System.out.println("1-->"+date);

        date = date.replace(" ",""); //a new obj created in str pool
        System.out.println("2-->"+date);

        date = date.replace(":","");
        System.out.println("3-->" + date);

        System.out.println("from String return method-> "+timeStamp("10/10/2022 14:59:00"));

        //String timeStamp = timeStamp("10/10/2022 14:59:00");

        timeStampWithVoid("10/10/2022 14:59:00");

    }
    public static String timeStamp(String dateFromUI){
        return dateFromUI = dateFromUI.replace("/","").replace(" ","").replace(":","");
    }

    public static void timeStampWithVoid(String date){
        date = date.replace("/","").replace(" ","").replace(":","");
        System.out.println("from void method-->" + date);
    }

}
