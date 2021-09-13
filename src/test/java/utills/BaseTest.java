package utills;

import org.testng.Assert;

import java.util.Properties;

public class BaseTest {
    protected String url;
    protected String name;
    protected String phoneNo;

    public BaseTest() {
        readProperties();
    }

    public void readProperties() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
            this.url = (String) properties.get("url");
            this.name = (String) properties.get("user_name");
            this.phoneNo = (String) properties.get("phone_No");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("Config.properties file not found");
        }


    }
}
