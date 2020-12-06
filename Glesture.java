

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Glesture extends Baseclass {
	
	
	 public static void main(String[] args) throws MalformedURLException {
	    	
		  
	    	AndroidDriver<AndroidElement> driver = capabilities(); 
	    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	
	    	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    	
	    	
			TouchAction t = new TouchAction(driver);
	    	WebElement sc = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
	        t.tap(tapOptions().withElement(element(sc))).perform();

	    	
	    	driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	    	
	    	WebElement lp =driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
	    	t.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(1))).release().perform();

	    	System.out.println(driver.findElementById("android:id/title").isDisplayed());
	    	
}}
