package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utills.BaseTest;
import utills.DriverFactory;
import utills.TestContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Log4j2
public class StepDef extends BaseTest {
    TestContext testContext;

    public StepDef(TestContext testContext){
        this.testContext=testContext;
        String browserName= System.getProperty("browser");
       testContext.setDriver(DriverFactory.createInstance(browserName));



    }
    //WebDriver driver;
    String url = "https:justdial.com";
    String name = "aakash";
    String phoneNo = "9123456789";
    Scenario scenario;

    @Before  //native dependency injection in cucumber
    public void setUp(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void cleanUp() {
        // driver.quit();
    }

    //Log in related Test
    @Given("User navigates to the application url  https:justdial.com")
    public void user_navigates_to_the_application_url_https_justdial_com() {
        //driver = new ChromeDriver();
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);

    }

   @When("User clicks on Sign up link at the top right corner of the application")
    public void user_clicks_on_sign_up_link_at_the_top_right_corner_of_the_application() {

       testContext.getDriver().findElement(By.id("h_login")).click();

    }
    @When("User enters name as {string} and Phone number as {string} and clicks on Submit Button as per given")
    public void user_enters_name_as_and_phone_number_as_and_clicks_on_submit_button_as_per_given(String string, String string2) {

        testContext.getDriver().findElement(By.id("lgn_name")).sendKeys(string);
        testContext.getDriver().findElement(By.id("lgn_mob")).sendKeys(string2);


    }


    @Then("User is displayed with the message as {string}")
    public void user_is_displayed_with_the_message_as(String string) {
        WebElement msg =testContext.getDriver().findElement(By.id("lgn_smtn"));
        String otpmsg= msg.getText();
        boolean expectedResult= msg.isDisplayed();
        Assert.assertEquals(expectedResult,true);
        System.out.println(string);
    }


    // sc2 User receives error msg


    @Given("User navigates to the application given url")
    public void user_navigates_to_the_application_given_url() {
        //driver = new ChromeDriver();
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);


    }
    @When("User clicks on Login-in link at the top right corner of that application")
    public void user_clicks_on_login_in_link_at_the_top_right_corner_of_that_application() {

        testContext.getDriver().findElement(By.id("h_login")).click();
    }
    @When("User enters name as {string} and Phone number as {string} and then clicks on Submit Button")
    public void user_enters_name_as_and_phone_number_as_and_then_clicks_on_submit_button(String string, String string2) {
        testContext.getDriver().findElement(By.id("lgn_name")).sendKeys(string);
        testContext.getDriver().findElement(By.id("lgn_mob")).sendKeys(string2);
        testContext.getDriver().findElement(By.id("lgn_smtn")).click();
    }
    @Then("User gets error message as per {string}")
    public void user_gets_error_message_as_per(String string) {

            WebElement msg =testContext.getDriver().findElement(By.id("iup"));
            String otpmsg= msg.getText();
            boolean expectedResult= msg.isDisplayed();
            Assert.assertEquals(expectedResult,true);
            System.out.println(string);

    }
//User receives an error
@Given("User navigates to the application")
public void user_navigates_to_the_application() {
    //driver = new ChromeDriver();
    testContext.getDriver().manage().window().maximize();
    testContext.getDriver().manage().deleteAllCookies();
    testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    testContext.getDriver().get(url);


}
    @When("User clicks on Login-in link at the top right corner of the application url")
    public void user_clicks_on_login_in_link_at_the_top_right_corner_of_the_application_url() {
        testContext.getDriver().findElement(By.id("h_login")).click();
    }

    @When("User do not enter any name and phone number but clicks on Submit Button")
    public void user_do_not_enter_any_name_and_phone_number_but_clicks_on_submit_button() {
        testContext.getDriver().findElement(By.id("lgn_smtn")).click();

    }
    @Then("User gets error message as given {string}")
    public void user_gets_error_message_as_given(String string) {
        WebElement msg =testContext.getDriver().findElement(By.id("iup"));
        String otpmsg= msg.getText();
        boolean expectedResult= msg.isDisplayed();
        Assert.assertEquals(expectedResult,true);
        System.out.println(string);

    }
