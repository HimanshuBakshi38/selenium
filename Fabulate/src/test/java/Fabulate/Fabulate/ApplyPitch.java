package Fabulate.Fabulate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ApplyPitch {
	WebDriver driver;
	static String value = null;
	
	public static void setValue(String value) {
		ApplyPitch.value= value; 
	}
  @Test(priority =1)
  public void LoginasCreator() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jar files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://stage-client.fabulate.com.au/sign-in");
		
		// Wait until the login page is not showing
				WebDriverWait wait = new WebDriverWait(driver, 25);
				wait.until(ExpectedConditions.elementToBeClickable(By.name("email-signIn")));
		
		driver.findElement(By.name("email-signIn")).sendKeys("creatoramplify@yopmail.com");
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
		System.out.println("click on login bytton");
		// Post a brief            Post a brief                 post a brief 
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("html/body/div[1]/div[3]/div/div[2]/div[1]/section/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/div/a/div")));
  }
  @Test(priority =2)
  public void ApplyaPitch() throws InterruptedException {
	  
		//String value = "11Brief added by Automation script";
	  driver.findElement(By.partialLinkText(value)).click();
	  
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/section/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]/div/a/div")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("tagline")).sendKeys("Tag line");
		driver.findElement(By.name("outline")).sendKeys("Test test");
		driver.findElement(By.name("brandIntegration")).sendKeys("Cover Letter");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div/div/div[2]/button")).click();
		driver.findElement(By.name("headline")).sendKeys("Headline");
		driver.findElement(By.name("outline")).sendKeys("Synopsis");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div/div/div[2]/button")).click();
		System.out.println("2nd step button");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[2]/div[1]/div[2]/div/div/div[4]/div/div/div[2]/div[2]/div/div/div[2]/button")).click();
		System.out.println("3rd step submit buttion");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//*[@id=\"acceptPitchPopUp\"]/div/div/div[3]/div[2]/button")).click();
		//System.out.println("Accept pop up");
		
		WebElement acceptTermsElement = driver.findElement(By.xpath("//*[@id=\"acceptPitchPopUp\"]/div/div/div[3]/div[2]/button"));
		acceptTermsElement.isDisplayed();
		acceptTermsElement.click();
		Thread.sleep(3000);
		//Verify the brief is added or not
		WebDriverWait wait1 = new WebDriverWait(driver, 25);
		   WebElement element1 = wait1
		     .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div/h4")));
		   System.out.println(element1);
		   String gettext=driver.findElement(By.xpath("/html/body/div[5]/div/h4")).getText();
		   System.out.println(gettext); 
	
}

}
