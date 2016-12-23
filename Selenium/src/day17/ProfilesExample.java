package day17;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfilesExample {

	public static void main(String[] args) {
		//create a ProfilesIni Object
		ProfilesIni pr=new ProfilesIni();
		//Create a firefox profile object...and point to the profile we created
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://msn.com");
		

	}

}








