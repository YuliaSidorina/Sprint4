package structure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private final By orderTopButton = By.xpath("//button[@class='Button_Button__ra12g']");
    private final By orderBottomButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOrderTopButton() {
        driver.findElement(orderTopButton).click();
    }

    public void clickOrderBottomButton() {
        driver.findElement(orderBottomButton).click();
    }
}
