package com.tanmaysarkar.demo;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class TestTanmay {
	BasePage myBP = new BasePage();
	Sample1BL testThis;// = new Sample1BL();
	
	
 @Parameters({"browser","baseUrl"})
  @BeforeClass
  public void beforeClass(String browser, String baseUrl) {
	 
	  myBP.setDriver(browser);
	  
	  try {
		myBP.getMaxPageAndWait(baseUrl);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	
  }
  @Test
  public void f() {
	  testThis = PageFactory.initElements(myBP._wD, Sample1BL.class);
	  testThis.fillupForm("Aditya", "Joseph", "A");
	  
  }
  @AfterClass
  public void afterClass() {
	  
	  myBP.closeBrowser();
  }

}
