package com.selenium.Testng.Maven_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenTestExercise {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/");
		//maveric project
		driver.findElement(By.xpath("login")).sendKeys("Nithins");
		driver.findElement(By.xpath("login")).sendKeys("asfasfsdf");


	}

}
