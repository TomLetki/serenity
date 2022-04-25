package com.udemy.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



public class MyAccountPage extends PageObject {
@FindBy(id = "reg_email")
    private WebElementFacade regEmailInput;

@FindBy(id = "reg_password")
    private WebElementFacade regPasswordInput;

@FindBy(name = "register")
    private WebElementFacade regButton;

@FindBy(xpath = "//ul[@class='woocommerce-error']//li")
    private WebElementFacade errorMessage;

@FindBy(linkText = "Logout")
    private WebElementFacade logoutLink;

public void registerUser(String email, String password){
    regEmailInput.type(email);
    Serenity.takeScreenshot();
    Serenity.recordReportData().withTitle("Email and Password ").andContents(email+ " and "+ password);
    withAction().moveToElement(regPasswordInput).build().perform(); //przesuwa do elementu
    regPasswordInput.typeAndEnter(password);
    //withAction().moveToElement(regButton).build().perform();
    //regButton.click();
}
public void checkErrorMsg(String message){
    errorMessage.shouldContainText(message);

}
public void isLogoutLinkDisplayed(boolean isDisplayed){
    if(isDisplayed){
         logoutLink.shouldBeVisible();
    }else{
        logoutLink.shouldNotBeVisible();
    }

}

}
