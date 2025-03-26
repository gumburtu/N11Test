package com;

import pages.ProductDetailPage;
import pages.ResultPage;
import pages.TabBarPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class N11Test extends BaseTest {

    TabBarPage tabBarPage;
    ResultPage resultPage;
    ProductDetailPage productDetailPage;

    @Test(priority = 1)
    public void searchTest() {
        tabBarPage = new TabBarPage(driver);
        tabBarPage.navigateTo("https://www.n11.com/");
        tabBarPage.search("Laptop");
    }

    @Test(priority = 2)
    public void resultPageTest() {
        resultPage = new ResultPage(driver);
        WebElement resultWebElement;
        resultWebElement = resultPage.getResultWebElement();
        softAssert.assertTrue(resultWebElement.isDisplayed());
        resultPage.clickFirstProduct();
    }

    @Test(priority = 3)
    public void addToCart() {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.addToCart();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        softAssert.assertTrue(tabBarPage.getBasketTotalNumber().equals("1"));
    }
}