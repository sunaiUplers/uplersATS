@PersonalDetails
Feature: Profile Picture and Personal Details Update


  Scenario: User is Logged In
    Given I want to go on Uplers
    When I verify the Email id and Password are displayed
    Then I enter the Email id and Password
    And I click on Login Button
    And I verify HomePage Header Text

  Scenario: Upload Profile Picture and Enter Personal Details
    And I click on Profile Link
    And I upload Profile Picture
    And I verify "Personal Details" section
    And I click on Personal Details link
    And I enter Personal Details and Savechanges
