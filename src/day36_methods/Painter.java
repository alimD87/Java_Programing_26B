package day36_methods;

public class Painter {
    public static void main(String[] args) {

        Picture.draw();
        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("blue", "green");

        String s = "200";
        Picture.draw(s);

        Picture.draw(300, "blue");
        Picture.draw("blue", 300);
    }
}
