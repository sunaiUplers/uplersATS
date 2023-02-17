@CoreCompetencies
Feature: Update CoreCompetencies


  Scenario: User is Logged In
    Given I want to go on Uplers
    When I verify the Email id and Password are displayed
    Then I enter the Email id and Password
    And I click on Login Button
    And I verify HomePage Header Text

  Scenario: Enter Core Competencies Details
      Given I Verify "Core Competencies" Core Competencies Section
      And I click on Core Competencies link
      And I click on Core Competencies edit icon
      And I enter the Core Competencies Data and save changes