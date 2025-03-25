package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage extends BaseTest {
    private final WebDriver driver;
    private final By searchBoxLocator = By.id("searchData");
    private final By basketTotalNumberLocator = By.id("basketTotalNum");

    public TabBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String searchWord) {
        driver.findElement(searchBoxLocator).sendKeys(searchWord + Keys.ENTER);
    }

    public String getBasketTotalNumber() {
        return driver.findElement(basketTotalNumberLocator).getText();
    }

}
