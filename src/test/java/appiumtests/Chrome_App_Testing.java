package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Chrome_App_Testing {

	public static void main(String[] args) {
		try{
			google_Testing();
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			exp.getMessage();
			exp.printStackTrace();
		}
	}
	

	static AppiumDriver<MobileElement> driver;
	
	
	public static void google_Testing() throws MalformedURLException
	{
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1713");
		cap.setCapability("udid", "FXYDU17904002436");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Application started for Google ");
		
		MobileElement accept_Continue = driver.findElementById("com.android.chrome:id/terms_accept");
		MobileElement nextButton = driver.findElementById("com.android.chrome:id/next_button");
		MobileElement YesIam_Btn = driver.findElementById("com.android.chrome:id/negative_button");
		MobileElement searchText = driver.findElementByClassName("android.widget.EditText");
		MobileElement searchBtn = driver.findElementByClassName("android.widget.Button");
		MobileElement xpanxion = driver.findElementByClassName("android.view.View");
		
		accept_Continue.click();
		nextButton.click();
		YesIam_Btn.click();
		searchText.sendKeys("Xpanxion ust global");
		searchBtn.click();
		xpanxion.click();
		
	    	   System.out.println("Completed");
		
	}
		
	
	
}
