package day57_exceptions.webelement;


    public class Image implements WebElement{

        @Override
        public void click() {
            System.out.println("Clicking the image");
        }

        @Override
        public String getText() {
            return "Text Desc.";
        }

        @Override
        public void sendKeys(String txt) {
            System.out.println("Uploading picture");
        }
}
