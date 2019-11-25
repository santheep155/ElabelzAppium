package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheckoutPage {
	public CheckoutPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[36,374][522,1074]']")
	private WebElement firstProduct;

	@AndroidFindBy(xpath = "//*[@text='ADD TO BAG']")
	private WebElement addtoBag;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@bounds='[50,116][105,171]']")
	private WebElement backButton;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@bounds='[558,374][1044,1074]']")
	private WebElement secondProduct;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@bounds='[953,107][1013,179]']")
	private WebElement gotoCart;

	@AndroidFindBy(xpath = "//*[@text='CHECKOUT']")
	private WebElement checkout;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Shipping Address']")
	private WebElement shippingAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SAVE & PAY']")
	private WebElement selectAndroidAddress;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@bounds='[554,682][1025,836]']")
	private WebElement selectCod;
	 
	@AndroidFindBy(xpath = "//*[@text='PLACE ORDER']")
	private WebElement placeorder;

	public void clickFirstProduct() throws InterruptedException {
		Thread.sleep(5000);
		firstProduct.click();
		System.out.println("Selected First Product");
	}

	public void movetoBag() throws InterruptedException {
		addtoBag.click();
		System.out.println("Move to Bag clicked");

		backButton.click();
		System.out.println("Clicked on back button");
	}

	public void clickSecondProduct() throws InterruptedException {
		Thread.sleep(5000);
		secondProduct.click();
		System.out.println("Selected Second Product");
	}

	public void checkoutProducts() throws InterruptedException {

		gotoCart.click();
		System.out.println("Clicked on Go to CART");

		checkout.click();
		System.out.println("Clicked on checkout button");

		//shippingAddress.click();
		//System.out.println("Clicked on Shipping Address Option");
	}

	public void finalCheckout() throws InterruptedException {
		//selectAndroidAddress.click();
		//System.out.println("Android Address Selected");
		selectCod.click();
		System.out.println("Select COD option");		
		
		placeorder.click();
		System.out.println("Clicked on Save and Pay");
	}

}