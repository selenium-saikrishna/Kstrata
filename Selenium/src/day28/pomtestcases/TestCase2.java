package day28.pomtestcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day28.pageclasses.LeftMenu;
import day28.pageclasses.RegisterMercuryTours;
import day28.pageclasses.WelcomeMercuryTours;

public class TestCase2 {
	@Test
	public void registrationTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours wmPage=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		LeftMenu leftMenuPage=PageFactory.initElements(driver,LeftMenu.class);
		RegisterMercuryTours rmPage=PageFactory.initElements(driver,RegisterMercuryTours.class);
		
		wmPage.register();
		rmPage.contactInformation();
		leftMenuPage.home();
		wmPage.findAFlight("tutorial","tutorial");
		
		
		
		
		
	}

}
