package listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testScripts.BaseClassQAAcademy;

public class TestNGListener implements ITestListener{
	
	static WebDriver driver= BaseClassQAAcademy.driver;

	public void onTestStart(ITestResult result) {

		System.out.println("Started  test "+ result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {

		System.out.println("Success the test "+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
		
		System.out.println("Failed test name "+ result.getName());
		
		try {
			BaseClassQAAcademy.takeScreenShot(result.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//FileInputStream fis= new FileInputStream()
		
		
		
	}

	public void onTestSkipped(ITestResult result) {


		System.out.println("Skipped test "+ result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {


		
	}

	public void onStart(ITestContext context) {

		System.out.println("Started the execution");
		
	}

	public void onFinish(ITestContext context) {

		
		System.out.println("Finished the execution");
		System.out.println("Finished the execution"+context.getAllTestMethods());

		
	}

}
