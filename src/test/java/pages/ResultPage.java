package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BasePage {

    @FindBy(className = "resultText")
    private WebElement resultText;

    @FindBy(className = "productName")
    private WebElement productName;

    public ResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement getResultWebElement() {
        return resultText;
    }

    public void clickFirstProduct() {
        productName.click();
    }
}
