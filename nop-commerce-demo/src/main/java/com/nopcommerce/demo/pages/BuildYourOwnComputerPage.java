package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[@class='product-title']//a[text()='Build your own computer']")
    WebElement buildComputerText;

    @FindBy(xpath = "//select[@name='product_attribute_1']")
    WebElement processorDropDown;

    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement ramDropDown;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hddRadio320GB;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddRadio400GB;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osRadioVistaHome;

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osRadioVistaPremium;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMsOffice;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareAcrobatReader;

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommander;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement greenText;

    @FindBy(xpath = "//span[@class='close']")
    WebElement crossSign;

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildComputerLink;

    public String getBuildComputerText() {
        Reporter.log("getting buildComputer Text from "+buildComputerText.toString()+"<br>");
        return getTextFromElement(buildComputerText);
    }

    public void selectProcessor(String processor) {
        Reporter.log("Selecting processor "+processor+" from dropdown "+processorDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRam(String ram) {
        Reporter.log("Selecting ram "+ram+" from dropdown "+ramDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(ramDropDown, ram);
    }
    public void clickOnAddToCartButton(){
        Reporter.log("Clicking on addToCartButton "+ addToCartButton.toString()+ "<br>");
        clickOnElement(addToCartButton);
    }
    public String getGreenText(){
        Reporter.log("getting greenText from "+greenText.toString()+"<br>");
        return getTextFromElement(greenText);
    }
    public void clickOnCrossSign(){
        Reporter.log("Clicking on crossSign "+ crossSign.toString()+ "<br>");
        clickOnElement(crossSign);
    }
    public void clickOnBuildComputerLink(){
        Reporter.log("Clicking on buildComputer Link "+ buildComputerLink.toString()+ "<br>");
        clickOnElement(buildComputerLink);
    }
    public void selectHddButton(String text){
        if(text == "320 GB"){
            Reporter.log("Selecting day "+text+" from dropdown "+hddRadio320GB.toString() + "<br>");
            clickOnElement(hddRadio320GB);
        }else if(text == "400 GB [+$100.00]"){
            Reporter.log("Selecting day "+text+" from dropdown "+hddRadio400GB.toString() + "<br>");
            clickOnElement(hddRadio400GB);
        }
    }
    public void selectOs(String text){
        if(text == "Vista Home [+$50.00]"){
            Reporter.log("Selecting day "+text+" from dropdown "+osRadioVistaHome.toString() + "<br>");
            clickOnElement(osRadioVistaHome);
        }else if(text == "Vista Premium [+$60.00]"){
            Reporter.log("Selecting day "+text+" from dropdown "+osRadioVistaPremium.toString() + "<br>");
            clickOnElement(osRadioVistaPremium);
        }
    }
    public void selectSoftware(String text){
        if(text == "Microsoft Office [+$50.00]"){
            Reporter.log("Selecting day "+text+" from dropdown "+softwareMsOffice.toString() + "<br>");
            clickOnElement(softwareMsOffice);
        }else if(text == "Acrobat Reader [+$10.00]"){
            Reporter.log("Selecting day "+text+" from dropdown "+softwareAcrobatReader.toString() + "<br>");
            clickOnElement(softwareAcrobatReader);
        }else if(text == "Total Commander [+$5.00]"){
            Reporter.log("Selecting day "+text+" from dropdown "+softwareTotalCommander.toString() + "<br>");
            clickOnElement(softwareTotalCommander);
        }
    }





}
