package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.UserLoggedInPage;

public class UserLoggedInPageMethods extends UserLoggedInPage {
    public UserLoggedInPageMethods(WebDriver driver) {
        super(driver);
    }

    By mojNalogDugme = By.xpath("//div[@class='dropdown is-hoverable has-text-white button is-text text-decoration-none']");
    By odjaviSeDugme = By.xpath("//a[@class='dropdown-item'][4]");

    public void userLoggedIn(){
        clickButton(mojNalogDugme);
        clickButton(odjaviSeDugme);


    }
}
