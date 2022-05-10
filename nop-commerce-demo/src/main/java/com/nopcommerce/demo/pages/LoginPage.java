package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;

    public void enterEmail(String mail){
        Reporter.log("Enter email "+mail+ " to email field "+emailField.toString() + "<br>");
        sendTextToElement(emailField, mail);
    }
    public void enterPassword(String pass){
        Reporter.log("Enter Password "+pass+ " to email field "+passwordField.toString() + "<br>");
        sendTextToElement(passwordField, pass);
    }
    public void clickOnLoginButton(){
        Reporter.log("Clicking on loginButton "+ loginButton.toString()+ "<br>");
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        Reporter.log("getting welcome Text from "+welcomeText.toString()+"<br>");
        return getTextFromElement(welcomeText);
    }
    public String getErrorMessageText(){
        Reporter.log("getting errorMessage from "+errorMessage.toString()+"<br>");
        return getTextFromElement(errorMessage);
    }

}
