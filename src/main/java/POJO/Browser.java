package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openChromeBrowser(String url) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
	return driver;
}
}