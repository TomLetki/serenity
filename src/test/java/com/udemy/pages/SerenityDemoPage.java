package com.udemy.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("file:///D:/Szkolenie_tester/Serenity/Serenity.html")
public class SerenityDemoPage extends PageObject {

    @FindBy(id = "fname")
    private WebElementFacade firesNameInput;

    @FindBy(name = "carSelect")
    private WebElementFacade carSelect;

    @FindBy(className = "topSecret")
    private WebElementFacade secretParagraph;

    @FindBy(id = "newPage")
    private WebElementFacade newPageButton;

    @FindBy(id= "showParagraph")
    private WebElementFacade showParagraphButton;

    @FindBy(id="createAlert")
    private WebElementFacade createAlertButton;


}
