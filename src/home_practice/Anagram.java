package Home_Practice;
/*
Task 04 : Anagram

                Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man
 a gent
                 -> anagram
                 Hint: look up and use replaceFirst() method


 */
public class Anagram {
    public static void main(String[] args) {
        String str1 = " a gentleman ";
        String str2 = " elegant man";

        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {

                String pac = str1.substring(i, i + 1);

                str2 = str2.replaceFirst(pac, "");
            }
            if (str2.isEmpty()) {
                System.out.println("Anagram");
            }

        } else {
            System.out.println("not anagram");
        }
    }
}




