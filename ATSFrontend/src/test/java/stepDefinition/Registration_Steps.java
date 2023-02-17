package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.RegistrationPage;

import static testRunner.TestRunner.config;

public class Registration_Steps {

    static String talentFullName = config.get("FullName");

    @Given("^User go to Login Page of Uplers and click the Get Hired Button$")
    public void user_go_to_Login_Page_of_Uplers_and_click_the_Get_Hired_Button() throws Throwable {
        LoginPage.launchUrl();
        RegistrationPage.getHiredIsDisplayed();
        RegistrationPage.clickOnGetHired();


    }

    @Given("^User in Joinus Page and  Enter and Validate the FullName, Email, PhoneNumber, Password and click Create account$")
    public void user_in_Joinus_Page_and_Enter_and_Validate_the_FullName_Email_PhoneNumber_Password_and_click_Create_account() throws Throwable {
        RegistrationPage.fullNameIsDisplayed();
        RegistrationPage.enterFullName();
        RegistrationPage.emailFieldIsDisplayed();
        RegistrationPage.enterEmailId();
        RegistrationPage.phoneNumberIsDisplayed();
        RegistrationPage.enterPhoneNumber();
        RegistrationPage.passwordIsDisplayed();
        RegistrationPage.enterPassword();
        RegistrationPage.confirmPasswordIsDisplayed();
        RegistrationPage.enterConfirmPassword();
        RegistrationPage.createAccountIsDisplayed();
        RegistrationPage.clickOnCreateAccount();



    }

    @Given("^I Enter the OTP received in My Registered EmailId$")
    public void i_Enter_the_OTP_received_in_My_Registered_EmailId() throws Throwable {

        RegistrationPage.verifyOTPPage();


    }

    @Given("^I Verify Registration Page$")
    public void i_Verify_Registration_Page() throws Throwable {
        System.out.println(RegistrationPage.getPageTitle());
        Assert.assertEquals(RegistrationPage.getPageTitle(),"Uplers Talent Solutions Staging | Registration");

    }

    @Given("^I Enter the FullName and Verify FullName is Displayed$")
    public void i_Enter_the_FullName_and_Verify_FullName_is_Displayed() throws Throwable {
            RegistrationPage.verifyFullNameRegistrationPage();



    }

    @Given("^I Enter the PhoneNumber and Verify PhoneNumber is Displayed$")
    public void i_Enter_the_PhoneNumber_and_Verify_PhoneNumber_is_Displayed() throws Throwable {

        RegistrationPage.verifyPhoneNumberRegistrationPage();

    }

    @Given("^I Enter and Choose Preferred Role and Verify it$")
    public void i_Enter_and_Choose_Preferred_Role_and_Verify_it() throws Throwable {
        RegistrationPage.choosePreferredRoleRegistrationPage();
        RegistrationPage.verifyPreferredRoleRegistrationPage();
    }

    @Given("^I Choose Current Employment Status and Verify it$")
    public void i_Choose_Current_Employment_Status_and_Verify_it() throws Throwable {
        RegistrationPage.chooseCurrentEmployeeStatusRegistrationPage();
    }

    @Given("^I Choose Notice Period and Verify it$")
    public void i_Choose_Notice_Period_and_Verify_it() throws Throwable {
            RegistrationPage.chooseNoticePeriodRegistrationPage();
    }

    @Given("^I Enter the Work Experience and Verify it$")
    public void i_Enter_the_Work_Experience_and_Verify_it() throws Throwable {
        RegistrationPage.enterWorkExperienceRegistrationPage();
    }

    @Given("^I Enter the Linkedin Profile and Verify it$")
    public void i_Enter_the_Linkedin_Profile_and_Verify_it() throws Throwable {
            RegistrationPage.enterLinkedInRegistrationPage();
    }

    @Given("^I Enter the Current Annual Salary and Verify it$")
    public void i_Enter_the_Current_Annual_Salary_and_Verify_it() throws Throwable {
            RegistrationPage.enterCurrentAnnualSalaryRegistrationPage();
    }

    @Given("^I Enter the Expected Salary and Verify it$")
    public void i_Enter_the_Expected_Salary_and_Verify_it() throws Throwable {
            RegistrationPage.enterExpectedAnnualSalaryRegistrationPage();
    }

    @Given("^I Choose Preferred Method of Working$")
    public void i_Choose_Preferred_Method_of_Working() throws Throwable {

        RegistrationPage.chooseMethodOfWorkingRegistrationPage();

    }

    @Given("^I Choose Preferred Working Hours$")
    public void i_Choose_Preferred_Working_Hours() throws Throwable {
        RegistrationPage.chooseWorkingHoursRegistrationPage();

    }



    @Given("^I Upload the Resume and Verify it and click the Submit and Get Started$")
    public void i_Upload_the_Resume_and_Verify_it_and_click_the_Submit_and_Get_Started() throws Throwable {
       RegistrationPage.addSkillsRegistration();
        RegistrationPage.uploadResume();

        Thread.sleep(5000);
        RegistrationPage.submitGetStarted();
    }

    @Then("^User Successfully Registered in Uplers Portal$")
    public void user_Successfully_Registered_in_Uplers_Portal() throws Throwable {
        Thread.sleep(5000);
        RegistrationPage.verifyTalentHomePage();
        System.out.println("Home Page Header : " +   HomePage.getHomePageHeader());
        Assert.assertEquals(HomePage.getHomePageHeader(),"Welcome "+talentFullName+"!");


    }



}
