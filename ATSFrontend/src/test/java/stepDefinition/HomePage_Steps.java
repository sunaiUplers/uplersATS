package stepDefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObject.HomePage;


public class HomePage_Steps {
    @Then("^I verify HomePage Header Text$")
    public void i_verify_HomePage_Header_Text() throws Throwable {
        HomePage.VerifyHomePageHeader();
        System.out.println(HomePage.getPageTitle());
     //   Assert.assertEquals(HomePage.getPageTitle(),"Uplers Talent Solutions Staging | Login");
        Assert.assertEquals(HomePage.getHomePageHeader(),"Welcome Uplers New Talent!");

    }
}
