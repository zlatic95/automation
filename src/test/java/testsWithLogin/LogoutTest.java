package testsWithLogin;

import methods.UserLoggedInPageMethods;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class LogoutTest extends BaseTestWithLogin{

    @Test
    public void logoutTest(){
        UserLoggedInPageMethods userLoggedInPageMethods = new UserLoggedInPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        userLoggedInPageMethods.userLoggedIn();
        verificationPage.verifyLogout("Prijavi se");

    }
}
