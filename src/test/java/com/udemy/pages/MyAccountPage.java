package com.udemy.pages;

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

public void registerUser(String email, String password){
    regEmailInput.type(email);
    withAction().moveToElement(regPasswordInput).build().perform(); //przesuwa do elementu
    regPasswordInput.type(password);
    withAction().moveToElement(regButton).build().perform();
    regButton.click();
}

}
