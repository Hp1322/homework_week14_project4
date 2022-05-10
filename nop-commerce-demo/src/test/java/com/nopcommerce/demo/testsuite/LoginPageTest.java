package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(priority = 3,groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        softAssert.assertEquals(loginPage.getWelcomeText(), "Welcome, Please Sign In!", "not navigate to welcome page");
        softAssert.assertAll();
    }

    @Test(priority = 2,groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        loginPage.enterEmail("Kan@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        softAssert.assertEquals(loginPage.getErrorMessageText(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found","Not navigate to login page");
        softAssert.assertAll();
    }
    @Test(priority = 0,groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        loginPage.enterEmail("Kd@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        softAssert.assertEquals(homePage.getLogOutText(),"Log out","Not navigate to log out page");
        softAssert.assertAll();
    }
    @Test(priority = 1,groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnLoginLink();
        loginPage.enterEmail("Kd@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogoutButton();
        softAssert.assertEquals(homePage.getLogInText(),"Log in","Not navigate to log out page");
        softAssert.assertAll();
    }
}
