@B30G22-123
Feature: File functionality

  Background: User is already in the log in page
    Given the user logged in with username as "User1" and password as "Userpass123"


  @B30G22-110
  Scenario: User can upload a file from files page
    When user clicks the files icon at the top of the page
    Then user clicks plus sign button
    And user clicks upload file
    And user selects "/Users/kay/Documents/test/day01.txt" file from documents
    Then user should see file on Files page

  #scenario 2 --> PASSED
  @B30G22-113
  Scenario: User can create a new folder from files page
    When user clicks the files icon at the top of the page
    Then user clicks plus sign button
    Then user clicks New Folder button
    And user names folder "Folder"
    Then user should see new file created


  #scenario 3
  @B30G22-115
  Scenario: User can delete any selected item from its three dots menu
    When user clicks the files icon at the top of the page
    When user selects a file
    And user clicks the three dots menu of file
    And user clicks Delete Folder button
    Then user should no longer see file on Files page


  #scenario 4
  @B30G22-118
  Scenario: User can see the total number of files and folders under the files list table
    When user clicks the files icon at the top of the page
    And user scrolls to the bottom of the Files page
    Then user should see the total number of files and folders underneath the files list