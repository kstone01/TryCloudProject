package com.TryCloudProject.pages;

import com.TryCloudProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudBasePage {

    public TryCloudBasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//div[@class='header-left']//a[@href='/index.php/apps/files/'])[1]")
    public WebElement filesButton;


    @FindBy(xpath = "(//table//tbody//td)[1]")
    public WebElement itemToSelect;

    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement threeDotsMenu;

    @FindBy(xpath = "//tbody//a[@data-action='Delete']")
    public  WebElement deleteFolderButton;

    @FindBy(xpath = "//td/span[@class='info']")
    public WebElement fileCount;

}
