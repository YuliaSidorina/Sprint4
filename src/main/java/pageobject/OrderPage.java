package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static pageobject.HomePage.ORDER_TOP_BUTTON;
import static pageobject.HomePage.ORDER_BOTTOM_BUTTON;

public class OrderPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    public static final String NAME = ".//input[@placeholder = '* Имя']";
    public static final String LAST_NAME = ".//input[@placeholder = '* Фамилия']";
    public static final String ADDRESS = ".//input[@placeholder = '* Адрес: куда привезти заказ']";
    public static final String SUBWAY_STATION = ".//input[@placeholder = '* Станция метро']";
    public static final String PHONE = ".//input[@placeholder = '* Телефон: на него позвонит курьер']";
    public static final String NEXT_BUTTON = ".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']";
    public static final String DATE = ".//input[@placeholder = '* Когда привезти самокат']";
    public static final String RENTAL_PERIOD = ".//div[@class = 'Dropdown-control']";
    public static final String RENTAL_PERIOD_ONE_DAY = ".//div[text() = 'сутки']";
    public static final String RENTAL_PERIOD_TWO_DAYS = ".//div[text() = 'двое суток']";
    public static final String RENTAL_PERIOD_THREE_DAYS = ".//div[text() = 'трое суток']";
    public static final String COLOUR_BLACK_LABEL = ".//input[@class = 'Checkbox_Input__14A2w']";
    public static final String COURIER_COMMENT = ".//input[@placeholder = 'Комментарий для курьера']";
    public static final String CONFIRM_BUTTON = ".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']";
    public static final String SUCCESS = ".//div[text() = 'Заказ оформлен']";

    public OrderPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public OrderPage clickOrderBottomButton() {
        driver.findElement(By.xpath(ORDER_BOTTOM_BUTTON)).click();
        return this;
    }

    public OrderPage clickOrderTopButton() {
        driver.findElement(By.xpath(ORDER_TOP_BUTTON)).click();
        return this;
    }

    public OrderPage scroll() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        return this;
    }

    public OrderPage inputName(String name) {
        driver.findElement(By.xpath(NAME)).sendKeys(name);
        return this;
    }

    public OrderPage inputLastName(String lastName) {
        driver.findElement(By.xpath(LAST_NAME)).sendKeys(lastName);
        return this;
    }

    public OrderPage inputAddress(String address) {
        driver.findElement(By.xpath(ADDRESS)).sendKeys(address);
        return this;
    }

    public OrderPage inputSubwayStation(String subwayStation) {
        driver.findElement(By.xpath(SUBWAY_STATION)).sendKeys(subwayStation);
        driver.findElement(By.xpath(SUBWAY_STATION)).sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }

    public OrderPage inputPhone(String phone) {
        driver.findElement(By.xpath(PHONE)).sendKeys(phone);
        return this;
    }

    public OrderPage inputDate(String date) {
        driver.findElement(By.xpath(DATE)).sendKeys(date);
        driver.findElement(By.xpath(DATE)).sendKeys(Keys.ENTER);
        return this;
    }

    public OrderPage selectRentalPeriodOneDay() {
        driver.findElement(By.xpath(RENTAL_PERIOD)).click();
        driver.findElement(By.xpath(RENTAL_PERIOD_ONE_DAY)).click();
        return this;
    }

    public OrderPage selectRentalPeriodTwoDays() {
        driver.findElement(By.xpath(RENTAL_PERIOD)).click();
        driver.findElement(By.xpath(RENTAL_PERIOD_TWO_DAYS)).click();
        return this;
    }

    public OrderPage selectRentalPeriodThreeDays() {
        driver.findElement(By.xpath(RENTAL_PERIOD)).click();
        driver.findElement(By.xpath(RENTAL_PERIOD_THREE_DAYS)).click();
        return this;
    }

    public OrderPage selectColor() {
        driver.findElement(By.xpath(COLOUR_BLACK_LABEL)).click();
        return this;
    }

    public OrderPage inputCourierComment(String orderDate) {
        driver.findElement(By.xpath(COURIER_COMMENT)).sendKeys(orderDate);
        return this;
    }

    public OrderPage clickNextButton() {
        driver.findElement(By.xpath(NEXT_BUTTON)).click();
        return this;
    }

    public void confirmOrder() {
        By.xpath(CONFIRM_BUTTON).findElement(driver).click();
    }

    public boolean isOrderSuccessful() {
        By successMessage = By.xpath(SUCCESS);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
            return true;
        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        }
    }
}