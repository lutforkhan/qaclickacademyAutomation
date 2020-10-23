package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testScripts.BaseClassQAAcademy;

public class QAClicAcaHomePage {
	
 	WebDriver driver= BaseClassQAAcademy.driver;
	
	//Radio button elements
	By radioButton1=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input");
	By radioButton2=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input");
	By radioButton3=By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input");
	// Select List
	By selectList=By.id("dropdown-class-example");
	//Select option buttons
	By optionButton1=By.xpath("//*[@id=\"checkBoxOption1\"]");
	By optionButton2=By.xpath("//*[@id=\"checkBoxOption2\"]");
	By optionButton3=By.xpath("//*[@id=\"checkBoxOption3\"]");
	
	//Radio button methods
	public WebElement getRadioButton1(){return driver.findElement(radioButton1);}
	public WebElement getRadioButton2(){return driver.findElement(radioButton2);}
	public WebElement getRadioButton3(){return driver.findElement(radioButton3);}
	//Select list methods
	public WebElement getSelectList(){return driver.findElement(selectList);}
	
	
	Select list=new Select(getSelectList());
	
	public void getSelectby(Integer ind){
		list.selectByIndex(ind);
	}
	//Select option button methods
	public WebElement getOptionButton1(){return driver.findElement(optionButton1);}
	public WebElement getOptionButton2(){return driver.findElement(optionButton2);}
	public WebElement getOptionButton3(){return driver.findElement(optionButton3);}
	
	}
	





