package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }
    public void waitForVisibility(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void clickButton(By element){
        waitForVisibility(element);
        int counter = 0;
        while (counter<5){
        try {
            driver.findElement(element).click();
            break;

        }catch (Exception e){

        }
        counter++;}
    }
    public void writeText(By element, String text){
        waitForVisibility(element);
        driver.findElement(element).sendKeys(text);
    }
    public String readText(By element){
        waitForVisibility(element);
        return driver.findElement(element).getText();
    }
    public void assertEquals(String actualText, String expectedText){
        Assert.assertEquals(actualText, expectedText);
    }
    public void selectFromDropDown(By element){
        Select dropdown = new Select(driver.findElement(element));
        dropdown.selectByValue("0");
    }
    public boolean isElementVisible(By element){
        boolean isVisible = true;
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
        }
        catch (Exception e){
            isVisible = false;
        }
        return isVisible;
    }
    public void clearField(By element){
       waitForVisibility(element);
       driver.findElement(element).sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
    }

    public void compareItem(String productName){
        String purchasedItem = driver.findElement(By.xpath("//div[@class='ci-product-name']//a")).getText();
        Assert.assertEquals(purchasedItem, productName, "Product name does not match");
    }
    public void chooseItem(String itemName){
        By miWatchProduct = By.xpath("//div[@class='category-products']//div[@class='column is-one-quarter-desktop is-half-mobile']//img[@alt='" + itemName + "']");
        clickButton(miWatchProduct);
    }
    public void chooseSection(String choseSectionName){
        By productSection = By.xpath("//div[@class='header']//div[@id='mainnav']//a[normalize-space()='" + choseSectionName + "']");
        clickButton(productSection);
    }
}
