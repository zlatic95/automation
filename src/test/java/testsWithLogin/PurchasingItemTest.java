package testsWithLogin;
import org.testng.annotations.Test;
import pages.PurchasingPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class PurchasingItemTest extends BaseTestWithLogin{

    @Test
    public void purchasingItemTest(){
        PurchasingPage purchasingPage = new PurchasingPage(driver);
        VerificationPage verificationPage = new VerificationPage(driver);
        purchasingPage.purchasingSetup(PropertyManager.getInstance().getFirstName(),PropertyManager.getInstance().getLastName(),
                PropertyManager.getInstance().getAddress(),PropertyManager.getInstance().getCity(),
                PropertyManager.getInstance().getPostalCode());
        verificationPage.verifyFinishedPurchase("IZNOS ZA PLAĆANJE");
    }

}
