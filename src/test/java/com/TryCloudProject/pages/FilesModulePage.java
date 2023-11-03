package com.TryCloudProject.pages;

import com.TryCloudProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage {

    public FilesModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//a[@href='#'])[17]")
    public WebElement plusSignButton;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFileButton;

    @FindBy(xpath = "(//span[.='New folder'])[1]")
    public WebElement newFolderButton;

    @FindBy(id = "view13-input-folder")
    public WebElement inputFolderName;

    @FindBy(xpath = "//span[@class='nametext']/span[.='New folder']")
    public WebElement newFolder;

}//class
