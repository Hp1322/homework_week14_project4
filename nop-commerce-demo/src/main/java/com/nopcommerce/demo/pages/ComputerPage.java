package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[text()='Computers']")
    WebElement computerText;

    @FindBy(xpath = "//h2[@class='title']//a[text()=' Desktops ']")
    WebElement deskTopLink;

    @FindBy(xpath = "//h2[@class='title']//a[text()=' Notebooks ']")
    WebElement noteBooksLink;

    @FindBy(xpath = "//h2[@class='title']//a[text()=' Software ']")
    WebElement softwareLink;

    public String getComputerText(){
        Reporter.log("getting computer Text from "+computerText.toString()+"<br>");
        return getTextFromElement(computerText);
    }
    public void clickOnDeskTopLink(){
        Reporter.log("Clicking on deskTop "+ deskTopLink.toString()+ "<br>");
        clickOnElement(deskTopLink);
    }
    public void clickOnNoteBooksLink(){
        Reporter.log("Clicking on noteBooks "+ noteBooksLink.toString()+ "<br>");
        clickOnElement(noteBooksLink);
    }
    public void clickOnSoftwareLink(){
        Reporter.log("Clicking on software "+ softwareLink.toString()+ "<br>");
        clickOnElement(softwareLink);
    }
}
