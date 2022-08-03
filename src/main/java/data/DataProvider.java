package data;

import utilities.PropertyManager;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "failedLogin")
    public Object[][] dataMethod() {
        return new Object[][]{
                {"", PropertyManager.getInstance().getValidPassword(), "Polje email je obavezno."},
                {PropertyManager.getInstance().getValidEmail(), "", "Polje lozinka je obavezno."},
        };

    }
}
