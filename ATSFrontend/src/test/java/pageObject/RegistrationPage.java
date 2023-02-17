package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testRunner.TestRunner;
import webDriver.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static testRunner.TestRunner.config;

public class RegistrationPage {

    static WebDriver driver = Driver.getCurrentDriver();
    static String url = TestRunner.config.get("url");

    static By getHired = By.xpath("//a[.='SignUP']");
    static By fullName = By.xpath("//input[@placeholder='Full Name*']");
    static By email = By.xpath("//input[@name='email']");
    static By phoneNumber = By.xpath("//input[@placeholder='Phone No.*']");
    static By password = By.xpath("//input[@placeholder='Password*']");
    static By confirmPassword = By.xpath("//input[@placeholder='Confirm Password*']");
    static By createAccount = By.xpath("//button[normalize-space()='Create account']");

    static By reSendOTP = By.xpath("//button[.='Re-Send']");
    static By submitOTP = By.xpath("//button[.='Submit']");





    static By talentFullNameRegistration = By.xpath("//input[@placeholder='Enter your name']");
    static By talentEmailRegistration=By.xpath("//input[@placeholder='Enter your email']");
    static By talentPhoneNumberRegistration=By.xpath("//input[@placeholder='Phone number']");
    static By preferredRole=By.xpath("//label[.='Preferred Role *']/following-sibling::div");
    static By preferredRoleOptions=By.xpath("//div[@class='react-select__menu-list css-11unzgr']/div");



    static By currentEmployeeStatus=By.xpath("//label[.='What is your Current Employment Status? *']/following-sibling::div");
    static By employeeStatusFullTime=By.xpath("//*[@id=\"react-select-3-option-0\"]");
    static By employeeStatusFreeLancing=By.xpath("//*[@id=\"react-select-3-option-1\"]");
    static By employeeStatusOnContract=By.xpath("//*[@id=\"react-select-3-option-2\"]");
    static By employeeStatusUnEmployed=By.xpath("//*[@id=\"react-select-3-option-3\"]");


    static By usualNoticePeriod=By.xpath("//label[.='Your Usual Notice Period is? *']/following-sibling::div");
    static By noticePeriodImmediatelyRegistration=By.xpath("//*[@id=\"react-select-4-option-0\"]");
    static By noticePeriodWithIn2WeeksRegistration=By.xpath("//*[@id=\"react-select-4-option-1\"]");
    static By noticePeriod2To4WeeksRegistration=By.xpath("//*[@id=\"react-select-4-option-2\"]");
    static By noticePeriod4To8WeeksRegistration=By.xpath("//*[@id=\"react-select-4-option-3\"]");
    static By noticeMorethan8WeeksRegistration=By.xpath("//*[@id=\"react-select-4-option-4\"]");








    static By totalExperience=By.xpath("//input[@name='total_experience']");
    static By linkedInProfile=By.xpath("//div[.='LinkedIn Profile']//input[@name='linkedin_id']");
    static By currentAnnualSalary=By.xpath("//input[@name='current_ctc']");
    static By expectAnnualSalary=By.xpath("//input[@name='expected_ctc']");

    static By associatedPreference1=By.xpath("//div[@id='react-select-5-placeholder']");
    static By associatedPreference2=By.xpath("//div[@id='react-select-6-placeholder']");
    static By associatedPreference3=By.xpath("//div[@id='react-select-7-placeholder']");
    static By associatedPreferenceOptions=By.xpath("//div[@class='react-select__menu-list css-11unzgr']/div");


    static By workingHoursPreference1=By.xpath("//div[@id='react-select-8-placeholder']");
    static By workingHoursPreference2=By.xpath("//div[@id='react-select-9-placeholder']");
    static By workingHoursPreference3=By.xpath("//div[@id='react-select-10-placeholder']");
    static By workingHoursPreferenceOptions=By.xpath("//div[@class='react-select__menu-list css-11unzgr']/div");

    static By uploadResume=By.xpath("//input[@type='file']");

