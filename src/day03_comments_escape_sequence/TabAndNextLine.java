package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {

        System.out.println("This was not tabbed");
        System.out.println("\tThis was tabbed once");
        System.out.println("\t\tThis was tabbed twice");
        System.out.println("    This was tabbed once without escape");

        System.out.println("\t\t\t\texample");
        System.out.println("                example");

        // examples of next lines
        System.out.println();
        System.out.println("1) Go to store");
        System.out.println("2) grab milk");
        System.out.println("3) wash car");

        System.out.println("\n1) Go to store\n2) grab milk\n3) wash car");

    }
}
