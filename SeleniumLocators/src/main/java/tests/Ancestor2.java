package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ancestor2 {
	
	@Test
	public void ancestorTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oreilly.com/online-learning/try-now.html");
		driver.findElement(By.xpath("//span[@class='mobileNavButton-box']/descendant::*")).click();
		driver.findElement(By.partialLinkText("For higher")).click();
		System.out.println("Test case passed");
	}

}
