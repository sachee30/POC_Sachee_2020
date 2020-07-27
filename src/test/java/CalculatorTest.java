

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest extends Base {

	
	/*public static void main(String[] args) {
		try{
			AndroidDriver<MobileElement> driver=basecall();	
		    openCalculator();
		    closeCalculator();
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			exp.getMessage();
			exp.printStackTrace();
		}
	}*/

	@Test
	 public void chrome_testing() throws Exception
	{
		AndroidDriver<MobileElement> driver= basecall_RealDevice();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		openCalculator();
		closeCalculator() ;
		

	}
	
	public void openCalculator() throws MalformedURLException
	{
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1713");
		cap.setCapability("udid", "FXYDU17904002436");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		System.out.println("Application started");
*/		
		MobileElement two = driver.findElementById("com.android.calculator2:id/digit_2");
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
	    System.out.println("Completed");
		
	}
		
	public void closeCalculator() 
	{
		driver.closeApp();;
	}

}
