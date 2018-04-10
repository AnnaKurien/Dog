package com.tanmaysarkar.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sample1BL extends Sample1POM{

	public Sample1BL()
	{
		super();
	}
	
	public void fillupForm(String argFN, String argLN, String argAddress)
	{
getPageElements();
	setFirstName(argFN);
	setLastName(argLN);
	setAddress(argAddress);
	getSubmitButton().submit();
	
	}
}