    static By submitGetStarted=By.xpath("//button[.='Submit & Get started']");
    static By skills=By.xpath("(//div[@class='react-select__control css-1s2u09g-control'])[8]");
    static By skillsInput=By.xpath("//input[@id='react-select-11-input']");

    static By talentNameHomePage=By.xpath("//div[@class='u-name']");
    static By talentEmailIdHomePage=By.xpath("//a[@class='u-email']");



    static String talentFullName = config.get("FullName");
    static String edittalentFullName = config.get("EditFullName");
    static String talentEmailID = config.get("TalentEmailID");
    static String talentRegisterPhoneNumber = config.get("RegisterPhoneNumber");
    static String talentPassword = config.get("Password");
    static String talentConfirmPassword = config.get("ConfirmPassword");

    static String positionApplied = config.get("PositionApplied");
    static String workExperience = config.get("RegistrationWorkExperience");
    static String linkedIn = config.get("RegistrationLinkedInProfile");
    static String currentSalary = config.get("RegistrationCurrentSalary");
    static String expectedSalary = config.get("RegistrationExpectedSalary");

    static String uplersPreference1 = config.get("associatedPreference1");
    static String uplersPreference2 = config.get("associatedPreference2");
    static String uplersPreference3 = config.get("associatedPreference3");
    static String uplersWorkingHours1 = config.get("WorkingHoursPreference1");
    static String uplersWorkingHours2 = config.get("WorkingHoursPreference2");
    static String uplersWorkingHours3 = config.get("WorkingHoursPreference3");

    static String registrationSkills1 = config.get("RegistrationSkills1");
    static String registrationSkills2 = config.get("RegistrationSkills2");
    static String registrationSkills3 = config.get("RegistrationSkills3");


    static String resumeUpload = config.get("RegistrationResumeUpload");







    public static boolean getHiredIsDisplayed() {
        driver.navigate().refresh();
        driver.findElement(getHired).isDisplayed();
        return true;
    }

