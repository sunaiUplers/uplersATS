package pageObject;

import com.sun.jna.platform.win32.WinDef;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import webDriver.Driver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;

import static testRunner.TestRunner.config;

public class ProfilePage {
    static WebDriver driver = Driver.getCurrentDriver();

    static By LoginButton = By.className("cta-button");


    static By profilePicLink = By.xpath("//label[@for='profilePic']");
    static By profilePic = By.xpath("//label[@for='profilePic']//preceding-sibling::input[@type='file']");
    static By profileLink = By.xpath("//div[@class='sitemenu']/ul/li[4]/a/span");


    static By addPersonalDetailButton = By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[1]");
    static By EditPersonalDetailButton = By.xpath("//button[normalize-space()='EDIT']");
    static By NameField = By.xpath("//input[@placeholder='Enter First Name']");
    static By gender = By.xpath("//div[@class=' css-b62m3t-container']");
    static By male = By.xpath("//div[@id='react-select-2-option-0']");
    static By female = By.xpath("//div[@id='react-select-2-option-1']");
    static By DOB = By.xpath("//input[@placeholder='Enter Date']");
    static By Email = By.xpath("//input[@placeholder='Enter Email']");
    static By phoneNumber = By.xpath("//input[@id='contact_number']");
    static By address = By.xpath("//input[@placeholder='Enter Address']");
    static By city = By.xpath("//input[@placeholder='Enter City']");
    static By pincode = By.xpath("//input[@placeholder='Enter Pincode']");
    static By linkedinEdit = By.xpath("//input[@placeholder='Add link here']");
    static By resumeReplaceLink = By.xpath("//label[@for='resumeReplace']");
    static By resumeReplaceFile = By.xpath("//div[@class='row']//input[@type='file']");
    static By personalSaveChanges = By.xpath("//button[@class='saveBtn']");
    static By personalDiscardChanges = By.xpath("//button[@class='ghostBtn']");
    static By personalDetailsEdit = By.xpath("//button[normalize-space()='EDIT']");


    static By addPreferences = By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[2]");
    static By editPreferences = By.xpath("//button[normalize-space()='EDIT']");
    static By jobTitle = By.xpath("//input[@placeholder='Your Designation']");
    static By employeeStatus = By.xpath("(//div[@class='react-select__control css-1s2u09g-control'])[1]");
    static By fullTimeEmployee = By.xpath("//*[@id=\"react-select-4-option-0\"]");
    static By fullTimeFreelancing = By.xpath("//div[@id='react-select-2-option-1']");
    static By onContract = By.xpath("//div[@id='react-select-2-option-2']");
    static By unEmployed = By.xpath("//div[@id='react-select-2-option-3']");

    static By workExperience = By.xpath("//input[@placeholder='No of years']");
    static By noticePeriod = By.xpath("(//div[@class='react-select__value-container react-select__value-container--has-value css-1d8n9bt'])[2]");
    static By immediately = By.xpath("//*[@id=\\\"react-select-3-option-0\\\"]");
    static By noticeWithIn2Weeks = By.xpath("//*[@id=\"react-select-3-option-1\"]");
    static By notice2_To_4Weeks = By.xpath("//*[@id=\\\"react-select-3-option-2\\\"]");
    static By notice4_To_8Weeks = By.xpath("//*[@id=\\\"react-select-3-option-3\\\"]");
    static By morethan8Weeks = By.xpath("//*[@id=\\\"react-select-3-option-4\\\"]");
    static By currentPayAnnually = By.xpath("//input[@name='current_ctc']");
    static By expectedPayAnnually = By.xpath("//input[@id='expected_ctc']");
    static By internationalClientsYes = By.xpath("//div[@class='d-flex align-items-center mr-3']//span[@class='checkmark']");
    static By internationalClientsNo = By.xpath("//div[@class='d-flex align-items-center']//span[@class='checkmark']");

    static By associatedUplers = By.xpath("(//div[@class='react-select__control css-1s2u09g-control'])[3]");
    static By fullTime = By.xpath("//div[@id='react-select-4-option-0']");
    static By partTime = By.xpath("//div[@id='react-select-4-option-1']");
    static By project2Project = By.xpath("//div[@id='react-select-4-option-2']");

