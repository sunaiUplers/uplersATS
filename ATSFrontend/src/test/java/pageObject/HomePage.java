package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testRunner.TestRunner;
import webDriver.Driver;

public class HomePage {

	static WebDriver driver = Driver.getCurrentDriver();
	static String url = TestRunner.config.get("url");
	static By homePageHeader = By.xpath("//div[@class='heading']");
	static By password = By.id("Password");
	static By LoginButton = By.className("cta-button");

	public static Boolean VerifyHomePageHeader(){
		driver.findElement(homePageHeader).isDisplayed();
		return true;
	}

	public static String getHomePageHeader(){
		String headerText=driver.findElement(homePageHeader).getText();
		return headerText;
	}

	public static String getPageTitle() {
		String Title= driver.getTitle();
		return Title;
	}
}
