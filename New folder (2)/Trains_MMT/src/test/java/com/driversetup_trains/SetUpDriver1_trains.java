package com.driversetup_trains;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class SetUpDriver1_trains {
	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static WebDriver chromeDriver() {
		System.out.println("Launching Chrome Browser");
		String userProfile ="C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\New folder (2)\\Trains_MMT\\src\\test\\resources\\Drivers\\chromedriver.exe");

		options = new ChromeOptions();
		options.addArguments("--user-data-dir="+userProfile);
		options.addArguments("--profile-directory=Default");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}
	public static WebDriver edgeDriver() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\kkalyan\\eclipse-workspace\\MMT\\src\\test\\resources\\Drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        System.out.println("Launching Edge Browser");
        
        return driver;
    }

    public static void teardown() throws Exception {
    	System.out.println("i m in teardown");
    	Thread.sleep(5000);
    	
        driver.close();
        driver.quit();
    }
}
