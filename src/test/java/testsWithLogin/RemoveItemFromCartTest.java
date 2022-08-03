package testsWithLogin;

import methods.UserLoggedInPageMethods;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class RemoveItemFromCartTest extends BaseTestWithLogin{

    @Test
    public void removeItemFromCartTest(){
        UserLoggedInPageMethods userLoggedInPageMethods = new UserLoggedInPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        userLoggedInPageMethods.removeItemFromCart();
        verificationPage.verifyRemovingItemFromCart("U vašoj korpi nema predmeta.");

    }
}
