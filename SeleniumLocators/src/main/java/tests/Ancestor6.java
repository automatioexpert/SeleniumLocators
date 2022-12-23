package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ancestor6 {

	@Test
	public void ancestorTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oreilly.com/online-learning/try-now.html");
		driver.findElement(By.xpath("//li[@class='menuList-itemsP2']/ancestor::ul/li//a[@id='nav-signIn']")).click();
		// form[@class='Form--n0OwA']/child::div/child::label/input

		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Sign In')]")).getText());
		driver.findElement(By.xpath("//div[@class='orm-Input-root']/descendant::label/input"))
				.sendKeys("User49475954775@gs.com");

		driver.findElement(By.partialLinkText("free trial")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'10 days free')]")).getText());

		driver.findElement(By.xpath("//input[@id='input-yali7bg9lv']/ancestor::div[@class='orm-Input-root']/label/input[1]")).sendKeys("User35934537347");
	
		Thread.sleep(3000);
		driver.quit();
	}

}
