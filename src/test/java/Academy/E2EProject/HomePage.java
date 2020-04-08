package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base{
	Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initializing() throws IOException
	{
		driver=intializeDriver();
		
	}
	
	@Test(dataProvider = "getData")
	public void baseNavigationDriver(String email, String password, String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage login = new LoginPage(driver);
		log.info(text);
		login.email().sendKeys(email);
		login.password().sendKeys(password);
		login.Loginbutton().click();
		log.info("Get login selected");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getData()
	{	
	Object data[][] = new Object[2][3];
	data[0][0]="nonrestrict@test.com";
	data[0][1]="test1234";
	data[0][2]="Non-restricted user";
	
	data[1][0]="restrict@test.com";
	data[1][1]="test1234";
	data[1][2]="restricted user";
	
	return data;
	}
}
