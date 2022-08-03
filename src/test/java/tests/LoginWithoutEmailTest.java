package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithoutEmailTest extends BaseTest{

    @Test
    public void noEmailLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        loginPage.loginSetupForBlankEmailField(PropertyManager.getInstance().getValidPassword());
        verificationPage.verifyInvalidLoginWithNoEmail("Polje email je obavezno.");
    }
}
