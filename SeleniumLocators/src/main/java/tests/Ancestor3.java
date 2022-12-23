package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ancestor3 {

	@Test
	public void ancestorTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oreilly.com/online-learning/try-now.html");
		driver.findElement(By.xpath("//li[@class='menuList-itemsP2']/ancestor::ul/li//a[@id='nav-signIn']")).click();
		// form[@class='Form--n0OwA']/child::div/child::label/input
		driver.findElement(By.xpath("//form[@class='Form--n0OwA']/child::div/child::label/input"))
				.sendKeys("User3483434");
		System.out.println("Entered the value in textbox");
		Thread.sleep(5000);
		driver.quit();

	}

}
