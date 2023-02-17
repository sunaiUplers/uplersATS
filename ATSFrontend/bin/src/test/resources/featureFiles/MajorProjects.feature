@MajorProjects
Feature: Major Projects Update

  Scenario: User is Logged In
    Given I want to go on Uplers
    When I verify the Email id and Password are displayed
    Then I enter the Email id and Password
    And I click on Login Button
    And I verify HomePage Header Text

  Scenario: Enter Major Projects Details
      Given I Verify "Major Projects" Major Projects section
      And I click on Major Projects link
      And I click on Major Projects edit icon
      And I enter the Major Projects Data and save changes