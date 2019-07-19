package tce;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOS {
	public static IOSDriver<MobileElement> driver;

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.10.0");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"SBMOB0197");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SBMOB173");
		// capabilities.setCapability(MobileCapabilityType.UDID,"f90a43f10cad76bb01340243773cd37eb9085110");
		capabilities.setCapability(MobileCapabilityType.UDID, "83af28cf7697e063c234812bdb7f291a8f6bf6a0");
		// capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1.3");

		// capabilities.setCapability(MobileCapabilityType.APP,
		// "/Users/ishans/Desktop/IntegrationApp.app");
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/sapnamishra/Desktop/Payload/Tata_Test_App.app");
		// capabilities.setCapability(MobileCapabilityType.APP,
		// "/Users/ishans/Desktop/Tata_Test_App.ipa");

		capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);

		System.out.println("Session is created");

		driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// driver.findElementByAccessibilityId("alabel").click();
		// driver.findElementByName("SIGN UP").click();
		driver.findElementByName("username_field").sendKeys("Ishan");
		driver.findElementByName("password_field").sendKeys("Ishan@123");
		driver.findElementByName("signin_button").click();
		// driver.findElementByName("Scrolling").click();
		// driver.findElementByName("TableView").click();
		// driver.findElementByName("40").click();

		// driver.findElement(By.xpath("//XCUIElementTypeButton[@name='TableView']"));
		// XCUIElementTypeStaticText[@name="83"]
		// driver.findElement(By.xpath("XCUIElementTypeStaticText[@name='83']"));

		// driver.findElementByName("Agree").click();
		// driver.findElements(By.xpath("//element[@value='First Name']")).clear();
		// driver.findElement(By.xpath("//*[contains(text(),'First
		// Name')]")).sendKeys("santhosh");
		// driver.findElement(By.xpath("//XCUIElementTypeApplication[@name="+"CollegeHunch"+"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField[1]")).sendKeys("santhosh");

		// Actions builder =new Actions (driver);
		// builder.moveTOElement

		// *[contains(text(),'match')]

		// Point point = element.getLocation();
		// driver.findElementsByLinkText("First Name");

		// driver.findElementByXPath("//XCUIElementTypeSlider[1]");
		driver.quit();

	}
}
