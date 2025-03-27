package pages;

import com.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TabBarPage extends BasePage {

    @FindBy(id = "searchData")
    private WebElement searchBox;


    @FindBy(className = "basketTotalNum")
    private WebElement basketTotalNum;

    public TabBarPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void search(String searchWord) {
        searchBox.sendKeys(searchWord + Keys.ENTER);
    }

    public String getBasketTotalNumber() {
        return basketTotalNum.getText();
    }
}
