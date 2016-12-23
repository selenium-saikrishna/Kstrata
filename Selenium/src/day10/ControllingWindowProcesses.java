package day10;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ControllingWindowProcesses {

	
	public static void main(String[] args) {
		WindowsUtils.killByName("notepad.exe");
		WindowsUtils.killByName("firefox.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.close();
		//Sleeper.sleepTightInSeconds(4);
		WindowsUtils.killByName("eclipse.exe");
		
	}

}
