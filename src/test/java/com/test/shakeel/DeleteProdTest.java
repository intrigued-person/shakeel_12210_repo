package com.test.shakeel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteProdTest {

	static WebDriver driver = new ChromeDriver();

	@Test
	public void deleteProd() throws InterruptedException {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("view")).click();
		driver.findElement(By.id("del-btn")).click();
		Thread.sleep(5000);

	}

	@AfterAll
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
