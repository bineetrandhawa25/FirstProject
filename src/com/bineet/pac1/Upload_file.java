package com.bineet.pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input.upload_txt")).sendKeys("C:\\Users\\Bineet\\Desktop\\NEW Documents\\Bineet_Randhawa_Resume.pdf");
	
	}

}
