package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class IRCTC_App_Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static AppiumDriver<MobileElement> driver;
	
	
	public static void openCalculator() throws MalformedURLException
	{
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1713");
		cap.setCapability("udid", "FXYDU17904002436");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "cris.org.in.prs.ima");
		cap.setCapability("appActivity", "cris.org.in.ima.activities.BookingOtpActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Application started for IRCTC");
		
		/*MobileElement two = driver.findElementById("com.android.calculator2:id/digit_2");
		MobileElement plus = driver.findElementById("com.android.calculator2:id/op_add");
		MobileElement three = driver.findElementById("com.android.calculator2:id/digit_3");
		MobileElement equals = driver.findElementById("com.android.calculator2:id/eq");
		MobileElement result = driver.findElementByClassName("android.widget.EditText");
		
		two.click();
		plus.click();
		three.click();
		equals.click();
		
	    String Rs = result.getText();
	    System.out.println("Result is ="+Rs);
	    System.out.println("Completed");*/
		
	}
		
	
	
}
