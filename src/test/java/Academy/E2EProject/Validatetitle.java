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
public class Validatetitle extends Base {
	
Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initializing() throws IOException
	{
		driver=intializeDriver();
		log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home page");
	}
	
	@Test
	public void baseNavigationDriver() throws IOException
	{
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.gettitle().getText(), "Featured Course");
		log.info("Successfully validated text message");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
