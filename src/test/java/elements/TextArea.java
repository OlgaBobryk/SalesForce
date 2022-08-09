package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    private static final String TEXTAREA_XPATH = "//div[contains(@class, 'modal-body')]//span[text()='%s']//parent::label//following-sibling::textarea";
    private String labelText;
    private WebDriver driver;

    public TextArea(WebDriver driver, String labelText) {
        this.driver = driver;
        this.labelText = labelText;

    }

    public void inputTextArea(String text) {
        String finalXpath = String.format(TEXTAREA_XPATH, labelText);
        driver.findElement(By.xpath(finalXpath)).sendKeys(text);

    }
}
