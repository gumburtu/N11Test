package com;

import org.testng.annotations.Test;
import pages.LoginPage;

public class N11LoginTest extends BaseTest {
    LoginPage loginPage;

    @Test
    public void loginTest() {
        driver.get("https://www.n11.com/giris-yap");
        loginPage = new LoginPage(driver);
        loginPage.typeMail("ali@gmail.com");
        loginPage.typePassword("123456");
        loginPage.clickButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        softAssert.assertTrue(loginPage.getErrorMessage().isDisplayed());
    }
}
