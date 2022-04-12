package day44_custom_classes;

public class UsingSong {
    public static void main(String[] args) {

        Song song1 = new Song("Xaytarma");
        System.out.println(song1);

        Song song2 = new Song("Quzaly Qirim" , 4.5);
        System.out.println(song2);

        Song song3 = new Song("California", 4.0, "Dr.Dre", "Rap");

        System.out.println(song3);
    }
}
