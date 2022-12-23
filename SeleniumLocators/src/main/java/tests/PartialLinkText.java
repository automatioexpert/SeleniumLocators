package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PartialLinkText {

	@Test
	public void Test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oreilly.com/");
		driver.findElement(By.partialLinkText("Try")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}
}
