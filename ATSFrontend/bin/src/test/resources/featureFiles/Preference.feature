@Preference
  Feature: Preference Details Update


    Scenario: User is Logged In
      Given I want to go on Uplers
      When I verify the Email id and Password are displayed
      Then I enter the Email id and Password
      And I click on Login Button
      And I verify HomePage Header Text

    Scenario: Enter Preference Details
    Given I verify "Preferences" preferences section
    And I click on Preference Details link
    And I click on edit icon
    And I enter the Preference Values and save changes