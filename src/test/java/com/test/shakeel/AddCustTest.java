package com.test.shakeel;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustTest {
	
    static WebDriver driver = new ChromeDriver();

	@Test
	public void addCust() throws InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("reg-cust")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("cname")).sendKeys("Shakeel");
		Thread.sleep(2000);
		driver.findElement(By.name("mobile")).sendKeys("9952721019");
		Thread.sleep(2000);
		driver.findElement(By.name("city")).sendKeys("Madurai");
		Thread.sleep(2000);
		driver.findElement(By.name("pid")).click();
		{
			WebElement dropdown = driver.findElement(By.name("pid"));
			dropdown.findElement(By.xpath("//option[. = '203']")).click();
		}
		// driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.id("add-btn")).submit();

	}
	
	@AfterAll
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}

}
