package basicflow;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import pages.CheckoutPage;
import pages.LoginPage;
import utility.GenericLogic;
import utility.base;

/**
 * Unit test for simple App.
 */
public class AppTest extends base {
	LoginPage lpg;
	CheckoutPage ckpage;
	GenericLogic glogic;
	TouchAction ta;

	@Test
	private void FirstTest() throws MalformedURLException, InterruptedException {
		System.out.println("Starttttttttttttttt");
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lpg = new LoginPage(driver);
		lpg.singleTransaction();

		lpg.selectCreo(driver);
		
		ckpage = new CheckoutPage(driver);
		ckpage.clickFirstProduct();
		glogic = new GenericLogic(driver);
		glogic.scrollToText("ADD TO BAG");
		ckpage.movetoBag();

		ckpage.checkoutProducts();

		ckpage.finalCheckout();
		System.out.println("Successsssssssssssssssssss");
	}

	private TouchAction element(WebElement sweatshirts) {
		// TODO Auto-generated method stub
		return null;
	}

}
