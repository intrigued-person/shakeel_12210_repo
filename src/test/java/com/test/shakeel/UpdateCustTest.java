package com.test.shakeel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateCustTest {

	static WebDriver driver = new ChromeDriver();

	@Test
	void updateCust() throws InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("cust-view")).click();
		driver.findElement(By.name("btn-up")).click();
		driver.findElement(By.name("cname")).sendKeys(" A");
		driver.findElement(By.id("sub-upt")).submit();
	}

	@AfterAll
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
