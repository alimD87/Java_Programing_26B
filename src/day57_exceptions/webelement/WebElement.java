package day57_exceptions.webelement;

/*create an interface WebElement
    create abstract methods:
        void click()
        String getText()
        void sendKeys(String txt)
 */
public interface WebElement {

    void click();
    String getText();
    void sendKeys(String txt);

}