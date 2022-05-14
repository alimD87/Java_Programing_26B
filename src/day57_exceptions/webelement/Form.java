package day57_exceptions.webelement;


    public class Form implements WebElement{

        @Override
        public void click() {
            System.out.println("Clicking the form");
        }
        @Override
        public String getText() {
            return "Sign up";
        }

        @Override
        public void sendKeys(String txt) {
            System.out.println("Filling up the form");
        }

        public void submit() {
            System.out.println("submitting form");
        }

    }
