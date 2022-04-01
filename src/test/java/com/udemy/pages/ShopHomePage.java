package com.udemy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


//@DefaultUrl("/?page_id=5")
public class ShopHomePage extends PageObject {

@FindBy(xpath = "//li[@id='menu-item-22']//a") // Findby z serenity
private WebElementFacade myAccountLink3;



    public void openMyAccountPage(){

        myAccountLink3.click();
    }

}
