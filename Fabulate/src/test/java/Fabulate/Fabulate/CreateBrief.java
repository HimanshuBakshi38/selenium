package Fabulate.Fabulate;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Common.DriverFactory;

public class CreateBrief {
	WebDriver driver;

	  @Test(priority=1)
	public void LoginasBuyer() throws InterruptedException {

		  driver = DriverFactory.getInstance().getDriver();
			 Thread.sleep(3000);
			 
		driver.get("https://stage-client.fabulate.com.au/sign-in");

		// Wait until the login page is not showing
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("email-signIn")));

	
		driver.findElement(By.name("email-signIn")).sendKeys("buyeramplify@yopmail.com");
		// Email
		System.out.println("Enter email");
		driver.findElement(By.name("password-singIn")).sendKeys("123456");
		// Password
		System.out.println("Password");
		driver.findElement(By.id("agreement")).click();
		// Check Box
		System.out.println("select checkbox");
		driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[2]/button")).click();
		// Login Button
		System.out.println("click on login button");
		
	  }
	  @Test(priority=2)
		public void CreateaBrief() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar-mobile\"]/ul[2]/div/a")));

	driver.findElement(By.xpath("//*[@id=\"navbar-mobile\"]/ul[2]/div/a")).click();
	Thread.sleep(3000);
	
	// Create Random Brief Name and enter
	Random TestName = new Random();  
	  int randomInt = TestName.nextInt(100);  
	  String Randomname = "Test"+ randomInt;
	  String BriefName = Randomname + "Brief added by Automation script" ;
	
	
	driver.findElement(By.name("causeName")).sendKeys(BriefName);
	Thread.sleep(3000);
	
	// Enter Material Date
	WebElement materialDate =  driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[1]/div/div/input"));	  
	materialDate.click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/button")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[4]")).click();
	Thread.sleep(3000);
		
	//Enter Pitch Deadline Date
			  
	WebElement PitchDate =  driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[1]/div/div/input"));
	PitchDate.click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[2]/div/button")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]")).click();
				
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div/div/button")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[1]/div[2]/div/div/span/span[1]")).click();
	
	 //Select Genre = new Select(driver.findElement(By.xpath("//*[@id=\"contentCategoriesModal\"]/div/div/div[2]/div[1]/div[2]/div/span/span/span/span")));
	 //Genre.selectByVisibleText("Automotive");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[1]/div[2]/div/span/span/span/span/ul/li[1]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/div/span/span[1]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[2]/div[2]/div/span/span/span/span/ul/li")).click();
	driver.findElement(By.xpath("//*[@id=\"contentCategoriesModal\"]/div/div/div[2]/div[3]/div[2]/div/div/span/span[1]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[3]/div[2]/div/span/span/span/span/ul/li")).click();
	driver.findElement(By.xpath("//*[@id=\"contentCategoriesModal\"]/div/div/div[2]/div[4]/div/table/tbody/tr/td[3]/div/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"contentCategoriesModal\"]/div/div/div[3]/div/button[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]")).click();

	System.out.println("****************** STEP 2*****************");
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/div/span/span[1]/input")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[2]/div/span/span/span/span/ul/li[1]")).click();
	driver.findElement(By.name("causeContentIdea")).sendKeys("Test test test test test");
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div[1]/label/div/div/span")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[2]/div[3]/label/div/div/span/input")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div[1]/div[3]/label/div/div/span/input")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
	
	
	System.out.println("****************** STEP 3 *****************");
	
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/label/div/div/span/input")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[1]/div[2]/div/div[2]/label/div/div/span")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[1]/label/div/div/span/input")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[4]/label/div/div/span/input")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div/div[7]/label/div/div/span/input")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
	
	System.out.println("****************** STEP 4 *****************");
	
	driver.findElement(By.name("causeSeo")).sendKeys("Test test test test test");
	driver.findElement(By.name("causeFurtherUrl")).sendKeys("https:test.com");
	driver.findElement(By.xpath("//div[@id='root']/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div[4]/div[2]/div/input")).sendKeys("C:\\Users\\hp\\Desktop\\Gif.gif");
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[1]/img")));
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div[1]/img")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/label/div/div")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[3]/div[1]/div[2]/div/div[2]/button")).click();
	Thread.sleep(3000);
	
	  
	  WebElement element = driver.findElement(By.name("startDate"));
	  element.click();
	  driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[5]/div[6]")).click();
	 
	  Thread.sleep(3000);
	
	  	driver.findElement(By.name("endDate")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[4]/div[2]/div/button")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[2]/div/div[4]/div[2]/div/div[2]/div[2]/div[2]/div[5]")).click();
	  
	
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
	Thread.sleep(5000);	
	
	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/button")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div/div[5]/button[1]")).click();
	//Thread.sleep(randomInt);
	
//Verify the brief is added or not
	WebDriverWait wait1 = new WebDriverWait(driver, 10);
	   WebElement element1 = wait1
	     .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div/div[4]")));
	   System.out.println(element1);
	   String gettext=driver.findElement(By.xpath("/html/body/div[5]/div/div[4]")).getText();
	   System.out.println(gettext); 
	
	ApplyPitch.setValue(BriefName);
		  
			  
	}

	
	}
