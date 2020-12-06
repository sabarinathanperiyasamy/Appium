


import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test2 extends Baseclass{
	
	
	
	 public static void main(String[] args) throws MalformedURLException {
	    	
	  
	    	AndroidDriver<AndroidElement> driver = capabilities(); 
	    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	
	    	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();    	
	    	System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());

	    	
	    	
	    	
	 }}
	
