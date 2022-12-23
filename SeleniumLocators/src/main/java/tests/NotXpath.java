package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NotXpath {
	
	@Test
	public void ancestorTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
//		WebElement username=driver.findElement(By.xpath("//div[@class='form_group']/ancestor::div[@class='login-box']//div/input"));
		WebElement username=driver.findElement(By.xpath("//input[not(@class='input_error form_input')]"));
		username.click();
		Thread.sleep(3000);
		driver.quit();
	}

}
