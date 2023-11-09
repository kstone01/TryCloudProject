@B30G22-134
Feature: Default

	
	@B30G22-129
	Scenario: User should be able to create a new board and then create a new list and user can add a new task on any list user should be able to assign any card to himself
		Given user is on the home page
		When user clicks to deck module
		And user should be able to click to board button
		And user should be able to click add board button
		And user should be able to pass board name and click to enter button
		Then user should be able to see newly created board under the All boards
		When user clicks to board name
		And user should be able to click to add list button
		And user should be able to enter list name and hit the enter button
		Then new list should be displayed
		When user should click on add card button
		And user should be able to enter new card name
		And user should be able to hit the enter or click to arrow sign
		Then new card should be seen at the right side of the page
		When user clicks to three dots on the card
		And user should be able to click to Assign to me button
		Then user profile icon should be displayed near the three dots icon