    static By preference1 = By.xpath("//*[@id=\"app\"]/div[2]/section/section/div[3]/div[2]/div[2]/div[9]/div[1]/div[1]/div/div/div[1]/div");
    static By preference1_Office = By.xpath("//*[@id=\\\"react-select-5-option-0\\\"]");
    static By preference1_Hybrid = By.xpath("//*[@id=\\\"react-select-5-option-1\\\"]");
    static By preference1_Remote = By.xpath("//*[@id=\\\"react-select-5-option-2\\\"]");
    static By preference2 = By.xpath("//*[@id=\"app\"]/div[2]/section/section/div[3]/div[2]/div[2]/div[9]/div[1]/div[2]/div/div");
    static By preference2_Office = By.xpath("//*[@id=\"react-select-15-option-0\"]");
    static By preference2_Hybrid = By.xpath("//*[@id=\\\"react-select-6-option-1\\\"]");
    static By preference2_Remote = By.xpath("//*[@id=\\\"react-select-6-option-2\\\"]");
    static By preference3 = By.xpath("//*[@id=\"app\"]/div[2]/section/section/div[3]/div[2]/div[2]/div[9]/div[1]/div[3]/div/div");
    static By preference3_Office = By.xpath("//*[@id=\\\"react-select-7-option-0\\\"]");
    static By preference3_Hybrid = By.xpath("//*[@id=\\\"react-select-7-option-1\\\"]");
    static By preference3_Remote = By.xpath("//*[@id=\\\"react-select-7-option-2\\\"]");

    static By workingHoursPreference1 = By.xpath("//*[@id=\"app\"]/div[18]/section/section/div[3]/div[2]/div[2]/div[10]/div/div[1]/div/div");
    static By preference1USShift = By.xpath("//*[@id=\"react-select-8-option-0\"]");
    static By preference1UKShift = By.xpath("//*[@id=\"react-select-8-option-0\"]");
    static By preference1AUShift = By.xpath("//*[@id=\"react-select-8-option-1\"]");
    static By workingHoursPreference2 = By.xpath("//*[@id=\"app\"]/div[18]/section/section/div[3]/div[2]/div[2]/div[10]/div/div[2]/div/div");
    static By preference2USShift = By.xpath("//*[@id=\"react-select-9-option-0\"]");
    static By preference2UKShift = By.xpath("//*[@id=\"react-select-9-option-1\"]");
    static By preference2AUShift = By.xpath("//*[@id=\"react-select-9-option-1\"]");
    static By workingHoursPreference3 = By.xpath("//*[@id=\"app\"]/div[18]/section/section/div[3]/div[2]/div[2]/div[10]/div/div[3]/div/div");
    static By preference3USShift = By.xpath("//*[@id=\"react-select-10-option-0\"]");
    static By preference3UKShift = By.xpath("//*[@id=\"react-select-10-option-0\"]");
    static By preference3AUShift = By.xpath("//*[@id=\"react-select-10-option-1\"]");

    static By interest = By.xpath("//div[@class='react-select__input-container css-1nwrnl4']");
    static By interestChoose = By.xpath("//*[@id=\"react-select-11-listbox\"]/div/div");
    static By introduction = By.xpath("//*[@id=\"objective\"]/div/div[2]/pre/div[1]");
    static By introductionBold = By.xpath("//button[@name='Bold']");
    static By introductionItalic = By.xpath("//button[@name='Italic']");
    static By introductionUnderlined = By.xpath("//button[@name='Underline']");
    static By introductionBullet = By.xpath("//button[@name='Bulleted List']");
    static By introductionNumber = By.xpath("//button[@name='Numbered List']");
    static By introductionUndo = By.xpath("//button[@name='Undo']");
    static By introductionRedo = By.xpath("//button[@name='Redo']");
    static By preferencesSaveChanges = By.xpath("//button[@class='saveBtn']");
    static By PreferencesDiscard = By.xpath("//button[@class='ghostBtn']");


    static By addProfesionalExperince = By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[3]");
    static By minimizeProfessionalExperience = By.xpath("//div[@class='circle-plus closed opened']//div[@class='circle']");
    static By designation = By.xpath("//input[@placeholder='Enter Designation']");
    static By companyName = By.xpath("//input[@placeholder='Enter Company Name']");
    static By startDate = By.xpath("//input[@placeholder='Select Start Month']");
    static By endDate = By.xpath("//input[@placeholder='Select End Month']");
    static By currentWorking = By.xpath("//span[@class='checkmark']");
    static By rolesAndResponsibilities = By.xpath("//div[@data-placeholder='Ex: Executed plans for the year 2021-22']");
    static By rolesBold = By.xpath("//button[@name='Bold']");
    static By rolesItalic = By.xpath("//button[@name='Italic']");
    static By rolesUnderlined = By.xpath("//button[@name='Underline']");
    static By rolesBullet = By.xpath("//button[@name='Bulleted List']");
    static By rolesNumber = By.xpath("//button[@name='Numbered List']");
    static By rolesUndo = By.xpath("//button[@name='Undo']");
    static By rolesRedo =  By.xpath("//button[@name='Redo']");
    static By rolesSave = By.xpath("//button[@class='saveBtn']");
    static By rolesDiscard = By.xpath("//button[@class='ghostBtn']");
    static By editProfessionalExperience = By.xpath("//img[@src='https://ats.internalstaging.uplers.in/images/talent/edit.svg']");
    static By deleteProfessionalExperience = By.xpath("//img[@src='https://ats.internalstaging.uplers.in/images/talent/delete.svg']");
    static By stayProfessionalExperience = By.xpath("//button[normalize-space()='Stay']");
    static By leaveProfessionalExperience = By.xpath("//button[normalize-space()='Leave']");
    static By closeButtonProfessionalExperience = By.xpath("//div[@class='ReactModal__Content ReactModal__Content--after-open modal commonModal fade show']//button[@aria-label='Close']//*[name()='svg']");


