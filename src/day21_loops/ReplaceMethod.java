package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "java is a language";
        s = s.replace('a', 'e');
        System.out.println(s);

        String day = "Today is monday. we will monday. its monday";
        day = day.replace("monday", "tuesday");
        System.out.println(day);

        String str = "Today is monday. we will monday. its monday";
        System.out.println(str.replaceFirst("monday", "tuesday"));

        String target = "Today is monday. we will monday. its monday";

        int firstIndex = target.indexOf('.');
        int secondIndex = target.lastIndexOf('.');
        String middleStr = target.substring(firstIndex, secondIndex);
        middleStr = middleStr.replace("monday", "weekday");

        System.out.println(target.substring(0 , firstIndex) + middleStr + target.substring(secondIndex));

    }
}
