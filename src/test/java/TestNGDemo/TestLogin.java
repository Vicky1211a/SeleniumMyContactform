package TestNGDemo;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.security.util.Password;

public class TestLogin extends Baseclass {
	@Test(priority = 0)
	public void InValid_Login() {

		driver.manage().window().maximize();
// Launch website
		driver.get("https://www.mycontactform.com/");
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//*[@id='user']"));
		username.sendKeys("Prabhuiee123");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		WebElement LoginButton = driver.findElement(By.cssSelector("#right_col_top > form > div > input"));
		LoginButton.click();
		System.out.println(driver.getTitle());

	}

	@Test(priority = 1)
	public void Valid_Login() {

		driver.manage().window().maximize();
//Launch website
		driver.get("https://www.mycontactform.com/");
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//*[@id='user']"));
		username.sendKeys("Prabhu123");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		WebElement LoginButton = driver.findElement(By.cssSelector("#right_col_top > form > div > input"));
		LoginButton.click();
		System.out.println(driver.getTitle());
		WebElement Newformwizard = driver.findElement(By.cssSelector("#user_bar > ul > li:nth-child(2) > a"));
		Newformwizard.click();
		WebElement Startwizard = driver.findElement(By.cssSelector("#center_col > form > div > input"));
		Startwizard.click();
		WebElement Next = driver.findElement(By.cssSelector("#Submit"));
		Next.click();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
	}
}
