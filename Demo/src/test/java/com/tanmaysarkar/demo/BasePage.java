package com.tanmaysarkar.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static WebDriver _wD;
	String _thisURL;

	public BasePage() {
		
		
	}
	
	public void setDriver(String argWhichBrowser)
	{
		if(argWhichBrowser.equalsIgnoreCase("firefox"))
		{
			_wD= new FirefoxDriver();
		}
		else if (argWhichBrowser.equalsIgnoreCase("chrome")) 
		{
			_wD = new ChromeDriver();
			
		}
		else if(argWhichBrowser.equalsIgnoreCase("ie"))
		{
			_wD = new InternetExplorerDriver();
		}
		else
		{
			_wD = new HtmlUnitDriver();
			
		}
		//return _wD;
		
	}
	
	public void getMaxPageAndWait(String argWhichURL) throws InterruptedException
	{
		_wD.get(argWhichURL);
		//_wD.manage().window().maximize();
		synchronized (_wD) {
		_wD.wait(2000);
		}
		
		
	}
	public void closeBrowser()
	{
		_wD.quit();
	}

}

