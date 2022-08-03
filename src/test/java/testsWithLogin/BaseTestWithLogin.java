package testsWithLogin;

import io.github.bonigarcia.wdm.WebDriverManager;
import methods.LoginPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.PropertyManager;

public class BaseTestWithLogin{

    protected WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--start-maximized").addArguments("--disable-notifications"));
        driver.get("https://mi-srbija.rs/");

        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        loginPageMethods.login(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
    }
    /*public void firefoxSetup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(new FirefoxOptions().addArguments("--disable-notifications"));
        driver.manage().window().maximize();
        driver.get("https://mi-srbija.rs/");

        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        loginPageMethods.login(PropertyManager.getInstance().getValidEmail(), PropertyManager.getInstance().getValidPassword());
    }*/

    @AfterMethod
    public void teardown() {
        driver.quit();

    }

}
