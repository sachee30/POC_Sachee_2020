import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base {

		public AndroidDriver<MobileElement> driver;
		
	public AndroidDriver<MobileElement>  basecall() throws Exception
		{
		DesiredCapabilities DC=new DesiredCapabilities();
		DC.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		DC.setCapability(MobileCapabilityType.DEVICE_NAME,"EmuL");
		DC.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
		DC.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
		DC.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver<>(url,DC);
		System.out.println("Application started");
		return driver;
		}

	
	public AndroidDriver<MobileElement>  basecall_RealDevice() throws Exception
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1713");
		cap.setCapability(MobileCapabilityType.UDID, "FXYDU17904002436");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		System.out.println("Application started");
		return driver;	
		
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1713");
		cap.setCapability("udid", "FXYDU17904002436");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		System.out.println("Application started");
		return driver;*/
	}

	public AndroidDriver<MobileElement>  basecall_RealDevice_Chrome() throws Exception
	{
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1713");
		cap.setCapability(MobileCapabilityType.UDID, "FXYDU17904002436");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		System.out.println("Application started");
		return driver;		
}

public AndroidDriver<MobileElement>  basecall_RealDevice_Amazon() throws Exception
{
	
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "vivo 1713");
	cap.setCapability(MobileCapabilityType.UDID, "FXYDU17904002436");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	
	cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	cap.setCapability("chromedriverExecutable", "C:\\DRIVERS\\chromedriver.exe");
	cap.setCapability(CapabilityType.VERSION, "9");
	
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	driver = new AndroidDriver<MobileElement>(url, cap);
	System.out.println("Application started");
	return driver;	
}}