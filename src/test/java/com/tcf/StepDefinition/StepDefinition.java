package com.tcf.StepDefinition;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tcf.baseclass.BaseClass;
import com.tcf.helper.ConfigurationManager;
import com.tcf.pom.Homepage;

public class StepDefinition extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		ConfigurationManager e=new ConfigurationManager();
		
		String getbrowser = e.getbrowser();
		
		System.out.println(getbrowser);
		
		String url = e.getURL();
		
		System.out.println(url);
		
	
	
	getBrowser(getbrowser);
	getUrl(url);

	
	
	WebElement i_want_to_make_a_deposit = driver.findElement(By.xpath("//input[@name='amount']"));

	Homepage hp = new Homepage(driver);

	WebElement getamount_txt = hp.getamount_txt();
	getamount_txt.clear();

	Thread.sleep(2000);

	getamount_txt.sendKeys("10000");

}}