    static By addMajorProjects=By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[4]");
    static By addMoreMajorProjects=By.xpath("//button[normalize-space()='ADD MORE']");
    static By MajorProjectsDescription=By.xpath("//div[@data-placeholder='Ex: Executed plans for the year 2021-22']");
    static By MajorProjectsDescriptionBold = By.xpath("//button[@name='Bold']");
    static By MajorProjectsDescriptionItalic = By.xpath("//button[@name='Italic']");
    static By MajorProjectsDescriptionUnderline = By.xpath("//button[@name='Underline']");
    static By MajorProjectsDescriptionBullet = By.xpath("//button[@name='Bulleted List']");
    static By MajorProjectsDescriptionNumber = By.xpath("//button[@name='Numbered List']");
    static By MajorProjectsDescriptionUndo = By.xpath("//button[@name='Undo']");
    static By MajorProjectsDescriptionRedo = By.xpath("//button[@name='Redo']");




    static By majorProjectsMinimize=By.xpath("//div[@class='circle-plus closed opened']//div[@class='circle']");

    static By projectName=By.xpath("//input[@placeholder='Enter title']");
    static By majorProjectsCompanyName=By.xpath("//input[@placeholder='Enter Company Name']");
    static By majorProjectsStartDate=By.xpath("//*[@id=\"projectsForm\"]/div[4]/div/div/input");
    static By majorProjectsEndDate=By.xpath("//*[@id=\"projectsForm\"]/div[5]/div[1]/div/input");
    static By majorProjectsSaveChanges=By.xpath("//button[@class='saveBtn']");






    static By addCoreCompetencies=By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[5]");
    static By editCoreCompetencies=By.xpath("//button[normalize-space()='EDIT']");

    static By positionOpen=By.xpath("//div[@class='react-select__value-container react-select__value-container--has-value css-1d8n9bt']//div[@class='react-select__input-container css-1nwrnl4']");
    static By positionApplied=By.xpath("//*[@id=\"role\"]");
    static By applicationToolsApplied=By.xpath("//*[@id=\"tools\"]");

    static By portfolioURL=By.xpath("//input[@name='repository_url']");
    static By coreCompetenciesSkills=By.xpath("//*[@id=\"app\"]/div[2]/section/section/div[6]/div[2]/div[2]/div[5]/div/div[1]/div[1]/div[2]");
    static By coreCompetenciesSkillsApplied=By.xpath("//*[@id=\"skills\"]");
    static By coreCompetenciesAchievements=By.xpath("//textarea[@placeholder='Please Enter your Achievement']");
    static By coreCompetenciesAchievementsDelete=By.xpath("//div[@class='achievementInput']//img");
    static By coreCompetenciesAchievementsAdd=By.xpath("//div[@class='addBtn d-flex col-12 col-xl-1']//button");
    static By coreCompetenciesSave=By.xpath("//button[@class='saveBtn']");
    static By coreCompetenciesDelete=By.xpath("//button[@class='ghostBtn']");


    static By addEducation=By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[6]");
    static By addDegreeStream=By.xpath("//input[@placeholder='Ex: Bachelor’s of Technology']");
    static By addUniversitySchool=By.xpath("//input[@placeholder='Ex: Nirmal University']");
    static By educationStartDate=By.xpath("(//input[@placeholder='Select Date'])[1]");
    static By educationEndDate=By.xpath("(//input[@placeholder='Select Date'])[2]");
    static By educationSaveChanges=By.xpath("//button[@class='saveBtn']");

    static By addCertification=By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[7]");
    static By certificationCourseName=By.xpath("//div[@class='react-select__input-container css-1nwrnl4']/input");

