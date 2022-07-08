package nopCart;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Nopcart_ecommerce_apps {
	
	public static AppiumDriver<MobileElement> driver ;
	@Test
	public static void main(String[] args) throws InterruptedException {
	appiumTest1();
		
	}
	public static void appiumTest1() throws InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "11");
		caps.setCapability("deviceName", "Nokia 2.2");
		caps.setCapability("app", "/Users/media365ltd_gazii/Downloads/nopstationCart_4.40.apk");
		
//		caps.setCapability("platformName", "Android");
//		caps.setCapability("platformVersion", "9");
//		caps.setCapability("deviceName", "AOSP on IA Emulator");
//		caps.setCapability("udid", "emulator-5554");
		
		try {
			URL url =new URL("http://0.0.0.0:4723/wd/hub/");

			driver = new AppiumDriver<MobileElement>(url,caps);
			
			
			//Scenario: 01 Customer add products in his shopping cart
			
			// I READ & I ACCEPT when app first time on  //android.widget.Button[@text = 'I READ & I ACCEPT']
			// 
			
			//Mike click I READ & I ACCEPT
			Thread.sleep(7000);
			MobileElement click_accept=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept"));
			click_accept.click();


			
			//Mike click categories
			//Thread.sleep(3000);
			MobileElement click_categories=driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"NopStation Cart\"]"));
			click_categories.click();
			
			//Mike click "electronics"
			Thread.sleep(2000);
			MobileElement click_electronics=driver.findElement(By.xpath("//android.widget.TextView[@text = 'Electronics']"));
			click_electronics.click();
			
			// scrolling for find Nokia Lumia 1020 
			driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().text(\"Nokia Lumia 1020\"))"));
			
			//Mike click Nokia Lumia 1020 details page
			Thread.sleep(8000);
			MobileElement click_nokia_detl_page=driver.findElement(By.xpath("//android.widget.TextView[@text = 'Nokia Lumia 1020']"));
			click_nokia_detl_page.click();
			
			// scrolling for find Nokia Lumia 1020 
						Thread.sleep(8000);
						driver.findElement(MobileBy.AndroidUIAutomator(
						        "new UiScrollable(new UiSelector().scrollable(true))" +
						         ".scrollIntoView(new UiSelector().text(\"Size\"))"));
						
			//Mike click size
			Thread.sleep(3000);
			MobileElement click_size=driver.findElement(By.xpath("//android.widget.TextView[@text = 'Small']"));
			click_size.click();
			
			//Mike click large
			Thread.sleep(3000);
			MobileElement click_size_large=driver.findElement(By.xpath("//android.widget.RadioButton[@text = 'Large ']"));
			click_size_large.click();
			
			//Mike click large done
			Thread.sleep(3000);
			MobileElement click_size_large_done=driver.findElement(By.xpath("//android.widget.TextView[@text = 'Done']"));
			click_size_large_done.click();	
			
			//Mike click plus icon 
			Thread.sleep(3000);
			MobileElement click_plus=driver.findElement(By.xpath("//android.widget.Button[@text = '+']"));
			click_plus.click();	
			
			//Mike click add to cart
			Thread.sleep(3000);
			MobileElement click_cart=driver.findElement(By.xpath("//android.widget.Button[@text = 'ADD TO CART']"));
			click_cart.click();	
			
			
			
			
			// Scenario: 02 Customer successfully place order as a guest user
			
			//Mike go to shopping cart by clicking top cart icon
			Thread.sleep(3000);
			MobileElement click_top_cart_icon=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/counterIcon"));
			click_top_cart_icon.click();	

			// Mike click checkout button from shopping cart page
			Thread.sleep(7000);
			MobileElement click_shopping_cart_page_checkout=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut"));
			click_shopping_cart_page_checkout.click();
			
			// Mike click checkout button from shopping cart page
			Thread.sleep(2000);
			MobileElement click_checkout_guest=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout"));
			click_checkout_guest.click();
			
			// Mike input all the details in checkout billing details page and click continue
			
			// Enter Mike first name
			Thread.sleep(4000);
			MobileElement enter_first_name=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName"));
			enter_first_name.sendKeys("Mr.");
			
			// Enter Mike last name
			Thread.sleep(2000);
			MobileElement enter_last_name=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName"));
			enter_last_name.sendKeys("Mike");
			
			// Enter Mike Email
			Thread.sleep(2000);
			MobileElement enter_email=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail"));
			enter_email.sendKeys("mike@gmail.com");
			
			// Select Mike country
			Thread.sleep(2000);
			MobileElement click_country=driver.findElement(By.xpath("//android.widget.TextView[@text = 'Select country']"));
			click_country.click();
			
			// Select Mike country name
			Thread.sleep(2000);
			MobileElement click_country2=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]"));
			click_country2.click();

			// Select Mike state
			Thread.sleep(3000);
			MobileElement click_state=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner"));
			click_state.click();
			
			// Select Mike state name
			Thread.sleep(3000);
			MobileElement click_state2=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
			click_state2.click();
			
			// Enter Mike company name
			Thread.sleep(2000);
			MobileElement enter_company_name=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName"));
			enter_company_name.sendKeys("Brain station 23 ");
			
			// scrolling for find CONTINUE button 
			driver.findElement(MobileBy.AndroidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().text(\"CONTINUE\"))"));
			
			// Enter Mike city name
			Thread.sleep(2000);
			MobileElement enter_company_city=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity"));
			enter_company_city.sendKeys("Dhaka");
			
			// Enter Mike street address 
			Thread.sleep(2000);
			MobileElement enter_street_address=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress"));
			enter_street_address.sendKeys("2/3 ");
			
			// Enter Mike street address 2
			Thread.sleep(2000);
			MobileElement enter_street_address2=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress2"));
			enter_street_address2.sendKeys("Ring road");
			
			// Enter Mike zip code
			Thread.sleep(2000);
			MobileElement enter_zip_code=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode"));
			enter_zip_code.sendKeys("1200");

			// Enter Mike phone number
			Thread.sleep(2000);
			MobileElement enter_phone_number=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone"));
			enter_phone_number.sendKeys("01677020544");
			
			// Enter Mike fax number
			Thread.sleep(2000);
			MobileElement enter_fax_number=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFax"));
			enter_fax_number.sendKeys("123456789");
			
			// Click CONTINUE
			Thread.sleep(2000);
			MobileElement click_continue=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue"));
			click_continue.click();
		
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.RelativeLayout[3]/android.widget.TextView[@text = 'Next Day Air']"))); 

			
			// scrolling end page 
			driver.findElement(MobileBy.AndroidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));
		   
			
			// Mike select "Next Day Air" as shipping method
			Thread.sleep(2000);
			MobileElement next_day_air=driver.findElement(By.xpath("//android.widget.RelativeLayout[3]/android.widget.TextView[@text = 'Next Day Air']"));
			next_day_air.click();
						
			// Mike select "Next Day Air" as shipping method and click continue
			Thread.sleep(2000);
			MobileElement next_day_air_continue=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
			next_day_air_continue.click();
			
			// scrolling end page 
			Thread.sleep(4000);
			driver.findElement(MobileBy.AndroidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10000)"));
			
			// Mike select "Check/Money Order" as payment method
			Thread.sleep(2000);
			MobileElement mony_order=driver.findElement(By.xpath("//android.widget.TextView[@text = 'Check / Money Order']"));
			mony_order.click();
						
			// Mike select "Check/Money Order" as payment method and click continue
			Thread.sleep(2000);
			MobileElement mony_order_continue=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button"));
			mony_order_continue.click();
		
			// Mike click next button on payment information page
			Thread.sleep(5000);
			MobileElement next=driver.findElement(By.xpath("//android.widget.Button[@text = 'Next']"));
			next.click();
			
			//Mike click confirm button to place the order
			Thread.sleep(4000);
			MobileElement confirm=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/checkoutButton"));
			confirm.click();
			
			//Your order has been successfully processed
			Thread.sleep(7000);
			MobileElement successfull_continue=driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/md_button_positive"));
			successfull_continue.click();

				
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
