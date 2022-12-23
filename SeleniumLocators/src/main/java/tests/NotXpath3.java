package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotXpath3 {

	@Test
	public void ancestorTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oreilly.com/");
		WebElement signIn = driver.findElement(By.xpath("//ul[@id='menuList']/descendant-or-self::li/ul/li/a"));

		//ul[@id='menuList']/descendant-or-self::*
		
		signIn.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
