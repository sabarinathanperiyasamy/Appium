


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {

    public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
    	
    	File f = new File("src");
    	File fs = new File(f ,"practice.apk" );
		
    	DesiredCapabilities ds = new DesiredCapabilities();
    	
    	ds.setCapability(MobileCapabilityType.DEVICE_NAME,"sabari");
    	ds.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    	AndroidDriver<AndroidElement> ad = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),ds);
		return ad;
    	
		//samsung SM-M205F
	}
	
}
