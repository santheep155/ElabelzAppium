package utility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GenericLogic {
	AndroidDriver<AndroidElement>  driver;
	
	public GenericLogic(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	
	public void scrollToText(String text)
	{
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	}
	


}
