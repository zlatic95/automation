package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage{
    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }

    By dugmeDodajUKorpu = By.xpath("//button[@name='add_to_cart']");
    By ikonaKorpa = By.xpath("//div[@class='cart-badge-container has-text-white button is-text text-decoration-none']//i");
    By optionZeroForRemoveItem = By.className("select");


    public void removeItemFromCart(){
        chooseSection("Lifestyle");
        chooseItem("Xiaomi Watch S1");
        clickButton(dugmeDodajUKorpu );
        clickButton(ikonaKorpa);
        compareItem("Xiaomi Watch S1 - Srebrna");
        selectFromDropDown(optionZeroForRemoveItem);

    }
}
