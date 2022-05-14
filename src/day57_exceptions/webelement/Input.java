package day57_exceptions.webelement;


    /*
create a class Input
    implement the WebElement interface and implement all abstract methods
 */
    public class Input implements WebElement{
        @Override
        public void click() {
            System.out.println("Clicking Input");
        }

        @Override
        public String getText() {
            return "Input Text";
        }

        @Override
        public void sendKeys(String txt) {
            System.out.println("Sending txt to Input field");
            System.out.println(txt);
        }
}
