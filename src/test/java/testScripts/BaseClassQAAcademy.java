package testScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClassQAAcademy {
	
	public static WebDriver driver;
	
	public static Logger log;
	public static String browser;
	public static String user;
	public static String password;
	public static String homePageUrl;
	
	@BeforeTest
	public  void setUp()
	
	{	
		readPropertyFile();
		setBrowser(browser);
		System.out.println("this.browser "+this.browser);
		
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://github.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Maximize window
        driver.manage().window().maximize();
        //Navigate to the demo site
       // driver.get("https://www.toolsqa.com/selenium-training/");
        System.out.println("url="+homePageUrl);
        driver.get(homePageUrl);
        String title=driver.getTitle();
        System.out.println(title);
        
		//this.driver=driver;
			
		}
	
	@AfterTest
	public void teardown()
	{	
		System.out.println("I am closing the driver");
		driver.close();
		
		
	}
	
	public static void takeScreenShot(String methodName) throws Exception {
		
		 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File destfile=new File(".\\ScreenShots\\"+methodName+".png");
	        FileUtils.copyFile(file, destfile );
	}

	
	
	 public void setBrowser(String browser) {
		 
		 
		 
		 if (browser.equalsIgnoreCase("chrome")) {
			
		//###########################---------------Setting driver property-----------##############
			System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			this.driver=driver;
			//System.out.println("I am in setProperty statement ");
			//System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		 }	
		 else if(browser.equalsIgnoreCase("htmlunit")) {
			 
			 System.setProperty("webdriver.htmlunit.driver",".\\drivers\\htmlunit.exe");
				WebDriver driver=new HtmlUnitDriver();
				this.driver=driver;

		 		}
		 
	 }
	 
	 public void readPropertyFile()
	 {
		 
		 try {
		 FileInputStream fis=new FileInputStream(".\\Configuration\\config.properties");
		 Properties prop=new Properties();
		 prop.load(fis);
		 
		 String url=prop.getProperty("homePageUrl").toString();
		 
		 if (url !=null) {this.homePageUrl=url;
		 //log.info("HomePahe url ="+url);
		 }
		 
		 this.browser=prop.getProperty("browser").toString();
		 this.user=prop.getProperty("user");
		 this.password=prop.getProperty("password");
		 
		 
		 }catch (Exception e) {
		 
	 }
	
}


}