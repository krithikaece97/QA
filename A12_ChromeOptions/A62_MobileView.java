package A12_ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A62_MobileView {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		Map<String, String> mobileEmulation = new HashMap<String, String>();//here we r using hashmap concept, bse of key and value combination
		mobileEmulation.put("deviceName", "Nexus 5");//key is a deviceName and value is Nexus 5 which is the mobile name we have to access
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", mobileEmulation);
		WebDriver wd = new ChromeDriver(options);//we have to pass the variable
		wd.get("https://www.google.com/");

	}

}
