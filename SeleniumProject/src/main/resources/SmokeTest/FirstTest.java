package SmokeTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	WebDriver driver;

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lalit\\Documents\\Lalit\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();

	
		
	}

}
