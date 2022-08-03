package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasingPage extends BasePage{
    public PurchasingPage(WebDriver driver) {
        super(driver);
    }


    By dugmeDodajUKorpu = By.xpath("//button[@name='add_to_cart']");
    By ikonaKorpa = By.xpath("//div[@class='cart-badge-container has-text-white button is-text text-decoration-none']//i");
    By dugmePredjiteNaNaplatu = By.xpath("//button[@name='to_checkout']");
    By dugmeDodajteNovuAdresu = By.xpath("//button[@type='button']");
    By poljeIme = By.xpath("//input[@name='first_name']");
    By poljePrezime = By.xpath("//input[@name='last_name']");
    By poljeAdresa = By.xpath("//input[@name='address1']");
    By poljeGrad = By.xpath("//input[@name='city']");
    By poljePostanskiBroj = By.xpath("//input[@name='postcode']");
    By dugmeSnimi = By.xpath("//button[@class='button is-primary is-fullwidth is-large']");
    By radioDugmePlacanjeKarticom = By.xpath("//div[text()='Plaćanje karticom']");
    By checkBoxPrihvatamPolitiku = By.xpath("//div[@class='cart-accept-tos mt-6 mb-6']//span[@class='check']");
    By dugmeIzvrsiPlacanje = By.xpath("//button[@type='button']");
    By dugmeZaPromenuPodataka = By.xpath("//button[@name='edit_delivery_address']");
    By dugmeIzmeniPodatke = By.xpath("//a[normalize-space()='Izmeni']");
    By imeIPrezimeUSekcijiZaIsporuku = By.xpath("//div[@class='address-data']//p[text()='markmarkmark marmarkmark']");


    public void purchasingSetup(String ime, String prezime, String adresa, String grad, String postanskiBroj){ //Uko
        chooseSection("Lifestyle");
        chooseItem("Xiaomi Watch S1");
        clickButton(dugmeDodajUKorpu);
        clickButton(ikonaKorpa);
        compareItem("Xiaomi Watch S1 - Srebrna");
        clickButton(dugmePredjiteNaNaplatu);
        if (isElementVisible(imeIPrezimeUSekcijiZaIsporuku)){
            clickButton(dugmePredjiteNaNaplatu);
            clickButton(radioDugmePlacanjeKarticom);
            clickButton(checkBoxPrihvatamPolitiku);
            clickButton(dugmeIzvrsiPlacanje);
        }else {
            clickButton(dugmeZaPromenuPodataka);
            clickButton(dugmeIzmeniPodatke);
            clearField(poljeIme);
            writeText(poljeIme, ime);
            clearField(poljePrezime);
            writeText(poljePrezime, prezime);
            clearField(poljeAdresa);
            writeText(poljeAdresa, adresa);
            clearField(poljeGrad);
            writeText(poljeGrad, grad);
            clearField(poljePostanskiBroj);
            writeText(poljePostanskiBroj, postanskiBroj);
            clickButton(dugmeSnimi);
            clickButton(dugmePredjiteNaNaplatu);
            clickButton(radioDugmePlacanjeKarticom);
            clickButton(checkBoxPrihvatamPolitiku);
            clickButton(dugmeIzvrsiPlacanje);
        }

    }
}
