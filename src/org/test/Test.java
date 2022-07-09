package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arul\\eclipse-workspace\\Practice\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("arul");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("1234");
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();
	}

}
