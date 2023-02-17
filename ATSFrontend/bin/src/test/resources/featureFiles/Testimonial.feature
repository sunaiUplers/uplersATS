@Testimonial
Feature: Testimonial Update

  Scenario: User is Logged In
    Given I want to go on Uplers
    When I verify the Email id and Password are displayed
    Then I enter the Email id and Password
    And I click on Login Button
    And I verify HomePage Header Text

Scenario: Enter Testimonials Details
      Given I Verify "Testimonial" Testimonial Section
      And I click on Testimonial link
      And I click on Testimonial edit icon
      And I enter the Testimonial Data and save changes