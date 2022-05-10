package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Register")
    WebElement registerLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computerLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement electronicsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement apparelLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement digitalLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement jewelryLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement gifCardsLink;

    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement nopCommerceLogo;

    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;

    @FindBy(linkText = "Log out")
    WebElement logOut;

    public void clickOnLoginLink(){
        Reporter.log("Clicking on loginLink "+ loginLink.toString()+ "<br>");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink(){
        Reporter.log("Clicking on registerLink "+ registerLink.toString()+ "<br>");
        clickOnElement(registerLink);
    }
    public void clickOnMyAccountLink(){
        Reporter.log("Clicking on myAccountLink "+ myAccountLink.toString()+ "<br>");
        clickOnElement(myAccountLink);
    }

    public String getLogOutText(){
        Reporter.log("getting logOut text "+logOut.toString()+"<br>");
       return getTextFromElement(logOut);
    }
    public void clickOnComputerLink(){
        Reporter.log("Clicking on computerLink "+ computerLink.toString()+ "<br>");
        clickOnElement(computerLink);
    }
    public void clickOnLogoutButton(){
        Reporter.log("Clicking on logOut "+ logOut.toString()+ "<br>");
        clickOnElement(logOut);
    }
    public String getLogInText(){
        Reporter.log("getting LogInText from "+loginLink.toString()+"<br>");
        return getTextFromElement(loginLink);
    }






}

