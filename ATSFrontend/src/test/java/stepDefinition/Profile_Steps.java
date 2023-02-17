package stepDefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObject.ProfilePage;

public class Profile_Steps {
    @Then("^I click on Profile Link$")
    public void i_click_on_Profile_Link() throws Throwable {
        ProfilePage.VerifyProfileLink();
        ProfilePage.clickOnProfileLink();
       // ProfilePage.clicksection();
        Thread.sleep(5000);
    }

    @Then("^I upload Profile Picture$")
    public void i_upload_Profile_Picture() throws Throwable {

        ProfilePage.changeProfilePicture();
    }



    @Then("^I verify \"([^\"]*)\" section$")
    public void i_verify_section(String section) throws Throwable {
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Personal Details");
        ProfilePage.verifyAccordionHeaderText(section);
    }

    @Then("^I click on Personal Details link$")
    public void i_click_on_Personal_Details_link() throws Throwable {
        ProfilePage.clickPersonalDetails();




    }

    @Then("^I enter Personal Details and Savechanges$")
    public void i_enter_Personal_Details_and_Savechanges() throws Throwable {
        ProfilePage.EditPersonalDetailButton();
        ProfilePage.enterPersonalDetails();

    }

    @Given("^I verify \"([^\"]*)\" preferences section$")
    public void i_verify_preferences_section(String section) throws Throwable {
        ProfilePage.clickOnProfileLink();
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Preferences");
        ProfilePage.verifyAccordionHeaderText(section);
    }

    @Given("^I click on Preference Details link$")
    public void i_click_on_Preference_Details_link() throws Throwable {
        ProfilePage.clickPreferences();
    }

    @Given("^I click on edit icon$")
    public void i_click_on_edit_icon() throws Throwable {
        ProfilePage.editPreferences();
    }

    @Given("^I enter the Preference Values and save changes$")
    public void i_enter_the_Preference_Values_and_save_changes() throws Throwable {
       ProfilePage.enterPreferencesData();

    }

    @Given("^I verify \"([^\"]*)\" Professional Experience section$")
    public void i_verify_Professional_Experience_section(String section) throws Throwable {
        ProfilePage.clickOnProfileLink();
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Professional Experience");
        ProfilePage.verifyAccordionHeaderText(section);


    }

    @Given("^I click on Professional Experience link$")
    public void i_click_on_Professional_Experience_link() throws Throwable {
        ProfilePage.clickProfessionalExperience();

    }

    @Given("^I click on Professional Experience edit icon$")
    public void i_click_on_Professional_Experience_edit_icon() throws Throwable {
       // ProfilePage.editProfessionalExperience();
    }

    @Given("^I enter the Professional Details Data and save changes$")
    public void i_enter_the_Professional_Details_Data_and_save_changes() throws Throwable {
        ProfilePage.enterProfessionalExperienceData();

    }

    @Given("^I Verify \"([^\"]*)\" Major Projects section$")
    public void i_Verify_Major_Projects_section(String section) throws Throwable {
        ProfilePage.clickOnProfileLink();
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Major Projects");
        ProfilePage.verifyAccordionHeaderText(section);


    }

    @Given("^I click on Major Projects link$")
    public void i_click_on_Major_Projects_link() throws Throwable {
    ProfilePage.clickMajorProjects();

    }

    @Given("^I click on Major Projects edit icon$")
    public void i_click_on_Major_Projects_edit_icon() throws Throwable {



    }

    @Given("^I enter the Major Projects Data and save changes$")
    public void i_enter_the_Major_Projects_Data_and_save_changes() throws Throwable {
        ProfilePage.enterMajorProjects();


    }

    @Given("^I Verify \"([^\"]*)\" Core Competencies Section$")
    public void i_Verify_Core_Competencies_Section(String section) throws Throwable {
        ProfilePage.clickOnProfileLink();
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Core Competencies");
        ProfilePage.verifyAccordionHeaderText(section);


    }

    @Given("^I click on Core Competencies link$")
    public void i_click_on_Core_Competencies_link() throws Throwable {

        ProfilePage.clickCoreCompetencies();

    }

    @Given("^I click on Core Competencies edit icon$")
    public void i_click_on_Core_Competencies_edit_icon() throws Throwable {

        ProfilePage.editCoreCompetencies();

    }

    @Given("^I enter the Core Competencies Data and save changes$")
    public void i_enter_the_Core_Competencies_Data_and_save_changes() throws Throwable {

        ProfilePage.enterCoreCompetencies();

    }


    @Given("^I Verify \"([^\"]*)\" Education Section$")
    public void i_Verify_Education_Section(String section) throws Throwable {
        ProfilePage.clickOnProfileLink();
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Education");
        ProfilePage.verifyAccordionHeaderText(section);


    }

    @Given("^I click on Education link$")
    public void i_click_on_Education_link() throws Throwable {
        ProfilePage.clickEducation();
        ProfilePage.enterEducation();

    }

    @Given("^I click on Education edit icon$")
    public void i_click_on_Education_edit_icon() throws Throwable {



    }

    @Given("^I enter the Education Data and save changes$")
    public void i_enter_the_Education_Data_and_save_changes() throws Throwable {



    }


    @Given("^I Verify \"([^\"]*)\" Certification Section$")
    public void i_Verify_Certification_Section(String section) throws Throwable {
        ProfilePage.clickOnProfileLink();
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Certification");
        ProfilePage.verifyAccordionHeaderText(section);



    }

    @Given("^I click on Certification link$")
    public void i_click_on_Certification_link() throws Throwable {
        ProfilePage.clickCertification();



    }

    @Given("^I click on Certification edit icon$")
    public void i_click_on_Certification_edit_icon() throws Throwable {



    }

    @Given("^I enter the Certification Data and save changes$")
    public void i_enter_the_Certification_Data_and_save_changes() throws Throwable {
        ProfilePage.enterCertification();


    }

    @Given("^I Verify \"([^\"]*)\" Testimonial Section$")
    public void i_Verify_Testimonial_Section(String section) throws Throwable {
        ProfilePage.clickOnProfileLink();
        System.out.println(ProfilePage.verifyAccordionHeaderText(section));
        Assert.assertEquals(ProfilePage.verifyAccordionHeaderText(section),"Testimonials");
        ProfilePage.verifyAccordionHeaderText(section);


    }

    @Given("^I click on Testimonial link$")
    public void i_click_on_Testimonial_link() throws Throwable {

        ProfilePage.clickTestimonials();

    }

    @Given("^I click on Testimonial edit icon$")
    public void i_click_on_Testimonial_edit_icon() throws Throwable {



    }

    @Given("^I enter the Testimonial Data and save changes$")
    public void i_enter_the_Testimonial_Data_and_save_changes() throws Throwable {

        ProfilePage.enterTestimonials();

    }



}
