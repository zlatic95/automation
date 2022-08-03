package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithoutPasswordTest extends BaseTest{

    @Test
    public void noPasswordLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        loginPage.loginSetupForBlankPasswordField(PropertyManager.getInstance().getValidEmail());
        verificationPage.verifyInvalidLoginWithNoPassword("Polje lozinka je obavezno.");
    }
}
