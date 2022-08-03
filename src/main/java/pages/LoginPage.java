package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By dugmePrijaviSe = By.xpath("//a[@class='button is-text text-decoration-none has-text-white']");
    By poljeLozinka = By.xpath("//input[@type='password']");
    By poljeEmail = By.xpath("//input[@name='login_email']");
    By poljePrijaviteSe = By.xpath("//button[@name='sign_in']");

    public void loginSetupForBlankEmailField(String password){
        clickButton(dugmePrijaviSe);
        writeText(poljeLozinka, password);
        clickButton(poljePrijaviteSe);
    }
    public void loginSetupForBlankPasswordField(String email){
        clickButton(dugmePrijaviSe);
        writeText(poljeEmail, email);
        clickButton(poljePrijaviteSe);
    }
    public void loginSetupWithWrongCredentials(String email, String password){
        clickButton(dugmePrijaviSe);
        writeText(poljeEmail, email);
        writeText(poljeLozinka, password);
        clickButton(poljePrijaviteSe);
    }
    public void loginSetupWithValidCredentials(String email, String password){
        clickButton(dugmePrijaviSe);
        writeText(poljeEmail, email);
        writeText(poljeLozinka, password);
        clickButton(poljePrijaviteSe);
    }
    public void clickOnLoginButton(){
        clickButton(dugmePrijaviSe);
    }
    public void writeTextInEmailField(String email){
        writeText(poljeEmail, email);
    }
    public void writeTextInPasswordField(String password){
        writeText(poljeLozinka, password);
    }
    public void clickOnPrijaviteSe(){
        clickButton(poljePrijaviteSe);
    }

}
