package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Sopregifree {
	public WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Automation\\chromedriver.exe");
		
		  driver = new ChromeDriver();
			driver.get("https://www.shopclues.com/");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver,40);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='moe-chrome-style-notification-btn moe-btn-close moe-block-class']")));
		    
		    driver.findElement(By.xpath("//*[@class='moe-chrome-style-notification-btn moe-btn-close moe-block-class']")).click();
			
		    WebDriverWait wait1 = new WebDriverWait(driver,20);
		    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sign-in\"]/a")));
		    

	  }
	 
	 	 
  @Test (priority=0)
  public void Bothvalue() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"sign-in\"]/a")).click();
	  WebDriverWait wait2 = new WebDriverWait(driver,40);
	    wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("main_user_login"))); 
		Thread.sleep(5000);

	    driver.findElement(By.xpath("//*[@id=\"reg_tab\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[6]/div/a")).click();
		Thread.sleep(5000);
		
		String actual_message = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/div/span")).getText();
		String expect_messaage = "Please enter your email id.";
		Assert.assertEquals(actual_message, expect_messaage); 
		
		String actual_message1 = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/div/span")).getText();
		String expect_messaage1 = "Please enter your mobile number.";
		Assert.assertEquals(actual_message1, expect_messaage1); 
  }
 
  @Test (priority=1)
  public void Email() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/input")).sendKeys("dfaaaq");
		
		driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[6]/div/a")).click();


			Thread.sleep(5000);
			String actual_message2 = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/div/span")).getText();
			String expect_messaage2 = "Invalid email id.";
			Assert.assertEquals(actual_message2, expect_messaage2); 
			
			String actual_message3 = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/div/span")).getText();
			String expect_messaage3 = "Please enter your mobile number.";
			Assert.assertEquals(actual_message3, expect_messaage3); 
  }
  @Test (priority=2)
  public void Emailneg() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/input")).clear();

	driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/input")).sendKeys("1234");
	
	driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[6]/div/a")).click();


		Thread.sleep(5000);
		String actual_message4 = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/div/span")).getText();
		String expect_messaage4 = "Invalid email id.";
		Assert.assertEquals(actual_message4, expect_messaage4); 
		
		String actual_message5 = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/div/span")).getText();
		String expect_messaage5 = "Please enter your mobile number.";
		Assert.assertEquals(actual_message5, expect_messaage5); 
		}
  @Test (priority=3)
  public void Mobile() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/input")).sendKeys("1234");

	
	driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[6]/div/a")).click();


		Thread.sleep(5000);
		String actual_message6 = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/div/span")).getText();
		String expect_messaage6 = "Invalid email id.";
		Assert.assertEquals(actual_message6, expect_messaage6); 
		
		String actual_message7= driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/div/span")).getText();
		String expect_messaage7 = "Invalid mobile number.";
		Assert.assertEquals(actual_message7, expect_messaage7); 
		}
  @Test (priority=4)
  public void Password() throws InterruptedException {

	
	driver.findElement(By.xpath("//*[@id=\"register_with_password\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[4]/input")).sendKeys("123");
	driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[6]/div/a")).click();


		Thread.sleep(5000);
		String actual_message8 = driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/div/span")).getText();
		String expect_messaage8 = "Invalid email id.";
		Assert.assertEquals(actual_message8, expect_messaage8); 
		
		String actual_message9= driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/div/span")).getText();
		String expect_messaage9 = "Invalid mobile number.";
		Assert.assertEquals(actual_message9, expect_messaage9); 
		
		String actual_message10= driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[4]/div/span")).getText();
		String expect_messaage10 = "Password must be 6 characters or more.";
		Assert.assertEquals(actual_message10, expect_messaage10); 
		
		}
  @Test (priority=5)
  public void Login() throws InterruptedException {

	  driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/input")).clear();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/input")).clear();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/input")).sendKeys("kashyapd@rbi.edu.in");
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[3]/input")).sendKeys("8200739241");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"register_with_password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"register_with_password\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[4]/input")).sendKeys("Kashyap@12345");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[6]/div/a")).click();
		Thread.sleep(5000);

	String actual_message11= driver.findElement(By.xpath("//*[@id=\"register\"]/form/fieldset/div[2]/div/span")).getText();
	String expect_messaage11 = "Account already exists with this email. Please login.";
	Assert.assertEquals(actual_message11, expect_messaage11); 
	Thread.sleep(5000);
		
}	
  @AfterClass
  public void afterClass() {
  }

}
