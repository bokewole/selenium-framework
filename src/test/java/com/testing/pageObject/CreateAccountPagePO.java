package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class CreateAccountPagePO {

    // Element Locator
    @FindBy(id = "firstname")
    public static WebElement FirstnameField;

    @FindBy(id = "lastname")
    public static WebElement LastnameField;

    @FindBy(id = "email_address")
    public static WebElement Email_addressField;

    @FindBy(id = "password")
    public static WebElement PasswordField;

    @FindBy(id = "password-confirmation")
    public static WebElement ConfirmPasswordField;

    @FindBy(css = "#form-validate > div > div.primary > button > span")
    public static WebElement CreateAccountButton;

    // Initialise Web element using Selenium WebDriver - Stage 2
    public CreateAccountPagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // Write method to perform Web element actions

    public void enterFirstName(String Firstname) {
        FirstnameField.sendKeys(Firstname);
    }

    public void enterLastname(String Lastname) {
        LastnameField.sendKeys(Lastname);

    }

    public void enterEmail(String Email) {
        Email_addressField.sendKeys(Email);
    }

    public void enterPassword(String Password) {
        PasswordField.sendKeys(Password);
    }

    public void enterConfirmPassword(String ConfirmPassword) {
        ConfirmPasswordField.sendKeys(ConfirmPassword);
    }

    public void ClickCreateAnAccountButton() {
        CreateAccountButton.click();
    }


}


