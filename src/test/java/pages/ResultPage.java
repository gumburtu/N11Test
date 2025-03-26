package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage{
    WebDriver driver;
    By resultTextLocator = By.className("resultText");
    By productNameLocator = By.className("productName");

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultWebElement() {
        return driver.findElement(resultTextLocator);
    }

    public void clickFirstProduct() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", driver.findElement(productNameLocator));
        driver.findElement(productNameLocator).click();
    }
}
