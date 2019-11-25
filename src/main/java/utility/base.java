package utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException  {
		

		// TODO Auto-generated method stub
		File appDir = new File("src");
		//File app = new File(appDir, "ApiDemos-debug.apk");
		File app = new File(appDir, "Elabelz_com.progos.elabelz.apk");
		DesiredCapabilities capo = new DesiredCapabilities();
		capo.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel3AVD");
		capo.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capo.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capo);
		return driver;			
		}

}
