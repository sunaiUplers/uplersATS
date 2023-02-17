@Profile
Feature: Profile Functionality


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

      Scenario: Enter Preference Details
      Given I verify "Preferences" preferences section
      And I click on Preference Details link
      And I click on edit icon
      And I enter the Preference Values and save changes

#    Scenario: Enter Professional Details
#      Given I verify "Professional Experience" Professional Experience section
#      And I click on Professional Experience link
#      And I click on Professional Experience edit icon
#      And I enter the Professional Details Data and save changes
#
#
#    Scenario: Enter Major Projects Details
#      Given I Verify "Major Projects" Major Projects section
#      And I click on Major Projects link
#      And I click on Major Projects edit icon
#      And I enter the Major Projects Data and save changes
#
#    Scenario: Enter Core Competencies Details
#      Given I Verify "Core Competencies" Core Competencies Section
#      And I click on Core Competencies link
#      And I click on Core Competencies edit icon
#      And I enter the Core Competencies Data and save changes
#
#    Scenario: Enter Education Details
#      Given I Verify "Education" Education Section
#      And I click on Education link
#      And I click on Education edit icon
#      And I enter the Education Data and save changes
#
#    Scenario: Enter Certification Details
#      Given I Verify "Certification" Certification Section
#      And I click on Certification link
#      And I click on Certification edit icon
#      And I enter the Certification Data and save changes
#
#    Scenario: Enter Testimonials Details
#      Given I Verify "Testimonial" Testimonial Section
#      And I click on Testimonial link
#      And I click on Testimonial edit icon
#      And I enter the Testimonial Data and save changes