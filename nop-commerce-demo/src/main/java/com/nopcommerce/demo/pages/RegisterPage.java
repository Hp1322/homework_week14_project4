package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.sql.Timestamp;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleButton;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleButton;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement fName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lName;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dayBox;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement monthBox;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yearBox;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailFill;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passFill;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassFill;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameText;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameText;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailText;

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordText;

    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement passwordText1;

    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registrationCompletedText;

    @FindBy(xpath = "///a[text()='Continue']")
    WebElement continueButton;


    public String getRegistrationCompletedText(){
        Reporter.log("getting registrationCompleted Text from "+registrationCompletedText.toString()+"<br>");
        return getTextFromElement(registrationCompletedText);
    }
    public void clickOnContinueButton(){
        Reporter.log("Clicking on continueButton "+ continueButton.toString()+ "<br>");
        clickOnElement(continueButton);
    }



    public String getRegisterText() {
        Reporter.log("getting register Text from "+registerText.toString()+"<br>");
        return getTextFromElement(registerText);
    }
    public void clickOnMaleButton(){
        Reporter.log("Clicking on maleButton "+ maleButton.toString()+ "<br>");
        clickOnElement(maleButton);
    }
    public void clickOnFemaleButton(){
        Reporter.log("Clicking on femaleButton "+ femaleButton.toString()+ "<br>");
        clickOnElement(femaleButton);
    }

    public void sendFname(String fnn) {
        Reporter.log("Enter first name "+fnn+ " to first name field "+fName.toString() + "<br>");
        sendTextToElement(fName, fnn);
    }

    public void sendLname(String lnn) {
        Reporter.log("Enter last name "+lnn+ " to last name field "+lName.toString() + "<br>");
        sendTextToElement(lName, lnn);
    }


    public void sendEmailFill(String text) {
        Reporter.log("Enter email "+text+ " to email field "+emailFill.toString() + "<br>");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String emailAddress = text + timestamp.getTime() / 10000 + "@domain.com";
        sendTextToElement(emailFill, emailAddress);
    }

    public void selectDay(String day){
        Reporter.log("Selecting day "+day+" from dropdown "+dayBox.toString() + "<br>");
        selectByVisibleTextFromDropDown(dayBox, day);
    }
    public void selectMonth(String month){
        Reporter.log("Selecting month "+month+" from dropdown "+monthBox.toString() + "<br>");
        selectByVisibleTextFromDropDown(monthBox, month);
    }
    public void selectYear(String year){
        Reporter.log("Selecting year "+year+" from dropdown "+yearBox.toString() + "<br>");
        selectByVisibleTextFromDropDown(yearBox, year);
    }


    public void sendPassFill(String pass) {
        Reporter.log("Enter password "+pass+ " to password field "+passFill.toString() + "<br>");
        sendTextToElement(passFill, pass);
    }

    public void sendConfirmPassFill(String repass) {
        Reporter.log("Enter confirm Password "+repass+ " to email field "+confirmPassFill.toString() + "<br>");
        sendTextToElement(confirmPassFill, repass);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Clicking on registerButton "+ registerButton.toString()+ "<br>");
        clickOnElement(registerButton);
    }
    public String getFirstNameText() {
        Reporter.log("getting firstName Text from "+firstNameText.toString()+"<br>");
        return getTextFromElement(firstNameText);
    }
    public String getLastNameText() {
        Reporter.log("getting lastName Text from "+lastNameText.toString()+"<br>");
        return getTextFromElement(lastNameText);
    }
    public String getEmailText() {
        Reporter.log("getting email Text from "+emailText.toString()+"<br>");
        return getTextFromElement(emailText);
    }
    public String getPasswordText() {
        Reporter.log("getting password Text from "+passwordText.toString()+"<br>");
        return getTextFromElement(passwordText);
    }
    public String getConfirmPasswordText() {
        Reporter.log("getting password Text1 from "+passwordText1.toString()+"<br>");
        return getTextFromElement(passwordText1);
    }



}
