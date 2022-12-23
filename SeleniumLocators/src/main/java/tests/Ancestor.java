package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ancestor {
	
	@Test
	public void ancestorTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
//		WebElement username=driver.findElement(By.xpath("//div[@class='form_group']/ancestor::div[@class='login-box']//div/input"));
		WebElement username=driver.findElement(By.xpath("//div[@class='form_group']/ancestor-or-self::div[@class='login-box']//div/input"));
		username.sendKeys("User3479353575");
		System.out.println(username.getAttribute("value"));
		driver.quit();
	}

}
