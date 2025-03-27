package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage extends BasePage {
    WebDriver driver;
    By addToBasketLocator = By.className("addBasketUnify");
    @FindBy(className = "addBasketUnify")
    private WebElement addBasketUnify;

    public ProductDetailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        addBasketUnify.click();
    }
}
