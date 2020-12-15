package expressCreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExpressTest {
	
	WebDriver dr;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/iftakerahmed/Downloads/chromedriver");
		dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().window().maximize();
		dr.get("https://www.express.com/register");
		
		
		
	}
	@DataProvider
	public void getTestdata() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	@Test()
	public void expressRegeitrationTest(String email, String firstname, String lastname, 
			String password) {
		
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[1]/div/input")).clear();
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[1]/div/input")).sendKeys(email);
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[1]/div/input")).clear();
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[1]/div/input")).sendKeys(firstname);
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[3]/div/input")).clear();
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[3]/div/input")).sendKeys(lastname);
		
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[4]/div[1]/div[1]/input")).clear();
		dr.findElement(By.xpath("//*[@id=\"content\"]/section/section[2]/div/form/div[4]/div[1]/div[1]/input")).sendKeys(password);
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		dr.quit();
	}
	
	
	
	
	

}
