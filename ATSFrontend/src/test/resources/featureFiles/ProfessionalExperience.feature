@Professional
Feature: Professional Detail Update

  Scenario: User is Logged In
    Given I want to go on Uplers
    When I verify the Email id and Password are displayed
    Then I enter the Email id and Password
    And I click on Login Button
    And I verify HomePage Header Text

  Scenario: Enter Professional Details
      Given I verify "Professional Experience" Professional Experience section
      And I click on Professional Experience link
      And I click on Professional Experience edit icon
      And I enter the Professional Details Data and save changes