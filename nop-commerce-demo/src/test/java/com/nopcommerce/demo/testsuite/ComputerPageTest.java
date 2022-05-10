package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

import java.awt.*;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    }

    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnComputerLink();
        softAssert.assertEquals(computerPage.getComputerText(), "Computers", "Not navigate to computer page ");
        softAssert.assertAll();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        SoftAssert softAssert = new SoftAssert();
        homePage.clickOnComputerLink();
        computerPage.clickOnDeskTopLink();
        softAssert.assertEquals(desktopsPage.getDesktopText(), "Desktops", "Not navigate to desktop page ");
        softAssert.assertAll();
    }

    @Test(dataProvider = "computerBuild",dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
        homePage.clickOnComputerLink();
        computerPage.clickOnDeskTopLink();
        buildYourOwnComputerPage.clickOnBuildComputerLink();
        buildYourOwnComputerPage.selectProcessor(processor);
        buildYourOwnComputerPage.selectRam(ram);
        buildYourOwnComputerPage.selectHddButton(hdd);
        buildYourOwnComputerPage.selectOs(os);
        buildYourOwnComputerPage.selectSoftware(software);
        buildYourOwnComputerPage.clickOnAddToCartButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(buildYourOwnComputerPage.getGreenText(),"The product has been added to your shopping cart","Product is not added to cart");
        softAssert.assertAll();


    }

}
