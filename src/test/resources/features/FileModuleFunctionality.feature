@B30G22-123
Feature: Default

	@B30G22-112
	Background:
		Given user enters valid username and password
		And user clicks log in button
		Then user clicks the files icon at the top of the page
		Then user on files page of the application
		
		

	
	@B30G22-110
	Scenario: User can upload a file
		When user clicks plus sign button
		And user clicks upload file
		Then user should see file on Files page	

	
	@B30G22-113
	Scenario: User can create a new folder
		When user clicks plus sign button
		Then user clicks New Folder button
		And user names folder
		Then user should see new file created	

	
	@B30G22-115
	Scenario: User can delete any selected item from its three dots menu
		When user selects a file
		And user clicks the three dots menu of file
		And user clicks Delete Folder button
		Then user should no longer see file on Files page	

	
	@B30G22-118
	Scenario: User can see the total number of files and folders under the files list table
		When user scrolls to the bottom of the Files page
		And user should see the total number of files and folders underneath the files list