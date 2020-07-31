package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Web Orders";
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("This is the right titel");
		} else {
			System.out.println("This is Wrong title");
		}
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();

	}

}
