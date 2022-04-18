package Native;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class native_app extends Capabilities {
	
	// getting the driver from the capabilities
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
		driver = capability();
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		// clicking on the preference in the app
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		Thread.sleep(3000);
		
		// clicking on the next page
		driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
		Thread.sleep(3000);
		
		// clicking on the radio button
		//android:id/checkbox
		driver.findElement(By.id("android:id/checkbox")).click();
		Thread.sleep(3000);
		
		// now to click on wifi settings (which does not have accessbility id)
		// and the xpath is complex
		// using only attribute and not locator
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
		Thread.sleep(3000);
		
		// other ways of clicking on that button
		//driver.findElement(By.xpath("//*[@text='Wifi Setting']")).click();
		
		// Sending keys to the element
		driver.findElement(By.id("android:id/edit")).sendKeys("liesl");
		Thread.sleep(3000);
		
		// clicking on button with class name
		// when using class name, it stores the elements in a list
		// to access the elements, we use index number
		//driver.findElements(By.className("android.widget.Button")).get(0).click();
		
		// clicking on the okay button
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		Thread.sleep(3000);
		
		// navigating back
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		
		// navigating to home
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(3000);
		
		// opening the navigation bar
		driver.openNotifications();
		Thread.sleep(2000);
		
		// chosing and element in the navigation bar
		driver.findElement(MobileBy.AccessibilityId("Battery Saver")).click();
	}

	
	

}
