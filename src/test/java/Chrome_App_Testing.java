

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Chrome_App_Testing extends Base{

	@Test
	 public void chromeTesting() throws Exception
	{
		AndroidDriver<MobileElement> driver= basecall_RealDevice_Chrome();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		googleAppTesting();
		closeApp() ;
	}
		
	public  void googleAppTesting() throws MalformedURLException
	{
		
		MobileElement accept_Continue = driver.findElementById("com.android.chrome:id/terms_accept");
		accept_Continue.click();
		MobileElement nextButton = driver.findElementById("com.android.chrome:id/next_button");
		nextButton.click();
		MobileElement YesIam_Btn = driver.findElementById("com.android.chrome:id/negative_button");
		YesIam_Btn.click();
		MobileElement searchText = driver.findElementByClassName("android.widget.EditText");
		searchText.sendKeys("Xpanxion ust global");
		MobileElement searchBtn = driver.findElementByClassName("android.widget.Button");
		searchBtn.click();
		MobileElement xpanxion = driver.findElementByClassName("android.view.View");
		xpanxion.click();	
	   System.out.println("Completed");
		
	}
		
	public void closeApp() 
	{
		driver.closeApp();;
	}	
	
}
