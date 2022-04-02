package day35_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("apple"));
        System.out.println(StringUtil.fixFormat("jaMES"));


        ///belove is different cod

        System.out.println(StringUtil.frequencyOfCharacter("Apple", 'p'));
        System.out.println(StringUtil.frequencyOfCharacter("Apple", 'z'));

            // new code

        System.out.println(StringUtil.uniqueCharacters("aaaabcbffhx"));
        System.out.println(StringUtil.uniqueCharacters("java"));
        System.out.println(StringUtil.uniqueCharacters("aaeeiioo"));//bo unique numbers that's why it is empty
        System.out.println(StringUtil.uniqueCharacters("apple"));

    }
}