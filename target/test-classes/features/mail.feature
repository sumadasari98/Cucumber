Feature: Mail signin functionality

  Background: Go to registration page
    Given User opens the link
    When User click on Sign Up link
    Then Registration Page should display

  Scenario Outline: Register a new user and send a message
    when User is on signin page
    And User enter firstname "<FirstName>"
    And User enter lastname "<LastName>"
    And User enter emailid "<email>"
    And User enter username "<username>"
    And User enter password "<pwd>"
    And User enter confirm password "<confirmpwd>"
    And User clicks on Register button
    And User click on Inbox link
    And User click on Compose message icon
    And User enters Send to email "<SendTo>"
    And user enters Subject "<Subject>"
    And user enters Message to be sent "<Message>"
    And User clicks on Send message button

    Examples: 
      | FirstName | LastName | email       | username | pwd   | confirmpwd | SendTo       | Subject  | Message          |
      | suma      | latha    | mljja@a.com | slgkk    | 569md | 565md      | dasari@a.com | cucumber | cucumber project |