//User is able to enter only

    @Given("User navigates to the application url then")
    public void user_navigates_to_the_application_url_then() {
        //driver = new ChromeDriver();
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);


    }
    @When("User clicks on Login-in link at the top right corner of the application")
    public void user_clicks_on_login_in_link_at_the_top_right_corner_of_the_application() {
        testContext.getDriver().findElement(By.id("h_login")).click();
    }
    @Then("User is able to enter only {string} digits in the Mobile text field")
    public void user_is_able_to_enter_only_digits_in_the_mobile_text_field(String string) {
       String digit=testContext.getDriver().findElement(By.id("lgn_mob")).getAttribute("maxlength");
       Assert.assertEquals(digit,"10");
        System.out.println("The user can enter:"+string);

    }
//Sc5 User is able to

    @Given("User navigates to the application browser")
    public void user_navigates_to_the_application_browser() {
        //driver = new ChromeDriver();
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);
    }
    @When("User enters as {string} in search text box")
    public void user_enters_as_in_search_text_box(String string) {
        testContext.getDriver().findElement(By.id("srchbx")).sendKeys(string);

    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        testContext.getDriver().findElement(By.id("srIconwpr")).click();

    }
    @Then("User is able to see search result related to {string}")
    public void user_is_able_to_see_search_result_related_to(String string) {

        String titleActual = testContext.getDriver().getTitle();
        String expected="Restaurants in Nagpur - Justdial";
        Assert.assertEquals(expected,titleActual);


    }



    //sc 6 User is able to see drop down

    @Given("User navigates to the browser")
    public void user_navigates_to_the_browser() {
        //driver = new ChromeDriver();
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);
    }
    @When("User enters {string} in search text box as given")
    public void user_enters_in_search_text_box_as_given(String string) {
        testContext.getDriver().findElement(By.id("srchbx")).sendKeys(string);
    }

    @Then("User is able to see the drop down under search text box with all the items with text {string}")
    public void user_is_able_to_see_the_drop_down_under_search_text_box_with_all_the_items_with_text(String string) {
        List<WebElement> results = testContext.getDriver().findElements(By.xpath("/html/body"));
        for (int i = 0; i < results.size(); i++) {
            Assert.assertTrue(results.get(i).getText().contains(string), "Search result validation failed at instance [ + i + ].");
        }

    }
//User is able to navigate
    /*
@Given("User navigates to the application url as")
public void user_navigates_to_the_application_url_as() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get(url);
}
    @When("User clicks on {string}")
    public void user_clicks_on(String string) {

    }
    @Then("User is navigates to the corresponding link realted to {string}")
    public void user_is_navigates_to_the_corresponding_link_realted_to(String string) {

    }*/

//Sc8
@Given("User navigates to the application url as")
public void user_navigates_to_the_application_url_as() {
    //driver = new ChromeDriver();
    testContext.getDriver().manage().window().maximize();
    testContext.getDriver().manage().deleteAllCookies();
    testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    testContext.getDriver().get(url);
}

    @Given("User navigates to Customer care page by clicking on Customer Care tab at the right-mid of the page")
    public void user_navigates_to_customer_care_page_by_clicking_on_customer_care_tab_at_the_right_mid_of_the_page() {
        testContext.getDriver().findElement(By.xpath("/html/body/div[10]/a[2]")).click();
    }
    @When("User enter {string} in the Text box")
    public void user_enter_in_the_text_box(String string) {
        testContext.getDriver().findElement(By.id("what")).sendKeys(string);
    }
    @Then("User is able to see the drop down and all the items in the list must have text as {string}")
    public void user_is_able_to_see_the_drop_down_and_all_the_items_in_the_list_must_have_text_as(String string) {


          List<WebElement> results = testContext.getDriver().findElements(By.id("main-wrapper"));
        for (int i = 0; i < results.size(); i++) {
            Assert.assertTrue(results.get(i).getText().contains(string), "Search result validation failed at instance [ + i + ].");
        }
    }








}
