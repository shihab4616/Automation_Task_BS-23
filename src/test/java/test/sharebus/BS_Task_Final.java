package test.sharebus;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BS_Task_Final {
	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
		    
		  	// Set the location of the ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		    
		    // Create a new instance of the ChromeDriver
		    WebDriver driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		    

		    // Navigate to the URL
		    driver.get("https://test.sharebus.co/");
		    
		    
		    
		  //  public static void Login_TC001() {
				driver.navigate().to("https://test.sharebus.co/auth/signin");
				//Select for E-mail
				driver.findElement(By.id("email")).sendKeys("brainstation23@yopmail.com");

				//Select for Password
				driver.findElement(By.id("password")).sendKeys("Pass@1234");

				//Click for SignIn 
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/form/div[4]")).click();
				//driver.navigate().to("https://test.sharebus.co/my-buses");
				
				// for server respons time dely
				Thread.sleep(8000);
				//select your user
				driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/span/div")).click();
				
				//Set up a Sharebus
				driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]")).click();
				
				// Click continue
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/button/span[1]")).click();
				
				
				// You currently have no active buses
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/button/div/span[1]")).click();
				
				//From
				driver.findElement(By.id("startPoint")).sendKeys("Oslo,Norway");
				Thread.sleep(2000);
				driver.findElement(By.id("startPoint")).sendKeys(Keys.ARROW_DOWN);
				// driver.findElement(By.id("startPoint")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("startPoint")).click();
				
				Thread.sleep(10000);
				//To
				driver.findElement(By.id("destination")).sendKeys("Kolbotn,Norway");
				Thread.sleep(2000);
				driver.findElement(By.id("destination")).sendKeys(Keys.ARROW_DOWN);
				// driver.findElement(By.id("destination")).sendKeys(Keys.ENTER);
				driver.findElement(By.id("destination")).click();
				Thread.sleep(10000);
				
				//Departure time (date) 
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[1]/span/input"))
				.sendKeys("Tuesday, 27.02.2023");
				Thread.sleep(3000);

				//Departure time (hour/min) 
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/form/div/div[3]/div/div/div/div[2]/span/input"))
				.sendKeys("22:45");
				Thread.sleep(3000);
				
				//Departure time (date) 
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/form/div/div[3]/div[2]/div/div/div/span/input"))
				.sendKeys("Tuesday, 28.02.2023");
				Thread.sleep(3000);

				//Departure time (hour/min) 
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/form/div/div[3]/div[2]/div/div/div[2]/span/input"))
				.sendKeys("23:45");
				
				
				// I don't want return trip.
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/form/div/div[3]/div[3]/label")).click();
							
				
				
				// You currently have no active buses
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[2]/button[2]")).click();
				
				// Are you booking this trip on behalf of a handball organization
				Thread.sleep(8000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div/div/button")).click();
					
				// select ntnui
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='']")).sendKeys("NTNUI");
				
				
				// Click continue
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div[2]/button[2]/span")).click();
				
				// Choose your passenger goal

				// Need tickets for yourself? no
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[2]/div/button[2]")).click();
							
				// Activate ticket discounts? no
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[3]/div/button[2]")).click();
				
				// Click create sharebus
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div/div[2]/div[5]/button[2]/span")).click();
				

				// Click publisg sharebus
				Thread.sleep(10000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[4]/button/span")).click();
				
				// send
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@id='']")).sendKeys("Test");
				
				// Click 
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='sport0']/p")).click();
							
				// send
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/form/div[4]/div/div/textarea")).sendKeys("test");
							
				// send
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/form/div[4]/div[2]/div/input")).sendKeys("https://test.sharebus.co/");
				
				
				// image click 
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='button']")).click();
				
				// review published  
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@id='app']/div/div/form/div[5]/button/span")).click();
				
				
				// Click on my busses 
				Thread.sleep(2000);
				driver.findElement(By.xpath("")).click();
				
				// assert that the user was successfully logged in
//	 			Assert.assertTrue(driver.findElement(By.xpath("https://test.sharebus.co/")).isDisplayed());
				
				
				
				
			    // Close the browser
		  //  driver.quit();
		    
		    

		   
		    
		    
	  }
	}
