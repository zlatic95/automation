package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String configPath = "src/main/resources/configuration.properties";
    private static PropertyManager instance;
    private static String validEmail;
    private static String validPassword;
    private static String invalidEmail;
    private static String invalidPassword;
    private static String firstName;
    private static String lastName;
    private static String address;
    private static String city;
    private static String postalCode;


    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
            instance.loadData();

        }
        return instance;
    }

    public void loadData() {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(configPath);
            properties.load(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

        validEmail = properties.getProperty("validEmail");
        validPassword = properties.getProperty("validPassword");
        invalidEmail = properties.getProperty("invalidEmail");
        invalidPassword = properties.getProperty("invalidPassword");
        firstName = properties.getProperty("firstName");
        lastName = properties.getProperty("lastName");
        address = properties.getProperty("address");
        city = properties.getProperty("city");
        postalCode = properties.getProperty("postalCode");
    }
    public String getValidEmail(){
        return validEmail;
    }
    public String getValidPassword(){
        return validPassword;
    }
    public String getInvalidEmail(){
        return invalidEmail;
    }
    public String getInvalidPassword(){
        return invalidPassword;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getPostalCode(){
        return postalCode;
    }


}