    static By certificationIssuingOrganisation=By.xpath("//input[@placeholder='Ex: Electronics and Communication']");
     static By certificationStartDate=By.xpath("(//input[@placeholder='Select Date'])[1]");
    static By certificationEndDate=By.xpath("(//input[@placeholder='Select Date'])[2]");
    static By credentialID=By.xpath("//input[@placeholder='Add Credential ID']");
    static By credentialURL=By.xpath("//input[@placeholder='Add Credential URL']");
    static By credentialSaveChanges=By.xpath("//button[@class='saveBtn']");
    static By certificationDiscardChanges=By.xpath("//button[@class='ghostBtn']");

    static By addTestimonial=By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[8]");

    static By testimonialClientName=By.xpath("//input[@placeholder='Client Name']");
    static By testiomoialCompanyName=By.xpath("//input[@placeholder='Enter Company Name']");
    static By testiomonialDescription=By.xpath("//div[@data-placeholder='Add Testimonial']");
    static By testiomonialDescriptionBold=By.xpath("//button[@name='Bold']");
    static By testiomonialDescriptionItalic= By.xpath("//button[@name='Italic']");
    static By testiomonialDescriptionUnderline=By.xpath("//button[@name='Underline']");
    static By testiomonialDescriptionBullet=By.xpath("//button[@name='Bulleted List']");
    static By testiomonialDescriptionNumber=By.xpath("//button[@name='Numbered List']");
    static By testiomonialDescriptionUndo=By.xpath("//button[@name='Undo']");
    static By testiomonialDescriptionRedo= By.xpath("//button[@name='Redo']");
    static By testiomonialSaveChanges=By.xpath("//button[@class='saveBtn']");
    static By testiomonialDiscard=By.xpath("//button[@class='ghostBtn']");









    static String url = config.get("url");
    static String name = config.get("NameField");
    static String dob = config.get("DOB");
    static String contactNumber = config.get("ContactNumber");
    static String address1 = config.get("Address");
    static String talentCity = config.get("City");
    static String talentPincode = config.get("Pincode");
    static String linkedin = config.get("Linkedin");
    static String resume = config.get("Resume");

    static String currentJobTilte = config.get("CurrentJobTilte");
    static String yearsWorkExperience = config.get("YearsWorkExperience");
    static String currentPay = config.get("CurrentPay");
    static String expectedPay = config.get("ExpectedPay");
    static String talentInterest1 = config.get("Interest1");
    static String talentInterest2 = config.get("Interest2");
    static String talentInterest3 = config.get("Interest3");
    static String preferenceIntroduction = config.get("PreferenceIntroduction");

    static String talentDesignation = config.get("Designation");
    static String talentCompanyName = config.get("CompanyName");
    static String experienceStartDate = config.get("StartDate");
    static String experienceEndDate = config.get("EndDate");
    static String talentRolesAndResponsibilities = config.get("RolesandResponsibilites");

    static String majorProjectsProjectName1 = config.get("ProjectName");
    static String majorProjectsCompanyName1 = config.get("MajorProjectsCompanyName");
    static String majorProjectsStartDate1 = config.get("MajorProjectsStartDate");
    static String majorProjectsEndDate1 = config.get("MajorProjectsEndDate");
    static String majorProjectsDescription1 = config.get("MajorProjectsDescription");

    static String postionOpenFor = config.get("Position");
    static String applicationTools1 = config.get("ApplicationTools1");
    static String applicationsTools2 = config.get("ApplicationsTools2");
    static String applicationsTools3 = config.get("ApplicationsTools3");
    static String repositoryURL = config.get("RepositoryURL");
    static String skills1 = config.get("Skills1");
    static String skills2 = config.get("Skills2");
    static String skills3 = config.get("Skills3");
    static String yourAchievements = config.get("YourAchievements");

    static String Degree = config.get("Degree");
    static String University = config.get("University");
    static String DegreeEducationStartDate = config.get("DegreeEducationStartDate");
    static String DegreeEducationEndDate = config.get("DegreeEducationEndDate");
    static String SchoolStream = config.get("SchoolStream");
    static String School = config.get("School");
    static String SchoolEducationStartDate = config.get("SchoolEducationStartDate");
    static String SchoolEducationEndDate = config.get("SchoolEducationEndDate");


    static String courseName = config.get("CourseName");
    static String issuingOrganization = config.get("IssuingOrganization");
    static String certificationIssueDate = config.get("IssueDate");
    static String certificationExpiryDate = config.get("ExpirationDate");
    static String credentialID1 = config.get("CredentialID");
    static String credentialURL1 = config.get("CredentialURL");


    static String testimonialClientName1 = config.get("TestimonialClientName");
    static String testiomonialCompanyName1 = config.get("TestiomonialCompanyName");
    static String testimonialDescription1 = config.get("TestimonialDescription");


    public static Boolean VerifyProfileLink() {
        driver.findElement(profileLink).isDisplayed();
        return true;
    }

