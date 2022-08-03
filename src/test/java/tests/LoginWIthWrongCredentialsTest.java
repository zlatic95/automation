package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWIthWrongCredentialsTest extends BaseTest{

    @Test
    public void invalidCredentialsTest(){
        LoginPage loginPage = new LoginPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        loginPage.loginSetupWithWrongCredentials(PropertyManager.getInstance().getInvalidEmail(), PropertyManager.getInstance().getInvalidPassword());
        verificationPage.verifyInvalicLoginWithWrongCredentials("Podaci ne odgovaraju ni jednom nalogu.");
    }
}
