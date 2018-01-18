package com.simpleDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDemoSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shankarl\\Downloads\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		//firtst commet with impl implecitywaita
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		
		Thread.sleep(2000);
		driver.close();
		
		System.out.println("Check  dfdf");
		
		

	}

}
