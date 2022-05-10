package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends TestBase {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnRegisterLink();
        softAssert.assertEquals(registerPage.getRegisterText(), "Register", "Not navigate to register page");
        softAssert.assertAll();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnRegisterLink();
        registerPage.clickOnRegisterButton();
        softAssert.assertEquals(registerPage.getFirstNameText(), "First name is required.", "First name is missing");
        softAssert.assertEquals(registerPage.getLastNameText(), "Last name is required.", "Last name is missing");
        softAssert.assertEquals(registerPage.getEmailText(), "Email is required.", "Email is missing");
        softAssert.assertEquals(registerPage.getPasswordText(), "Password is required.", "Password is missing");
        softAssert.assertEquals(registerPage.getConfirmPasswordText(), "Password is required.", "Password is missing");
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnRegisterLink();
        registerPage.clickOnFemaleButton();
        registerPage.sendFname("Kan");
        registerPage.sendLname("Pan");
        registerPage.selectDay("5");
        registerPage.selectMonth("May");
        registerPage.selectYear("1995");
        registerPage.sendEmailFill("Raju");
        registerPage.sendPassFill("123456");
        registerPage.sendConfirmPassFill("123456");
        registerPage.clickOnRegisterButton();
        softAssert.assertEquals(registerPage.getRegistrationCompletedText(),"Your registration completed","Not navigate to register completed page");
        softAssert.assertAll();
    }


}
