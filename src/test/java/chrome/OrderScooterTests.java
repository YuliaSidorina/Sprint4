package chrome;

import org.junit.Assert;
import org.junit.Test;
import pageobject.OrderPage;

public class OrderScooterTests extends BaseTest {

    @Test
    public void OrderScooterPositiveTopButtonTest() {

        OrderPage orderPage = new OrderPage(driver);
        orderPage
                .clickOrderTopButton()
                .inputName("Юлия")
                .inputLastName("Сидорина")
                .inputAddress("Академика Янгеля 8 398")
                .inputSubwayStation("Пражская")
                .inputPhone("89160554547")
                .clickNextButton()
                .inputDate("30.12.2023")
                .selectRentalPeriodOneDay()
                .selectColor()
                .inputCourierComment("")
                .confirmOrder();

        Assert.assertTrue(orderPage.isOrderSuccessful());
    }

    @Test
    public void OrderScooterPositiveBottomButtonTest() {

        OrderPage orderPage = new OrderPage(driver);
        orderPage
                .scroll()
                .clickOrderBottomButton()
                .inputName("Иван")
                .inputLastName("Иванов")
                .inputAddress("Тимура Фрунзе 1")
                .inputSubwayStation("Парк Культуры")
                .inputPhone("89160000000")
                .clickNextButton()
                .inputDate("30.11.2023")
                .selectRentalPeriodThreeDays()
                .selectColor()
                .inputCourierComment("")
                .confirmOrder();

        Assert.assertTrue(orderPage.isOrderSuccessful());
    }

    @Test
    public void OrderScooterWrongNumberTopButtonTest() {

        OrderPage orderPage = new OrderPage(driver);
        orderPage
                .clickOrderTopButton()
                .inputName("Юлия")
                .inputLastName("Сидорина")
                .inputAddress("Академика Янгеля 8 398")
                .inputSubwayStation("Пражская")
                .inputPhone("111")
                .clickNextButton()
                .inputDate("30.11.2023")
                .selectRentalPeriodTwoDays()
                .selectColor()
                .inputCourierComment("")
                .confirmOrder();

        Assert.assertTrue(orderPage.isOrderSuccessful());
    }
}
