package Native;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	// returning android driver element and naming the method capability
	public static AndroidDriver<AndroidElement> capability() throws MalformedURLException 

	{
			
		DesiredCapabilities cp = new DesiredCapabilities();
			
		cp.setCapability(MobileCapabilityType.DEVICE_NAME, "First");
			
		cp.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		
		// setting teh app package as shown in the appium
		cp.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		
		// setting the app activities as shown in appium
		cp.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		
		// this line is very important when you want to automate ios
		//cp.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		
		// to automate android, the automate name is changed
		cp.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		
		// createing the android element driver
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cp);
		return driver;


		}

	}


