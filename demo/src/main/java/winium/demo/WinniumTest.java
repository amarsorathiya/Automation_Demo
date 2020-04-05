package winium.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WinniumTest {
	
	 static WiniumDriver driver = null;
	    static WiniumDriverService service = null;
	    static DesktopOptions options = null;
	
	@BeforeClass
	private void SetUp() {
	    options = new DesktopOptions(); //Instantiate Winium Desktop Options
	    options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
	    File driverPath = new File("E:\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe");
	    System.setProperty("webdriver.winium.desktop.driver","E:\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe");
	    service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true)
	            .withSilent(false).buildDesktopService();
	    try {
	        service.start();
	    } catch (IOException e) {
	        System.out.println("Exception while starting WINIUM service");
	        e.printStackTrace();
	    }
	}
	
	
	@AfterClass
	private void tearDown() {
		driver.quit();
		
	}
	
	@Test
	private void demoTest() {
		
		
	}
	
	

}
