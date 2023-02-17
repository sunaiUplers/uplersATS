@Registration
  Feature: Registration Functionality

Scenario: User Register in Uplers portal
  Given User go to Login Page of Uplers and click the Get Hired Button
  And User in Joinus Page and  Enter and Validate the FullName, Email, PhoneNumber, Password and click Create account
  And I Enter the OTP received in My Registered EmailId
  And I Verify Registration Page
  And I Enter the FullName and Verify FullName is Displayed
  And I Enter the PhoneNumber and Verify PhoneNumber is Displayed
  And I Enter and Choose Preferred Role and Verify it
  And I Choose Current Employment Status and Verify it
  And I Choose Notice Period and Verify it
  And I Enter the Work Experience and Verify it
  And I Enter the Linkedin Profile and Verify it
  And I Enter the Current Annual Salary and Verify it
  And I Enter the Expected Salary and Verify it
  And I Choose Preferred Method of Working
  And I Choose Preferred Working Hours
  And I Upload the Resume and Verify it and click the Submit and Get Started
  Then User Successfully Registered in Uplers Portal

