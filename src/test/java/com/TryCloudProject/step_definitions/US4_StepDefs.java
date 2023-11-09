package com.TryCloudProject.step_definitions;

import com.TryCloudProject.pages.DeckModulePage;
import com.TryCloudProject.utilities.BrowserUtils;
import com.TryCloudProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US4_StepDefs {

    DeckModulePage deckModulePage = new DeckModulePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        deckModulePage.userName.sendKeys("User1");
        deckModulePage.password.sendKeys("Userpass123");
        deckModulePage.loginButton.click();
    }

    @When("user clicks to deck module")
    public void user_clicks_to_deck_module() {
        deckModulePage.deckModuleButton.click();
    }

    @When("user should be able to click to board button")
    public void user_should_be_able_to_click_to_board_button() {
        deckModulePage.boardButton.click();
    }

    @When("user should be able to click add board button")
    public void user_should_be_able_to_click_add_board_button() {
        deckModulePage.addBoardButton.click();
    }

    @When("user should be able to pass board name and click to enter button")
    public void user_should_be_able_to_pass_board_name_and_click_to_enter_button() {
        deckModulePage.inputBoardName.sendKeys("miami" + Keys.ENTER);
        BrowserUtils.sleep(10);
    }

    @Then("user should be able to see newly created board under the All boards")
    public void user_should_be_able_to_see_newly_created_board_under_the_all_boards() {

        WebElement newBoard = Driver.getDriver().findElement(By.xpath("//span[@title='miami']"));
        newBoard.isDisplayed();
    }

    @When("user clicks to board name")
    public void userClicksToBoardName() {
        Driver.getDriver().findElement(By.xpath("//span[@title='miami']")).click();
    }

    @And("user should be able to click to add list button")
    public void userShouldBeAbleToClickToAddListButton() {

        deckModulePage.addListButton.click();
    }

    @And("user should be able to enter list name and hit the enter button")
    public void userShouldBeAbleToEnterListName() {
        deckModulePage.addListName.sendKeys("miamilist"+Keys.ENTER);

    }

    @Then("new list should be displayed")
    public void newListShouldBeDisplayed() {
        WebElement newAddList = Driver.getDriver().findElement(By.xpath("//div[@class='stack__header']"));
        newAddList.isDisplayed();
    }

    @When("user should click on add card button")
    public void userShouldClickOnAddCardButton() {
        deckModulePage.addCardButton.click();
    }

    @And("user should be able to enter new card name")
    public void userShouldBeAbleToEnterNewCardName() {
        deckModulePage.inputCardName.sendKeys("newcardname");
    }

    @And("user should be able to hit the enter or click to arrow sign")
    public void userShouldBeAbleToHitTheEnterOrClickToArrowSign() {
        deckModulePage.enterCardName.click();
    }

    @Then("new card should be seen at the right side of the page")
    public void newCardShouldBeSeenAtTheRightSideOfThePage() {
        Driver.getDriver().findElement(By.xpath("//h2[@class='app-sidebar-header__maintitle']")).isDisplayed();
    }

    @When("user clicks to three dots on the card")
    public void userClicksToThreeDotsOnTheCard() {
       WebElement threeDots = Driver.getDriver().findElement(By.xpath("(//button[@aria-haspopup='true'])[67]"));

        threeDots.click();
    }

    @And("user should be able to click to Assign to me button")
    public void userShouldBeAbleToClickToAssignToMeButton() {

        deckModulePage.assignButton.click();
    }

    @Then("user profile icon should be displayed near the three dots icon")
    public void userProfileIconShouldBeDisplayedNearTheThreeDotsIcon() {
        Driver.getDriver().findElement(By.xpath("(//div[@class='avatardiv__user-status avatardiv__user-status--online'])[1]")).isDisplayed();
    }
}




