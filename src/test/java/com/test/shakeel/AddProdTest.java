package com.test.shakeel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProdTest {

	static WebDriver driver = new ChromeDriver();

	@Test
	public void addProd() {
		driver.get("http://localhost:3000");
		driver.findElement(By.id("reg-prod")).click();
		driver.findElement(By.name("pname")).sendKeys("S20 FE");
		driver.findElement(By.name("quantity")).sendKeys("100");
		driver.findElement(By.name("price")).sendKeys("36000");
		driver.findElement(By.id("sub")).submit();
	}

	@AfterAll
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
