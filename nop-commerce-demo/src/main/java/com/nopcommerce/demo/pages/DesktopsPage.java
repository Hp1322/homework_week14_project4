package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    public DesktopsPage() {
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktopText;

    @FindBy(xpath = "//select[@aria-label='Select product sort order']")
    WebElement sortByMenu;

    @FindBy(xpath = "//select[@aria-label='Select number of products per page']")
    WebElement displayMenu;



    public String getDesktopText(){
        Reporter.log("getting desktop Text from "+desktopText.toString()+"<br>");
        return getTextFromElement(desktopText);
    }
    public void selectSortBy(String sortby){
        Reporter.log("Selecting sortby "+sortby+" from dropdown "+sortByMenu.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortByMenu, sortby);
    }
    public void selectDisplayMenu(String display){
        Reporter.log("Selecting display "+display+" from dropdown "+displayMenu.toString() + "<br>");
        selectByVisibleTextFromDropDown(displayMenu, display);
    }


}
