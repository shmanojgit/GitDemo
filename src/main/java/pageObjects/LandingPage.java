package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navBar = By.xpath("//div[@class='header-upper']//div[@class='clearfix']");
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement gettitle()
	{
		return driver.findElement(title);
		
	}
	
	public WebElement navigationbar()
	{
		return driver.findElement(navBar);
	}
	
}