    public static void clickOnProfileLink() {

        driver.findElement(profileLink).click();
    }

    public static String verifyAccordionHeaderText(String section) {
        String accordionHeader = driver.findElement(By.xpath("//div[@class='accordion']/div[1]/h6[contains(text(),'" + section + "')]")).getText();
        return accordionHeader;
    }

    public static void changeProfilePicture() throws AWTException, InterruptedException {
        Robot r = new Robot();
        driver.findElement(profileLink).click();
        driver.findElement(profilePicLink).click();
        driver.findElement(profilePic).sendKeys("C:\\Users\\Admin\\Pictures\\Saved Pictures\\profile.jpg");
        Thread.sleep(10000);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(15000);

    }

    public static void clickPersonalDetails() throws InterruptedException, AWTException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center',inline:'nearest'});",
                driver.findElement(addPersonalDetailButton));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(addPersonalDetailButton)).click().build().perform();

    }

    public static void EditPersonalDetailButton() {

        driver.findElement(EditPersonalDetailButton).click();


    }

    public static void enterPersonalDetails() throws InterruptedException, AWTException {

        Robot r = new Robot();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(NameField).click();
        driver.findElement(NameField).clear();
        driver.findElement(NameField).sendKeys(name);
        driver.findElement(gender).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center',inline:'nearest'});",
                driver.findElement(address));
        driver.findElement(female).click();
        driver.findElement(gender).click();
        driver.findElement(male).click();

        driver.findElement(DOB).click();
        driver.findElement(DOB).clear();
      //  driver.findElement(DOB).sendKeys("04/04/1991");
      //  r.keyPress(KeyEvent.VK_ENTER);
     //   r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(DOB).click();
        Thread.sleep(3000);
        String StartDate_Year = "May 1997";
        String year = StartDate_Year.replaceAll("[^0-9]", "");
        System.out.println(year);
        int years = Integer.parseInt(year);
        while (true) {

            WebElement findElement = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']"));
            String text = findElement.getText();
            System.out.println("text" + text);
            String replaceAll = text.replaceAll("[^0-9]", "");

            int num = Integer.parseInt(replaceAll);
            System.out.println("num" + num);

            if (findElement.getText().equals(StartDate_Year)) {
                break;
                //1996>2000
            } else if (num >= years) {

                driver.findElement(By.xpath("//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--previous']/ancestor::button")).click();

            } else {
                driver.findElement(By.xpath("//span[@class='react-datepicker__navigation-icon react-datepicker__navigation-icon--next']/ancestor::button")).click();
            }
        }

        String actual_Date = "14";
        try {
            List<WebElement> dates = driver
                    .findElements(By.xpath("//div[@class='react-datepicker__month-container']//child::div[@class='react-datepicker__month']//div/div"));
            for (WebElement date : dates) {

                if (date.getText().equals(actual_Date)) {
                    System.out.println(date.getText());

                    Actions a = new Actions(driver);
                    a.click(date).build().perform();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> dates = driver
                    .findElements(By.xpath("//div[@class='react-datepicker__month-container']//child::div[@class='react-datepicker__month']//div/div"));
            for (WebElement date : dates) {

                if (date.getText().equals(actual_Date)) {
                    System.out.println(date.getText());

                    Actions a = new Actions(driver);
                    a.click(date).build().perform();


                }
            }
        }

        driver.findElement(phoneNumber).click();
        driver.findElement(phoneNumber).clear();
        driver.findElement(phoneNumber).sendKeys(contactNumber);
        driver.findElement(address).click();
        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(address1);
        driver.findElement(city).click();
        driver.findElement(city).clear();
        driver.findElement(city).sendKeys(talentCity);
        driver.findElement(pincode).click();
        driver.findElement(pincode).clear();
        driver.findElement(pincode).sendKeys(talentPincode);
        driver.findElement(linkedinEdit).click();
        driver.findElement(linkedinEdit).clear();
        driver.findElement(linkedinEdit).sendKeys(linkedin);
        driver.findElement(resumeReplaceLink).click();
        Thread.sleep(1000);
        driver.findElement(resumeReplaceFile).sendKeys("C:\\Users\\Admin\\Desktop\\Frontend_ATS\\PDF document sample.pdf");
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);

        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center',inline:'nearest'});",
                driver.findElement(personalSaveChanges));
        driver.findElement(personalSaveChanges).click();
        Thread.sleep(2000);
        js.executeScript("window.scroll(200,0)");
        js.executeScript("window.scroll(0,400)");
        Thread.sleep(2000);
    }

    public static void clickPreferences() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center',inline:'nearest'});",
                driver.findElement(addPreferences));
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(addPreferences)).click().build().perform();
        JavascriptExecutor js =(JavascriptExecutor)driver;
