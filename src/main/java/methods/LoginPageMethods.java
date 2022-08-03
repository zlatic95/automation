package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginPageMethods extends LoginPage {
    public LoginPageMethods(WebDriver driver) {
        super(driver);
    }
    public void login (String email, String password){
        clickOnLoginButton();
        writeTextInEmailField(email);
        writeTextInPasswordField(password);
        clickOnPrijaviteSe();

    }
}
