package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateNavbar extends Base {
	Logger log = LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void initializing() throws IOException
	{
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void navigationBar() throws IOException
	{
	LandingPage l = new LandingPage(driver);
	Assert.assertTrue(l.navigationbar().isDisplayed());
	log.info("Navigation bar is displayed");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
