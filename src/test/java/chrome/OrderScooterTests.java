package chrome;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.openqa.selenium.Keys.ARROW_DOWN;
import static org.openqa.selenium.Keys.ENTER;


public class OrderScooterTests {

    @Test
    public void OrderScooterPositiveTopButtonTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Имя']")).sendKeys("Юлия");
        driver.findElement(By.xpath(".//input[@placeholder = '* Фамилия']")).sendKeys("Сидорина");
        driver.findElement(By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']")).sendKeys("Академика Янгеля 8 398");
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys("Пражская");
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys(ARROW_DOWN);
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys(ENTER);
        driver.findElement(By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']")).sendKeys("89160554547");
        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Когда привезти самокат']")).sendKeys("30.12.2023");
        driver.findElement(By.xpath(".//input[@placeholder = '* Когда привезти самокат']")).sendKeys(ENTER);
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-control']")).click();
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-option']")).click();
        driver.findElement(By.xpath(".//input[@class = 'Checkbox_Input__14A2w']")).click();
        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")).click();
        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")).click();

        driver.quit();
    }

    @Test
    public void OrderScooterPositiveBottomButtonTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        driver.findElement(By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Имя']")).sendKeys("Иван");
        driver.findElement(By.xpath(".//input[@placeholder = '* Фамилия']")).sendKeys("Иванов");
        driver.findElement(By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']")).sendKeys("Тимура Фрунзе 1");
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys("Парк Культуры");
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys(ARROW_DOWN);
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys(ENTER);
        driver.findElement(By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']")).sendKeys("89160000000");
        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Когда привезти самокат']")).sendKeys("30.11.2023");
        driver.findElement(By.xpath(".//input[@placeholder = '* Когда привезти самокат']")).sendKeys(ENTER);
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-control']")).click();
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-option']")).click();
        driver.findElement(By.xpath(".//input[@class = 'Checkbox_Input__14A2w']")).click();
        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")).click();
        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")).click();

        driver.quit();
    }

    @Test
    public void OrderScooterWrongNumberTopButtonTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Имя']")).sendKeys("Юлия");
        driver.findElement(By.xpath(".//input[@placeholder = '* Фамилия']")).sendKeys("Сидорина");
        driver.findElement(By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']")).sendKeys("Академика Янгеля 8 398");
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).click();
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys("Пражская");
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys(ARROW_DOWN);
        driver.findElement(By.xpath(".//input[@placeholder = '* Станция метро']")).sendKeys(ENTER);
        driver.findElement(By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']")).sendKeys("111");
        driver.findElement(By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']")).click();

        driver.quit();
    }
}