    public static void clickOnGetHired() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(getHired).click();

    }



    public static boolean fullNameIsDisplayed() {
        driver.findElement(fullName).isDisplayed();
        return true;
    }
    public static void enterFullName() {
        driver.findElement(fullName).click();
        driver.findElement(fullName).sendKeys(talentFullName);

    }
    public static boolean emailFieldIsDisplayed() {
        driver.findElement(email).isDisplayed();
        return true;
    }

    public static void enterEmailId() {
        driver.findElement(email).click();
        driver.findElement(email).sendKeys(talentEmailID);
    }

    public static boolean phoneNumberIsDisplayed() {
        driver.findElement(phoneNumber).isDisplayed();
        return true;
    }

    public static void enterPhoneNumber() {
        driver.findElement(phoneNumber).click();
        driver.findElement(phoneNumber).sendKeys(talentRegisterPhoneNumber);
    }

    public static boolean passwordIsDisplayed() {
        driver.findElement(password).isDisplayed();
        return true;
    }

    public static void enterPassword() {
        driver.findElement(password).click();
        driver.findElement(password).sendKeys(talentPassword);
    }

    public static boolean confirmPasswordIsDisplayed() {
        driver.findElement(confirmPassword).isDisplayed();
        return true;
    }


    public static void enterConfirmPassword() {
        driver.findElement(confirmPassword).click();
        driver.findElement(confirmPassword).sendKeys(talentConfirmPassword);
    }
    public static boolean createAccountIsDisplayed() {
        driver.findElement(createAccount).isDisplayed();
        return true;
    }

    public static void clickOnCreateAccount() {
        driver.findElement(createAccount).click();

    }



    public static String getPageTitle() {
        String Title = driver.getTitle();
        return Title;
    }

    public static void verifyOTPPage() throws InterruptedException {
//        Thread.sleep(3000);
        Thread.sleep(50000);
        System.out.println("OTP Page Title : "+driver.getTitle());
        Assert.assertEquals("Uplers Talent Solutions Staging | OTP Verification" ,driver.getTitle());

        driver.findElement(submitOTP);

    }

    public static boolean verifyRegistrationPage() {



        return true;
    }

    public static void verifyFullNameRegistrationPage() throws InterruptedException {
        Thread.sleep(5000);

        String fullName = driver.findElement(By.name("name")).getAttribute("value");
        System.out.println("Talent Full Name :" + fullName);
        Assert.assertEquals(fullName,talentFullName);


    }

    public static void editFullNameRegistrationPage() {

        driver.findElement(talentFullNameRegistration).click();
        driver.findElement(talentFullNameRegistration).clear();
        driver.findElement(talentFullNameRegistration).sendKeys(edittalentFullName);

    }

    public static void verifyEmailIdRegistrationPage() {


        String email = driver.findElement(By.name("email")).getAttribute("value");
        System.out.println("Talent EmailId :" + email);
        Assert.assertEquals(email,talentEmailID);

//        String email = driver.findElement(talentEmailRegistration).getText();
//        Assert.assertEquals(email,talentEmailID);
//        System.out.println("Talent EmailID :" + email);

    }

    public static void verifyPhoneNumberRegistrationPage() {



        String contact_number = driver.findElement(By.name("contact_number")).getAttribute("value");
        System.out.println("Talent Contact Number :" + contact_number);
        Assert.assertEquals(contact_number,talentRegisterPhoneNumber);

//        String phoneNumber = driver.findElement(talentPhoneNumberRegistration).getText();
//        Assert.assertEquals(phoneNumber,talentRegisterPhoneNumber);
//        System.out.println("Talent EmailID :" + phoneNumber);

    }

    public static void choosePreferredRoleRegistrationPage() {

        driver.findElement(preferredRole).click();
        List<WebElement> preferredRoleOption = driver.findElements(preferredRoleOptions);


        for (WebElement w : preferredRoleOption) {
            if (w.getText().equalsIgnoreCase(positionApplied)) {
                w.click();
                break;
            }
        }


    }
    public static void verifyPreferredRoleRegistrationPage() throws InterruptedException {

        Thread.sleep(5000);
//        String role = driver.findElement(preferredRole).getText();
//        System.out.println("role" + role);
//        String roleexpected = driver.findElement(By.xpath("//label[.='Preferred Role *']/following-sibling::div/div/div[1]")).getText();
//        System.out.println("roleexpected" + roleexpected);

        String role1 = driver.findElement(preferredRole).getText();
        System.out.println("role1" + role1);

       Assert.assertEquals(role1,positionApplied);

    }


    public static void chooseCurrentEmployeeStatusRegistrationPage() {

        driver.findElement(currentEmployeeStatus).click();
        driver.findElement(employeeStatusUnEmployed).click();
        driver.findElement(currentEmployeeStatus).click();
        driver.findElement(employeeStatusOnContract).click();
        driver.findElement(currentEmployeeStatus).click();
        driver.findElement(employeeStatusFullTime).click();
        driver.findElement(currentEmployeeStatus).click();
        driver.findElement(employeeStatusFreeLancing).click();


    }


    public static void chooseNoticePeriodRegistrationPage() {

        driver.findElement(usualNoticePeriod).click();
        driver.findElement(noticeMorethan8WeeksRegistration).click();
        driver.findElement(usualNoticePeriod).click();
        driver.findElement(noticePeriod2To4WeeksRegistration).click();
        driver.findElement(usualNoticePeriod).click();
        driver.findElement(noticePeriod4To8WeeksRegistration).click();
        driver.findElement(usualNoticePeriod).click();
        driver.findElement(noticePeriodImmediatelyRegistration).click();
        driver.findElement(usualNoticePeriod).click();
        driver.findElement(noticePeriodWithIn2WeeksRegistration).click();




    }

    public static void enterWorkExperienceRegistrationPage() {

        driver.findElement(totalExperience).sendKeys(workExperience);
        String experience = driver.findElement(By.name("total_experience")).getAttribute("value");
        System.out.println("Talent total Experience :" + experience);
        Assert.assertEquals(experience,workExperience);

    }

    public static void enterLinkedInRegistrationPage() {

        driver.findElement(linkedInProfile).sendKeys(linkedIn);
        String linkedin = driver.findElement(By.name("linkedin_id")).getAttribute("value");
        System.out.println("Talent LinkedIn :" + linkedin);
        Assert.assertEquals(linkedin,linkedIn);



    }

    public static void enterCurrentAnnualSalaryRegistrationPage() {
        driver.findElement(currentAnnualSalary).click();
        driver.findElement(currentAnnualSalary).clear();
        driver.findElement(currentAnnualSalary).sendKeys(currentSalary);


        String salary = driver.findElement(By.name("current_ctc")).getAttribute("value");
        System.out.println("Talent Current Salary :" + salary);
        Assert.assertEquals(salary,currentSalary);


    }

    public static void enterExpectedAnnualSalaryRegistrationPage() {
        driver.findElement(expectAnnualSalary).click();
        driver.findElement(expectAnnualSalary).clear();
        driver.findElement(expectAnnualSalary).sendKeys(expectedSalary);

        String expectsalary = driver.findElement(By.name("expected_ctc")).getAttribute("value");
        System.out.println("Talent Expected Salary :" + expectsalary);
        Assert.assertEquals(expectsalary,expectedSalary);



    }


    public static void chooseMethodOfWorkingRegistrationPage() throws InterruptedException {
        driver.findElement(associatedPreference1).click();

        List<WebElement> preference_Options = driver.findElements(associatedPreferenceOptions);

        for (WebElement w : preference_Options) {

            if(w.getText().equalsIgnoreCase(uplersPreference1)) {
                w.click();
                break;
            }

        }

        driver.findElement(associatedPreference2).click();
        //Hybrid
        driver.findElement(By.xpath("//div[@id='react-select-6-option-1']")).click();
        driver.findElement(associatedPreference3).click();
        //Remote
        driver.findElement(By.xpath("//div[@id='react-select-7-option-0']")).click();








    }

    public static void chooseWorkingHoursRegistrationPage() throws InterruptedException {

        driver.findElement(workingHoursPreference1).click();

        List<WebElement> preference_Options = driver.findElements(workingHoursPreferenceOptions);

        for (WebElement w : preference_Options) {
            System.out.println(w.getText());
            if(w.getText().equalsIgnoreCase(uplersWorkingHours1)) {
                w.click();
                break;
            }

        }

        driver.findElement(workingHoursPreference2).click();
        //AU partial shift
        driver.findElement(By.xpath("//div[@id='react-select-9-option-4']")).click();
        driver.findElement(workingHoursPreference3).click();
        //IST shift
        driver.findElement(By.xpath("//div[@id='react-select-10-option-2']")).click();
        Thread.sleep(1000);



    }


    public static void uploadResume() throws AWTException, InterruptedException {

        Robot r = new Robot();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='fileUploadField']")).click();
     //  driver.findElement(uploadResume).click();
        Thread.sleep(3000);
        driver.findElement(uploadResume).sendKeys("C:\\Users\\Admin\\Desktop\\Frontend_ATS\\PDF document sample.pdf");
        Thread.sleep(3000);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);

        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

    }

    public static void addSkillsRegistration() throws AWTException {
        Robot r = new Robot();

        driver.findElement(skills).click();
        driver.findElement(skillsInput).sendKeys(registrationSkills1);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(skills).click();
        driver.findElement(skillsInput).sendKeys(registrationSkills2);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(skills).click();
        driver.findElement(skillsInput).sendKeys(registrationSkills3);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

    }
    public static void submitGetStarted()  {
          driver.findElement(submitGetStarted).click();

    }

    public static void verifyTalentHomePage()  {

        System.out.println("talent Name Homepage: "+driver.findElement(talentNameHomePage).getText() );
        System.out.println("talent EmailID Homepage: "+ driver.findElement(talentEmailIdHomePage).getText());
        Assert.assertEquals( driver.findElement(talentNameHomePage).getText(),talentFullName);
        Assert.assertEquals( driver.findElement(talentEmailIdHomePage).getText(),talentEmailID);

    }

    }
