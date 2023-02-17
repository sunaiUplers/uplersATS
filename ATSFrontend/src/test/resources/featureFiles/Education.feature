@Education
Feature: Education Update


  Scenario: User is Logged In
    Given I want to go on Uplers
    When I verify the Email id and Password are displayed
    Then I enter the Email id and Password
    And I click on Login Button
    And I verify HomePage Header Text


Scenario: Enter Education Details
      Given I Verify "Education" Education Section
      And I click on Education link
      And I click on Education edit icon
      And I enter the Education Data and save changes