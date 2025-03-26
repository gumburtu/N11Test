package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    WebDriver driver;
    By addToBasketLocator = By.className("addBasketUnify");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        find(addToBasketLocator).click();
    }
}
