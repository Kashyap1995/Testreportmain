package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Soploginfree extends Sopregifree{
	  
	 
	
	
	 @Test(priority=6)
	 public void Bothvalue1() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"login_tab\"]")).click();
			Thread.sleep(5000);
//		 driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[2]")).click();
//		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
		 Thread.sleep(5000);
			String actual_message = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[2]/div[1]/span")).getText();
			String expect_messaage = "Please enter email id or mobile number.";
			Assert.assertEquals(actual_message, expect_messaage); 
			
			String actual_message1 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/div[1]/span")).getText();
			String expect_messaage1 = "Please enter your password.";
			Assert.assertEquals(actual_message1, expect_messaage1); 
  }
  
	 
	 
	 @Test (priority=7)
  public void Email1() throws InterruptedException {
	
	driver.findElement(By.xpath("//*[@id=\"main_user_login\"]")).sendKeys("dfaaaq");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();


		Thread.sleep(5000);
		String actual_message2 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[2]/div[1]/span")).getText();
		String expect_messaage2 = "Please enter valid email id or mobile number.";
		Assert.assertEquals(actual_message2, expect_messaage2); 
		
		String actual_message3 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/div[1]/span")).getText();
		String expect_messaage3 = "Please enter your password.";
		Assert.assertEquals(actual_message3, expect_messaage3); 
		}
  @Test (priority=8)
  public void Emailneg1() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"main_user_login\"]")).clear();

	driver.findElement(By.xpath("//*[@id=\"main_user_login\"]")).sendKeys("1234");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();


		Thread.sleep(5000);
		String actual_message4 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[2]/div[1]/span")).getText();
		String expect_messaage4 = "Please enter valid email id or mobile number.";
		Assert.assertEquals(actual_message4, expect_messaage4); 
		
		String actual_message5 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/div[1]/span")).getText();
		String expect_messaage5 = "Please enter your password.";
		Assert.assertEquals(actual_message5, expect_messaage5); 
		}
  
  @Test (priority=9)
  public void Pw1() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/input")).sendKeys("!@#$");

	
	driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();


		Thread.sleep(5000);
		String actual_message6 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[2]/div[1]/span")).getText();
		String expect_messaage6 = "Please enter valid email id or mobile number.";
		Assert.assertEquals(actual_message6, expect_messaage6); 
 
		
		String actual_message7= driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/div[1]/span")).getText();
		String expect_messaage7 = "Password must be 6 characters or more.";
		Assert.assertEquals(actual_message7, expect_messaage7); 
		}
  @Test (priority=10)
  public void Password1() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/input")).clear();

	driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/input")).sendKeys("1234");

	
	driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();


		Thread.sleep(5000);
		String actual_message8 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[2]/div[1]/span")).getText();
		String expect_messaage8 = "Please enter valid email id or mobile number.";
		Assert.assertEquals(actual_message8, expect_messaage8); 
 
		
		String actual_message9= driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/div[1]/span")).getText();
		String expect_messaage9 = "Password must be 6 characters or more.";
		Assert.assertEquals(actual_message9, expect_messaage9); 
		}
  @Test (priority=11)
  public void Passwordneg1() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"main_user_login\"]")).clear();

	driver.findElement(By.xpath("//*[@id=\"main_user_login\"]")).sendKeys("kashyapd@rbi.edu.in");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/input")).clear();

	driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/input")).sendKeys("!@##$$s");

	
	driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();


		Thread.sleep(5000);
		String actual_message10 = driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/div[1]/span")).getText();
		String expect_messaage10 = "Incorrect login details.";
		Assert.assertEquals(actual_message10, expect_messaage10); 
 
		}
  @Test (priority=12)
  public void Login1() throws InterruptedException {

	  driver.findElement(By.xpath("//*[@id=\"main_user_login\"]")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/input")).clear();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"main_user_login\"]")).sendKeys("kashyapd@rbi.edu.in");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/form/fieldset/div[3]/input")).sendKeys("Kashyap@7383");

	driver.findElement(By.xpath("//*[@id=\"login_button\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"loginModelBox\"]/div/div[2]/div[11]/div/form/div[3]/div/a")).click();
	Thread.sleep(5000);

	Actions action = new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"sc_uname\"]/a"));
	action.moveToElement(element).perform();
	driver.findElement(By.xpath("//*[@id=\"sc_uname\"]/div/ul/li[10]/a")).click();

}
  @BeforeTest
  public void beforeTest() {
  }
  
  @AfterTest
  public void afterTest() {
	 
  }

}
