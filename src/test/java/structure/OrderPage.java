package structure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private WebDriver driver;

    private final By firstNameInput = By.xpath(".//input[@placeholder = '* Имя']");
    private final By lastNameInput = By.xpath(".//input[@placeholder = '* Фамилия']");
    private final By addressInput = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By subwayStationInput = By.xpath(".//input[@placeholder = '* Станция метро']");
    private final By phoneNumberInput = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private final By nextButton = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sendKeysFirstNameInput() {
        driver.findElement(firstNameInput).sendKeys();
    }

    public void sendKeysLastNameInput() {
        driver.findElement(lastNameInput).sendKeys();
    }

    public void sendKeysAddressInput() {
        driver.findElement(addressInput).sendKeys();
    }

    public void sendKeysSubwayStationInput() {
        driver.findElement(subwayStationInput).sendKeys();
    }

    public void sendKeysPhoneNumberInput() {
        driver.findElement(phoneNumberInput).sendKeys();
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }
}


