package Home_Practice;


//ask the user to enter a number based on the language they wanted to use.
//        1 - English
//        2 - Spanish
//        3 - Turkish
//        4 - Russian
//        5 - French

//        1 : "hello, thank for your call"
//        2 : "hola, gracias para llamar"
//        3 : "merhaba, aradiginiz icin tesekkurler"
//        4 : "privet, spasibo za vash zvonok"
//        5 : "Merci ,pour votre appel"
//        any other number: "We will use English by default"

public class ChooseLanguage {
    public static void main(String[] args) {






        int languages = 4;
        if (languages==1){
            System.out.println("English");
            System.out.println("hello, thank for your call");
        }else if (languages==2){
            System.out.println("Spanish");
            System.out.println("hola, gracias para llamar");
        }else if (languages==3){
            System.out.println("Turkish");
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        }else if(languages==4){
            System.out.println("Russian");
            System.out.println("privet, spasibo za vash zvonok");
        }else if (languages==5){
            System.out.println("French");
            System.out.println( "Merci ,pour votre appel");
        }else{
            System.out.println("We will use English by default");
        }
    }


}
