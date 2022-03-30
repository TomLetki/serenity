package com.udemy.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//@DefaultUrl("/?page_id=5")
public class ShopHomePage extends PageObject {
@FindBy(xpath = "//li[@id='menu-item-22']//a")
private WebElement myAccountLink;

@FindBy(xpath = "//li[@id='menu-item-22']//a")
private WebElementFacade myAccountLink2;        //interfejs serenity core

@net.serenitybdd.core.annotations.findby.FindBy(xpath = "//li[@id='menu-item-22']//a") // Findby z serenity
private WebElementFacade myAccountLink3;

    public void openMyAccountPage(){
        //getDriver().findElement(By.xpath("//li[@id='menu-item-22']//a")).click();
        //myAccountLink.click();
        //find(By.xpath("//li[@id='menu-item-22']//a")).click(); //opcja z serenity
        //myAccountLink2.click();
        myAccountLink3.click();
    }

}
