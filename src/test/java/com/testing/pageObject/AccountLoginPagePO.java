package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPagePO {

    // Element Locator  - Stage 1
    @FindBy(id = "email")
    public static WebElement EmailField;

    @FindBy(name="login[password]")
    public static WebElement PasswordField;

    @FindBy(css = "#send2 > span")
    public static WebElement AccountLoginButton;




    // Initialise Web element using Selenium WebDriver - Stage 2
    public AccountLoginPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    // Stage 3- Page Specific Methods
    public void enterEmail(String Email){
        EmailField.sendKeys(Email);
    }

    public void enterPassword(String Password){
        PasswordField.sendKeys(Password);
    }

    public void ClickLoginButton(){
        AccountLoginButton.click();
    }
}
























