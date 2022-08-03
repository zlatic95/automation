package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithValidCredentialsTest extends BaseTest{

    @Test
    public void validLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        loginPage.loginSetupWithValidCredentials(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
        verificationPage.verifyLoginWithValidCredentials("Vaš nalog");
    }
}
