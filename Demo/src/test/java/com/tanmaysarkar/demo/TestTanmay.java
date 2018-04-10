package com.tanmaysarkar.demo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TestTanmay {
	BasePage myBP = new BasePage();
	Sample1BL testThis;// = new Sample1BL();
	ExtentReports myReports;// = new ExtentReports("c:\\selenium\\myreport.html");
	ExtentTest myTest;

	@DataProvider (name="localDP")
	public Object[][] getData()
	{
		 
		/*
		 Object[][] myDataValues;
		 
		 //get from excel / notepad
		 
		 */
		
		return new Object [][] {
				{"Aditya","J","Parker"},
				{"Peter","P","Parker"},
				{"Michael","J","Parker"},
				{"Chris","C","Parker"},
				{"Martin","W","Parker"},
				
		};
	}
	
 @Parameters({"browser","baseUrl"})
  @BeforeClass
  public void beforeClass(String browser, String baseUrl) {
	 
	  myBP.setDriver(browser);
	  myReports = new ExtentReports("c://selenium//myreport.html");
	  myReports.loadConfig(new File("extent-config.xml"));
	  myTest = myReports.startTest("f");
	  
	  try {
		myBP.getMaxPageAndWait(baseUrl);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	
  }
  @Test(dataProvider = "localDP")
  public void f(String strFN, String strMI, String strLN) {
	  
	  myTest.log(LogStatus.INFO, "Starting...");
	  testThis = PageFactory.initElements(BasePage._wD, Sample1BL.class);
	  //myBP.captureScreenShot();
	  testThis.fillupForm(strFN, strMI, strLN);
	  
	  
  }
  @AfterMethod
  public void wrapUpTest(ITestResult myResult)
  {
	  myTest.log(LogStatus.INFO, "Ending...");
	 // if(myResult.getStatus() == ITestResult.FAILURE)
	  //{
		  String myImage = myBP.captureScreenShot();
		  myTest.log(LogStatus.INFO, "oothi moodi" + myTest.addScreenCapture(myImage));
		  
		  
		  
		  myReports.flush();
		  
	  //}
  
  }
  
  
  @AfterClass
  public void afterClass() {
	  
	  myBP.closeBrowser();
  }

}
