package com.TryCloudProject.step_definitions;

import com.TryCloudProject.pages.*;
import com.TryCloudProject.utilities.ConfigurationReader;
import com.TryCloudProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileModule_StepDefs {

    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();
    TryCloudBasePage tryCloudBasePage = new TryCloudBasePage();
    FilesModulePage filesModulePage = new FilesModulePage();

//    @Given("user enters valid username and password")
//    public void userEntersValidUsernameAndPassword() {
//
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//        tryCloudLoginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("driver_username"));
//        tryCloudLoginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("driver_password"));
//    }------------------------------------------

//    @Given("the user logged in with username as {string} and password as {string}")
//    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
////        LoginPage loginPage=new LoginPage();
////        loginPage.login(username,password);
//
//        tryCloudLoginPage.usernameInput.sendKeys(username);
//        tryCloudLoginPage.passwordInput.sendKeys(password);
//    }---------------
//    @And("user clicks log in button")// done
//    public void userClicksLogInButton() {
//
//        tryCloudLoginPage.loginButton.click();
//    }-----------


    //scenario 1
    @Then("user clicks the files icon at the top of the page")//done
    public void userClicksTheFilesIconAtTheTopOfThePage() {

        tryCloudBasePage.filesButton.click();
    }

    @When("user clicks plus sign button")//done
    public void userClicksPlusSignButton() {

        filesModulePage.plusSignButton.click();
    }

    @And("user clicks upload file")
    public void userClicksUploadFile() {//done

        filesModulePage.uploadFileButton.click();
    }

    @And("user selects {string} file from documents")//not sure
    public void userSelectsFileFromDocuments(String filePath) {

        filesModulePage.uploadFileButton.sendKeys("/Users/kay/Documents/test/day01.txt");
    }

    @Then("user should see file on Files page")// **come back**
    public void userShouldSeeFileOnFilesPage() {

        //Assert.assertTrue();
    }

    //-----------------------------------------------------
    //scenario 2 --> PASSED
    @Then("user clicks New Folder button")//done
    public void userClicksNewFolderButton() {

        filesModulePage.newFolderButton.click();
    }

    @And("user names folder {string}")//done
    public void userNamesFolder(String folderName) {

        filesModulePage.inputFolderName.sendKeys(folderName + Keys.ENTER);
    }


    @Then("user should see new file created")//done
    public void userShouldSeeNewFileCreated() {

        Assert.assertTrue(filesModulePage.newFolder.isDisplayed());
    }

//-----------------------------------------------------
    //scenario 3
    @When("user selects a file")//done
    public void userSelectsAFile() {

        tryCloudBasePage.itemToSelect.click();
    }

    @And("user clicks the three dots menu of file")//done
    public void userClicksTheThreeDotsMenuOfFile() {

        tryCloudBasePage.threeDotsMenu.click();
    }

    @And("user clicks Delete Folder button")// done
    public void userClicksDeleteFolderButton() {

        tryCloudBasePage.deleteFolderButton.click();
    }

    @Then("user should no longer see file on Files page")//StaleElementReferenceException
    public void userShouldNoLongerSeeFileOnFilesPage() {

        Assert.assertFalse(tryCloudBasePage.itemToSelect.isDisplayed());
    }

    //-----------------------------------------------------

    //scenario #4 --> PASSED
    @When("user scrolls to the bottom of the Files page")
    public void userScrollsToTheBottomOfTheFilesPage() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("user should see the total number of files and folders underneath the files list")
    public void userShouldSeeTheTotalNumberOfFilesAndFoldersUnderneathTheFilesList() {

        Assert.assertTrue(tryCloudBasePage.fileCount.isDisplayed());
    }



}//class
