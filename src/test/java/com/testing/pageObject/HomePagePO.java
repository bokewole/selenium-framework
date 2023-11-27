package com.testing.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class HomePagePO {

 // Element Locator  - Stage 1
 @FindBy(linkText = "Create an Account")
 public static WebElement CreateAccountLink;

 @FindBy(linkText = "Sign In")
 public static WebElement SignInLink;


 // Initialise Web element using Selenium WebDriver - Stage 2
 public HomePagePO(WebDriver driver) {
  PageFactory.initElements(driver, this);
 }

 // Write method to perform Web element actions
 public void clickCreateAccountLink() {
  CreateAccountLink.click();
 }

 public void clickSignInLink() {
  SignInLink.click();
 }

}


