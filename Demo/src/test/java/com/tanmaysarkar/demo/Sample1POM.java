package com.tanmaysarkar.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1POM extends BasePage{
	By byFirstName = By.id("ts_first_name");
	By byLastName = By.id("ts_last_name");
	By byAddress = By.id("ts_address");
	By byGender;
	By byInterest;
	By bySubmit = By.name("Submit1");
	
	WebElement FirstName, LastName, Address, SubmitButton;
	
	public WebElement getFirstName() {
		System.out.println("in getfirstname() before find");
		FirstName = _wD.findElement(byFirstName);
		System.out.println("in getfirstname afetr find()");
		return FirstName;
	}
	
	

	public void setFirstName(String argFirstName) 
	{
		//if(FirstName == null)
		//{
		//	getFirstName();
		//}
		FirstName.clear();
		FirstName.sendKeys(argFirstName);
		
	}

	public WebElement getLastName()
	{
		
		LastName = _wD.findElement(byLastName);
		return LastName;
	}

	public void setLastName(String argLastName) 
	{
		//getLastName();
		LastName.clear();
		LastName.sendKeys(argLastName);
	}

	public WebElement getAddress() {
		Address = _wD.findElement(byAddress);
		return Address;
	}

	public void setAddress(String argAddress)
	{
		//getAddress();
		Address.clear();
	Address.sendKeys(argAddress);
	}

public WebElement getSubmitButton()
{
	SubmitButton = _wD.findElement(bySubmit);
	return SubmitButton;
}
	public void getPageElements()
	{
		getFirstName();
		getLastName();
		getAddress();
	}
	
	public  Sample1POM() 
	{
		super();
		
	}
	 
	
	

}
