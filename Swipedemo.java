

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Swipedemo extends Baseclass {
	
	
	 public static void main(String[] args) throws MalformedURLException {
	    	
		  
	    	AndroidDriver<AndroidElement> driver = capabilities(); 
	    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    	
	    	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	    	driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
	    	driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
	    	driver.findElementByXPath("//*[@content-desc='9']").click();
	    	TouchAction t = new TouchAction(driver);
	    	WebElement we= driver.findElementByXPath("//*[@content-desc='15']");
	    	WebElement k= driver.findElementByXPath("//*[@content-desc='45']");

	    	t.longPress(longPressOptions().withElement(element(we)).withDuration(ofSeconds(1))).moveTo(element(k)).release().perform();
	    	


	    	
	 }}