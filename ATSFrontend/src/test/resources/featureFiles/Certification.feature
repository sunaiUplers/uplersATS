@Certification
Feature: Certification Update


  Scenario: User is Logged In
    Given I want to go on Uplers
    When I verify the Email id and Password are displayed
    Then I enter the Email id and Password
    And I click on Login Button
    And I verify HomePage Header Text


  Scenario: Enter Certification Details
      Given I Verify "Certification" Certification Section
      And I click on Certification link
      And I click on Certification edit icon
      And I enter the Certification Data and save changes