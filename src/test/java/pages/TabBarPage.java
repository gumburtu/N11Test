package pages;

import com.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage extends BasePage {

    private final By searchBoxLocator = By.id("searchData");
    private final By basketTotalNumberLocator = By.id("basketTotalNum");

    public TabBarPage(WebDriver driver) {
        super(driver);
    }

    public void search(String searchWord) {
        find(searchBoxLocator).sendKeys(searchWord + Keys.ENTER);
    }

    public String getBasketTotalNumber() {
        return find(basketTotalNumberLocator).getText();
    }
}
