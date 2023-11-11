package pageobject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;
    public static final String ORDER_TOP_BUTTON = ".//button[@class = 'Button_Button__ra12g']";
    public static final String ORDER_BOTTOM_BUTTON = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void scroll() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public void clickQuestion(String questionText) {
        String questionLocator = ".//div[contains(text(), '" + questionText + "')]";
        driver.findElement(By.xpath(questionLocator)).click();
    }

    public boolean isAnswerDisplayed(String answerText) {
        String answerLocator = ".//p[contains(text(), '" + answerText + "')]";
        try {
            driver.findElement(By.xpath(answerLocator));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