//        js.executeScript("window.scroll(1147,19)");
        Thread.sleep(3000);
       driver.findElement(By.xpath("(//div[@class='head']/following-sibling::div[@class='action'])[2]")).click();
        Thread.sleep(3000);
    }

    public static void editPreferences() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center',inline:'nearest'});",
                driver.findElement(editPreferences));
        Actions action = new Actions(driver);
        JavascriptExecutor js =(JavascriptExecutor)driver;
     //   js.executeScript("window.scroll(0,150)");
     //   action.moveToElement(driver.findElement(editPreferences)).click().build().perform();
         driver.findElement(editPreferences).click();
    }

    public static void enterPreferencesData() throws AWTException, InterruptedException {
        Robot r = new Robot();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(jobTitle).click();
        driver.findElement(jobTitle).clear();
        driver.findElement(jobTitle).sendKeys(talentDesignation);
        Thread.sleep(1500);
        driver.findElement(employeeStatus).click();
        Thread.sleep(1500);
        driver.findElement(onContract).click();
        driver.findElement(workExperience).click();
        driver.findElement(workExperience).clear();
        driver.findElement(workExperience).sendKeys(yearsWorkExperience);
        driver.findElement(noticePeriod).click();
        driver.findElement(noticeWithIn2Weeks).click();
        driver.findElement(currentPayAnnually).click();
        driver.findElement(currentPayAnnually).clear();
        driver.findElement(currentPayAnnually).sendKeys(currentPay);
        driver.findElement(expectedPayAnnually).click();
        driver.findElement(expectedPayAnnually).clear();
        driver.findElement(expectedPayAnnually).sendKeys(expectedPay);
        driver.findElement(internationalClientsYes).click();
        driver.findElement(associatedUplers).click();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //  driver.findElement(partTime).click();

        js.executeScript("window.scroll(0,900)");
        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        //     driver.findElement(preference1).click();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //    driver.findElement(preference2_Office).click();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        //   driver.findElement(preference2).click();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        //   driver.findElement(preference1_Hybrid).click();
        //  driver.findElement(preference3).click();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);

        //  driver.findElement(preference3_Remote).click();

        //    driver.findElement(workingHoursPreference1).click();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //  driver.findElement(preference1UKShift).click();
        //  driver.findElement(workingHoursPreference2).click();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //    driver.findElement(preference2USShift).click();

        //  driver.findElement(workingHoursPreference3).click();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        //   driver.findElement(preference3AUShift).click();

        driver.findElement(interest).click();
        Thread.sleep(1000);
        try {
            List<WebElement> findElements = driver.findElements(interestChoose);
            for (WebElement webElement : findElements) {
                System.out.println(webElement.getText());
                if (webElement.getText().equalsIgnoreCase(talentInterest1)) {
                    webElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> findElements = driver.findElements(interestChoose);
            for (WebElement webElement : findElements) {
                System.out.println(webElement.getText());
                if (webElement.getText().equalsIgnoreCase(talentInterest1)) {
                    webElement.click();
                }
            }


        }

        driver.findElement(interest).click();

        try {
            List<WebElement> findElements = driver.findElements(interestChoose);
            for (WebElement webElement : findElements) {
                System.out.println(webElement.getText());
                if (webElement.getText().equalsIgnoreCase(talentInterest2)) {
                    webElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> findElements = driver.findElements(interestChoose);
            for (WebElement webElement : findElements) {
                System.out.println(webElement.getText());
                if (webElement.getText().equalsIgnoreCase(talentInterest2)) {
                    webElement.click();
                }
            }


        }

        driver.findElement(interest).click();

        try {
            List<WebElement> findElements = driver.findElements(interestChoose);
            for (WebElement webElement : findElements) {
                System.out.println(webElement.getText());
                if (webElement.getText().equalsIgnoreCase(talentInterest3)) {
                    webElement.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            List<WebElement> findElements = driver.findElements(interestChoose);
            for (WebElement webElement : findElements) {
                System.out.println(webElement.getText());
                if (webElement.getText().equalsIgnoreCase(talentInterest3)) {
                    webElement.click();
                }
            }


        }
        driver.findElement(introduction).click();
        driver.findElement(introduction).sendKeys(preferenceIntroduction);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        driver.findElement(introductionBold).click();
        driver.findElement(introductionItalic).click();
        driver.findElement(introductionUnderlined).click();
        driver.findElement(introductionBullet).click();
        driver.findElement(introductionNumber).click();
        driver.findElement(introductionUndo).click();
        driver.findElement(introductionRedo).click();
        r.keyRelease(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);

        js.executeScript("window.scroll(0,1500)");
        Thread.sleep(5000);
        driver.findElement(preferencesSaveChanges).click();
        Thread.sleep(5000);
    }

    public static void clickProfessionalExperience() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,400)");
        Thread.sleep(1000);
        driver.findElement(addProfesionalExperince).click();

    }

    public static void editProfessionalExperience() {
        driver.findElement(editProfessionalExperience).click();

    }

    public static void editCoreCompetencies() {
        driver.findElement(editCoreCompetencies).click();

    }

    public static void editEducation() {
        driver.findElement(editProfessionalExperience).click();

    }

    public static void editCertification() {
        driver.findElement(editProfessionalExperience).click();

    }

    public static void editTestimonials() {
        driver.findElement(editProfessionalExperience).click();

    }

    public static void enterProfessionalExperienceData() throws AWTException, InterruptedException {
        Robot r = new Robot();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,700)");
        driver.findElement(designation).click();
        driver.findElement(designation).clear();
        driver.findElement(designation).sendKeys(talentDesignation);
        driver.findElement(companyName).click();
        driver.findElement(companyName).clear();
        driver.findElement(companyName).sendKeys(talentCompanyName);
       // js.executeScript("window.scroll(0,600)");
        driver.findElement(startDate).click();
        driver.findElement(startDate).clear();
        driver.findElement(startDate).sendKeys(experienceStartDate);
        driver.findElement(endDate).click();
        driver.findElement(endDate).clear();
        driver.findElement(endDate).sendKeys(experienceEndDate);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
       js.executeScript("window.scroll(0,1000)");
        driver.findElement(rolesAndResponsibilities).click();
        driver.findElement(rolesAndResponsibilities).sendKeys(talentRolesAndResponsibilities);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        driver.findElement(rolesBold).click();
        driver.findElement(rolesItalic).click();
        driver.findElement(rolesUnderlined).click();
        driver.findElement(rolesBullet).click();
        driver.findElement(rolesNumber).click();
        driver.findElement(rolesUndo).click();
        driver.findElement(rolesRedo).click();
        r.keyRelease(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        js.executeScript("window.scroll(0,1200)");
        driver.findElement(rolesSave).click();
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(2000);

    }

    public static void clickMajorProjects() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scroll(0,600)");
        Thread.sleep(1000);
            driver.findElement(addMajorProjects).click();
    }



    public static void clickCoreCompetencies() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(1000);
        driver.findElement(addCoreCompetencies).click();
    }

    public static void clickEducation() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,800)");
        Thread.sleep(1000);
        driver.findElement(addEducation).click();
      //  driver.findElement().click();
    }

    public static void clickCertification() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,900)");
        Thread.sleep(1000);
        driver.findElement(addCertification).click();
     //   driver.findElement().click();
    }

    public static void clickTestimonials() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,1200)");
        Thread.sleep(1000);
        driver.findElement(addTestimonial).click();

      //  driver.findElement().click();
    }

    public static void addMoreMajorProjects() throws InterruptedException {

    }

    public static void addMoreEducation() throws InterruptedException {

    }
    public static void enterMajorProjects() throws InterruptedException, AWTException {
        Robot r = new Robot();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Thread.sleep(3000);
        js.executeScript("window.scroll(0,900)");


        driver.findElement(projectName).click();
        driver.findElement(projectName).clear();
        driver.findElement(projectName).sendKeys(majorProjectsProjectName1);

        driver.findElement(majorProjectsCompanyName).click();
        driver.findElement(majorProjectsCompanyName).clear();
        driver.findElement(majorProjectsCompanyName).sendKeys(majorProjectsCompanyName1);
        Thread.sleep(1000);
        js.executeScript("window.scroll(0,900)");
        Thread.sleep(3000);
        driver.findElement(MajorProjectsDescription).click();
        driver.findElement(MajorProjectsDescription).sendKeys(majorProjectsDescription1);
        driver.findElement(MajorProjectsDescriptionBold).click();
        driver.findElement(MajorProjectsDescriptionItalic).click();
        driver.findElement(MajorProjectsDescriptionUnderline).click();
        driver.findElement(MajorProjectsDescriptionBullet).click();
        driver.findElement(MajorProjectsDescriptionNumber).click();
        driver.findElement(MajorProjectsDescriptionUndo).click();
        driver.findElement(MajorProjectsDescriptionRedo).click();

        js.executeScript("window.scroll(0,1200)");

        driver.findElement(majorProjectsStartDate).click();
        for(int i=0 ; i<=7 ; i++) {
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.keyRelease(KeyEvent.VK_BACK_SPACE);  Thread.sleep(1000);
        }
        driver.findElement(majorProjectsStartDate).sendKeys(majorProjectsStartDate1);
        driver.findElement(majorProjectsEndDate).click();
        for(int i=0 ; i<=7 ; i++) {
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.keyRelease(KeyEvent.VK_BACK_SPACE);
        }
        driver.findElement(majorProjectsEndDate).sendKeys(majorProjectsEndDate1);
        js.executeScript("window.scroll(0,1300)");
        driver.findElement(majorProjectsSaveChanges).click();
        Thread.sleep(3000);


    }

    public static void enterCoreCompetencies() throws InterruptedException, AWTException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Robot r = new Robot();
        js.executeScript("window.scroll(0,1000)");
        driver.findElement(positionOpen).click();
        Thread.sleep(2000);
        driver.findElement(positionApplied).sendKeys(postionOpenFor);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);

        for (int i = 0; i <=10; i++) {
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.keyRelease(KeyEvent.VK_BACK_SPACE);
        }

        driver.findElement(applicationToolsApplied).sendKeys(applicationTools1);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(applicationToolsApplied).sendKeys(applicationsTools2);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        driver.findElement(applicationToolsApplied).sendKeys(applicationsTools3);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        r.delay(1000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.delay(1000);
        r.keyPress(KeyEvent.VK_DELETE);
        r.keyRelease(KeyEvent.VK_DELETE);
        r.delay(1000);
        r.keyRelease(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);

        driver.findElement(portfolioURL).sendKeys(repositoryURL);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);

        for (int i = 0; i <= 10; i++) {
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_BACK_SPACE);
            r.keyRelease(KeyEvent.VK_BACK_SPACE);
        }

     //   driver.findElement(coreCompetenciesSkills).click();
        driver.findElement(coreCompetenciesSkillsApplied).sendKeys(skills1);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(coreCompetenciesSkillsApplied).sendKeys(skills2);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(coreCompetenciesSkillsApplied).sendKeys(skills3);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        driver.findElement(coreCompetenciesAchievements).click();
        driver.findElement(coreCompetenciesAchievements).sendKeys();
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        driver.findElement(coreCompetenciesAchievementsDelete).click();
        driver.findElement(coreCompetenciesAchievementsAdd).click();
        driver.findElement(coreCompetenciesAchievements).click();
        driver.findElement(coreCompetenciesAchievements).sendKeys(yourAchievements);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        driver.findElement(coreCompetenciesSave).click();
        Thread.sleep(2000);
        js.executeScript("scroll(600,0)");

        js.executeScript("scroll(0,1200)");
        Thread.sleep(2000);

    }
    public static void enterEducation() throws InterruptedException, AWTException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Robot r = new Robot();
        driver.findElement(addDegreeStream).sendKeys(Degree);
        driver.findElement(addUniversitySchool).sendKeys(University);
        driver.findElement(educationStartDate).sendKeys(DegreeEducationStartDate);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(educationEndDate).sendKeys(DegreeEducationEndDate);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        js.executeScript("window.scroll(0,1200)");
        driver.findElement(educationSaveChanges).click();



    }

    public static void enterCertification() throws InterruptedException, AWTException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Robot r = new Robot();
        driver.findElement(certificationCourseName).sendKeys(courseName);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        driver.findElement(certificationIssuingOrganisation).sendKeys(issuingOrganization);
        driver.findElement(certificationStartDate).sendKeys(certificationIssueDate);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(certificationEndDate).sendKeys(certificationExpiryDate);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(credentialID).sendKeys(credentialID1);
        driver.findElement(credentialURL).sendKeys(credentialURL1);
        js.executeScript("window.scroll(0,1400)");
        Thread.sleep(6000);
        driver.findElement(educationSaveChanges).click();

        Thread.sleep(6000);


    }


    public static void enterTestimonials() throws InterruptedException, AWTException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Robot r = new Robot();
        driver.findElement(testimonialClientName).sendKeys(testimonialClientName1);
        driver.findElement(testiomoialCompanyName).sendKeys(testiomonialCompanyName1);

        js.executeScript("window.scroll(0,1400)");
        Thread.sleep(3000);
        driver.findElement(testiomonialDescription).click();
        driver.findElement(testiomonialDescription).sendKeys(testimonialDescription1);
        driver.findElement(testiomonialDescriptionBold).click();
        driver.findElement(testiomonialDescriptionItalic).click();
        driver.findElement(testiomonialDescriptionUnderline).click();
        driver.findElement(testiomonialDescriptionBullet).click();
        driver.findElement(testiomonialDescriptionUndo).click();
        driver.findElement(testiomonialDescriptionRedo).click();

        Thread.sleep(3000);


       js.executeScript("window.scroll(0,2000)");
        driver.findElement(educationSaveChanges).click();



    }


}