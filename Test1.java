


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test1 extends Baseclass{
	
	
	
	 public static void main(String[] args) throws MalformedURLException {
	    	
	  
	    	AndroidDriver<AndroidElement> driver = capabilities(); 
	    	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    	
	    	driver.findElementByXPath("//android.widget.TextView[@text='GET STARTED']").click();
	    	
	    	driver.findElementById("in.loanfront.android.debug:id/cb_permission_tnc").click();
	    	
	    	driver.findElementById("in.loanfront.android.debug:id/btnAgreeAndContinue").click();
	    	
	    	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
             
	    	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	    	
	    	driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
	    	
	    	driver.findElementById("in.loanfront.android.debug:id/tvRegisteredMobileNo").click();
	    	
	    	driver.findElementById("in.loanfront.android.debug:id/etMobileNo").sendKeys("7094006209");
	    	
	    	driver.findElementById("in.loanfront.android.debug:id/btnVerify").click();
	    	



	    	
	    	
	    	
	    	
	    	//driver.findElementById("in.loanfront.android.debug:id/etMobileNo").sendKeys("7094006209");
	    	
	    	
	    	
	    	
	    	
//	    	driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
//	    	driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//	    	driver.findElementById("android:id/checkbox").click();
//	    	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
//	    	driver.findElementById("android:id/edit").sendKeys("hello");
//	    	driver.findElementsByXPath("//android.widget.Button").get(1).click();

	    	
	    	


	    	
	    	
	    	
		}
	

}
