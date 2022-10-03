package com.tcf.TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tcf.helper.ConfigurationManager;
import com.tcf.pom.Homepage;

public class TestRunner {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

	
	
		ConfigurationManager e=new ConfigurationManager();
		
		String getbrowser = e.getbrowser();
		
		System.out.println(getbrowser);
		
		String url = e.getURL();
		
		System.out.println(url);
		
	}
}