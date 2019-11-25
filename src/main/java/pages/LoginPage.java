package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class LoginPage {
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//*[@text='ENGLISH']")
	private WebElement english;

	@AndroidFindBy(xpath = "//*[@text='MEN']")
	private WebElement men;

	@AndroidFindBy(xpath = "//*[@text='United Arab Emirates']")
	private WebElement countryUAE;

	@AndroidFindBy(xpath = "//*[@text='Next']")
	private WebElement next;

	@AndroidFindBy(xpath = "//*[@text='AED']")
	private WebElement currencyAED;

	@AndroidFindBy(xpath = "//*[@text='Account']")
	private WebElement Account;

	@AndroidFindBy(xpath = "//*[@text='SIGN IN']")
	private WebElement signinOption;

	@AndroidFindBy(xpath = "//*[@text='Email']")
	private WebElement email;

	@AndroidFindBy(xpath = "//*[@text='Password']")
	private WebElement password;

	@AndroidFindBy(xpath = "//*[@text='SIGN IN']")
	private WebElement loginButton;

	@AndroidFindBy(xpath = "//*[@text='Home']")
	private WebElement homeOption;
	
	@AndroidFindBy(xpath ="//android.view.ViewGroup[@bounds='[824,110][896,176]']")
	private WebElement searchicon;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.EditText']")
	private WebElement enterSearch;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Creo']")
	private WebElement selectCreo;

	public void singleTransaction() throws InterruptedException {
		Thread.sleep(8000);
		english.click();
		System.out.println("Click on ENGLISH Option");

		Thread.sleep(5000);
		men.click();
		System.out.println("Click on MEN Option");

		countryUAE.click();
		System.out.println("Selected country as UAE");

		next.click();
		System.out.println("Clicked Next option");

		currencyAED.click();
		System.out.println("Selected currency as AED");

		Account.click();
		System.out.println("Clicked Account link");

		signinOption.click();
		System.out.println("Clicked on Sign In option");

		email.sendKeys("yousif.agha@elabelz.com");
		System.out.println("Enter Username");

		password.sendKeys("elabelz123");
		System.out.println("Enter Password");

		loginButton.click();
		System.out.println("Click Login option");

		homeOption.click();
		System.out.println("Click on Home Option");

		searchicon.click();
		System.out.println("Click on Search Icon");

		enterSearch.sendKeys("Creo");
		System.out.println("Search for product Creo");
		}
	
	public void selectCreo(AndroidDriver<AndroidElement> driver) throws InterruptedException {
		
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	selectCreo.click();
	System.out.println("Select Creo from the search list");
	}

}