package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.LoginPageCucumber;
import utilities.MyDriver;

import java.time.Duration;

public class StepDefinitions {
    private static WebDriver driver;
    private LoginPageCucumber loginPageCucumber;

    public static final String LOGIN_URL = "https://practicetestautomation.com/practice-test-login/";
    public static final String HOMEPAGE_URL = "https://practicetestautomation.com/";

    @Before
    public void setUp() {
        driver = MyDriver.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPageCucumber = new LoginPageCucumber(driver);
    }

    @After
    public void tearDown() {
        MyDriver.closeDriver();
    }

    @Given("go to login page")
    public void go_to_login_page() {
        driver.get(LOGIN_URL);
    }

    @And("type username")
    public void type_username() {
        loginPageCucumber.setUsername("student");
    }

    @And("type password")
    public void type_password() {
        loginPageCucumber.setPassword("Password123");
    }

    @When("click button")
    public void click_button() {
        loginPageCucumber.clickButton();
    }

    @Then("assert to success message")
    public void assert_to_success_message() {
        loginPageCucumber.assertToSuccessMessage();
    }

    @And("user types username as {string}")
    public void userTypesUsernameAs(String username) {
        loginPageCucumber.setUsername(username);
    }

    @And("user types password as {string}")
    public void userTypesPasswordAs(String password) {
        loginPageCucumber.setPassword(password);
    }

    @Given("go to homepage")
    public void goToHomepage() {
        driver.get(HOMEPAGE_URL);
    }

    @When("wait two seconds")
    public void waitTwoSeconds() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("post-title")));
    }

    @Then("see {string} text")
    public void seeText(String text) {
        WebElement helloMessageWE = driver.findElement(By.className("post-title"));
        String helloMessage = helloMessageWE.getText();
        Assert.assertEquals(helloMessage, text, "Expected and actual messages do not match!");
    }

    @Given("setting driver")
    public void settingDriver() {

    }
}
