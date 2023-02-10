package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static WebDriver driver;
	public static void main(String[] args) {

		launch_chrome();
		//launch_firefox();
		//launch_opera();
		//close_chrome();
		//close_firefox();
	}

	public static void launch_chrome() {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();


	}

	public static void launch_firefox() {
		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		driver = new  FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close(); 

	}

	public static void chrome_close() {
		driver.close();

	}

	public static void firefox_close() {
		driver.close();

	}

	public static void open_URL(String URL) 
	{ 
		driver.get(URL);		
	}

}
