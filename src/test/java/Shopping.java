import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Shopping  extends Base{

	
	/*public void generalStore_Shopping() {
		try{
			
			OpenApp();	
			login();
			selectProduct();
			getPrice();
			closeApp();
	
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			exp.getMessage();
			exp.printStackTrace();
		}
	}*/
	
	@Test
	 public void shopping() throws Exception
	{
		AndroidDriver<MobileElement> driver=basecall();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login();
		selectProduct();
		getPrice();
		closeApp();

	}
	
	
		public void login() throws Exception
		{
			
		driver.findElementById("android:id/text1").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));");
		driver.findElementByXPath("//android.widget.TextView[@text='Australia']").click();
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("sachee");
		driver.hideKeyboard();
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		System.out.println("LetsShop button clicked");
		}
	
		public void selectProduct() throws Exception
		{
	    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Converse All Star\").instance(0))"));
		driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(0).click();
		driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(1).click();
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		Thread.sleep(5000);
		}
		
		public void getPrice() throws Exception
		{
		String vPrice1=driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(0).getText();
		String vPrice2=driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(1).getText();
		String vTotal=driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();
		
		System.out.println("Price 1  ="+ vPrice1);
		System.out.println("Price 2  ="+ vPrice2);
		System.out.println("Total    ="+ vTotal);
		
	    }
		
		public void closeApp() 
		{
			driver.closeApp();;
		}

}
