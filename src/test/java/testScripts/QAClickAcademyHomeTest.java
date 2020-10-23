package testScripts;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.logging.Logger;
import testScripts.BaseClassQAAcademy;
import pageObjects.QAClicAcaHomePage;
//@Listeners(listener.TestNGListener.class)
public class QAClickAcademyHomeTest extends BaseClassQAAcademy {
	
	public static QAClicAcaHomePage qAClicAcaHomePage;
	WebDriver driver= BaseClassQAAcademy.driver;
	
	//QAClicAcaHomePage qAClicAcaHomePage=new QAClicAcaHomePage();
	Logger log=Logger.getLogger(QAClickAcademyHomeTest.class.getName());
	
	
	@Test(priority=1)
	public void selectRadioButtons() {
		//System.out.println("I am in teest script");
		log.info("I am in teest script");
		 qAClicAcaHomePage=new QAClicAcaHomePage();
		 this.qAClicAcaHomePage=qAClicAcaHomePage;
		try {
		log.info("Clicking on Radio button1");
		//System.out.println("Clicking on Radio button1");
		qAClicAcaHomePage.getRadioButton1().click();
		Thread.sleep(1000);
		//System.out.println("Clicking on Radio button2");
		log.info("Clicking on Radio button2");
		qAClicAcaHomePage.getRadioButton2().click();
		Thread.sleep(1000);
		//System.out.println("Clicking on Radio button3");
		log.info("Clicking on Radio button3");
		
		qAClicAcaHomePage.getRadioButton3().click();
		Thread.sleep(2000);Thread.sleep(2000);
		}catch (Exception e){
			
			System.out.println("Error ="+e);
		}
		
		}
	@Test(priority=2)
	public void selectListOption() {
		
		//QAClicAcaHomePage qAClicAcaHomePage1=new QAClicAcaHomePage();
		try {
			log.info("Selecting list element by index");
			qAClicAcaHomePage.getSelectby(2);
			Thread.sleep(2000);
			Assert.assertTrue(false);
		}catch(Exception e) {
			
			System.out.println("Error ="+e);
		}
		
		
	}
	
	@Test(priority=3)
	public void selectOptionButtons() throws Exception
	{
		qAClicAcaHomePage.getOptionButton1().click();
		Thread.sleep(2000);
		qAClicAcaHomePage.getOptionButton2().click();
		Thread.sleep(2000);
		qAClicAcaHomePage.getOptionButton3().click();
		Thread.sleep(2000);
	}
	

}
