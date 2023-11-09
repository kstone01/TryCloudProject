package com.TryCloudProject.pages;

import com.TryCloudProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeckModulePage {

    public DeckModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="user")
    public WebElement userName;

    @FindBy (id="password")
    public WebElement password;

    @FindBy (id="submit-form")
    public WebElement loginButton;

    @FindBy (xpath = "(//li[@data-id='deck'])[1]")
    public WebElement deckModuleButton;

    @FindBy (xpath = "//a[@class='app-navigation-toggle']")
    public WebElement boardButton;

    @FindBy (xpath = "//div[@class='app-navigation-entry-icon icon-add']")
    public WebElement addBoardButton;

    @FindBy (xpath = "//input[@placeholder='Board name']")
    public WebElement inputBoardName;

    @FindBy (xpath = "//span[@class='app-navigation-entry__title']")
    public List<WebElement> listOfboards;

    @FindBy (xpath = "//button[@class='action-item action-item--single icon-add undefined undefined has-tooltip']")
    public WebElement addListButton;

    @FindBy(xpath = "//input[@id='new-stack-input-main']")
    public WebElement addListName;

    @FindBy(xpath = "((//button[@rel='noreferrer noopener'])[4])")
    public WebElement addCardButton;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement inputCardName;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement enterCardName;

    @FindBy(xpath = "//button[@aria-controls='menu-rzyjq']")
    public WebElement threeDots;

    @FindBy(xpath = "//span[.='Assign to me']")
    public WebElement assignButton;

    @FindBy(xpath = "//span[.='Unassign myself']")
    public WebElement unassignButton;


















}
