package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage{
    public VerificationPage(WebDriver driver) {
        super(driver);
    }
    By errorMessage = By.xpath("//p[@class='help is-danger']");
    By noPasswordErrorMessage = By.xpath("//p[@class='help is-danger']");
    By wrongCredentialsErrorMessage = By.xpath("//p[@class='help is-danger']");
    By stranicaVasNalog = By.xpath("//h1[@class='subtitle']");
    By dugmePrijaviSe = By.xpath("//a[@class='button is-text text-decoration-none has-text-white']");
    By messageForEmptyCart = By.xpath("//div[@class='column shop-cart-left-col is-8-desktop is-7-tablet']//p[text()='U vašoj korpi nema predmeta.']");
    By krajnjaPorukaIznosZaPlacanje = By.xpath("//p[@class='pg-order-amount-title']");
    public void verifyInvalidLoginWithNoEmail(String expectedText){
        assertEquals(readText(errorMessage), expectedText);
    }
    public void verifyInvalidLoginWithNoPassword(String expectedText){
        assertEquals(readText(noPasswordErrorMessage),expectedText);
    }
    public void verifyInvalicLoginWithWrongCredentials(String expectedText){
        assertEquals(readText(wrongCredentialsErrorMessage), expectedText);
    }
    public void verifyLoginWithValidCredentials(String expectedText){
        assertEquals(readText(stranicaVasNalog), expectedText);
    }
    public void verifyLogout(String expectedText){
        assertEquals(readText(dugmePrijaviSe), expectedText);
    }
    public void verifyRemovingItemFromCart(String expectedText){
        assertEquals(readText(messageForEmptyCart), expectedText);
    }
    public void verifyFinishedPurchase(String expectedText){
        assertEquals(readText(krajnjaPorukaIznosZaPlacanje), expectedText);
    }
    public void verifyFailedLogin(String expectedText){
        assertEquals(readText(errorMessage), expectedText);

    }


}
