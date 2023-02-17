package pageObject;

import com.gargoylesoftware.htmlunit.html.DomNode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import webDriver.Driver;
import testRunner.TestRunner;

public class LoginPage {


    static WebDriver driver = Driver.getCurrentDriver();
    static String url = TestRunner.config.get("url");
    static By username = By.xpath("//input[@id='Username']");
    static By password = By.xpath("//input[@id='Password']");
    static By LoginButton = By.className("cta-button");


    public static void launchUrl() throws InterruptedException {
        System.out.println(url);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static boolean emailFieldIsDisplayed() {
        driver.findElement(username).isDisplayed();
        return true;
    }

    public static boolean PasswordIsDisplayed() {
        driver.findElement(password).isDisplayed();
        return true;
    }

    public static void EnterEmailId() {
        driver.navigate().refresh();
        driver.findElement(username).sendKeys(TestRunner.config.get("emailid"));
    }

    public static void EnterPassword() {

        driver.findElement(password).sendKeys(TestRunner.config.get("password"));
    }

    public static void LoginButton() throws InterruptedException {
Thread.sleep(5000);

        driver.findElement(LoginButton).click();
    }
}
