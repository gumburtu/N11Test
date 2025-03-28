package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPageCucumber {
    private WebDriver driver;

    @FindBy(name = "username")
    private WebElement userNameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    @FindBy(className = "post-title")
    private WebElement successMessage;

    // Constructor with AjaxElementLocatorFactory for implicit wait
    public LoginPageCucumber(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    // Set username with clear() and sendKeys()
    public void setUsername(String username) {
        userNameInput.clear();
        userNameInput.sendKeys(username);
    }

    // Set password with clear() and sendKeys()
    public void setPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    // Click button with wait
    public void clickButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    // Assert success message with detailed error message
    public void assertToSuccessMessage() {
        Assert.assertTrue(successMessage.isDisplayed(), "Success message is NOT displayed!");
    }

    // Get success message text
    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
