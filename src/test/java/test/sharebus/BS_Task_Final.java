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
				
				// for server respons time delay
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
				.sendKeys("22:00");
				Thread.sleep(3000);
				
				//Departure time (date) 
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/form/div/div[3]/div[2]/div/div/div/span/input"))
				.sendKeys("Tuesday, 28.02.2023");
				Thread.sleep(3000);

				//Departure time (hour/min) 
				driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/form/div/div[3]/div[2]/div/div/div[2]/span/input"))
				.sendKeys("23:00");
				
				
				// I don't want return trip.
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/form/div/div[3]/div[3]/label")).click();
							
				// You currently have no active buses
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[2]/button[2]")).click();
				
				
				//Set up a Sharebus Membership information
				Thread.sleep(10000);
                driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div/div/button"))
                .click();
                
                
				
		//	 }
				/*

		//	public static void Main_TC001() {

				//Select your user
				//driver.findElement(By.linkText("Sharelead")).click();
				//Using Select class for selecting value from dropdown  
				//Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div")));  
				//dropdown.selectByVisibleText("Sharelead");    


				//Set up a Sharebus
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/button/div/span[1]")).click();


				//Set up a Sharebus Trip details********

				//From
				driver.findElement(By.id("startPoint")).sendKeys("Oslo,Norway");

				//To
				driver.findElement(By.id("destination")).sendKeys("Kolbotn, Norway");
				//Departure time (date) 
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[1]/span/input"))
				.click();
				//Departure time (hour/min) 
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/form/div[1]/div[3]/div[1]/div[1]/div/div[2]/span"))
				.click();

				//Set up a Sharebus Membership information
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]/button[1]"))
				.click();

				//Continue
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[1]/div/div[2]/button[2]/span[1]"))
				.click();


				//Need tickets for yourself?
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/button[2]"))
				.click();

				//Activate ticket discounts? (Make the tickets cheaper through discounts and get passengers to book faster.)

				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/button[2]"))
				.click();

				//Create Sharebus
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[5]/button[2]/span[1]"))
				.click();
				//Publish your sharebus.
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[4]/button/span[1]"))
				.click();
				//Trip name* Description that characterizes your trip
				driver.findElement(By.className("form-control rounded")).sendKeys("Description that characterizes your trip");
				//Category*
				driver.findElement(By.xpath("//*[@id=\"music1\"]/p")).click();
				//Optional information Information to the travellers
				driver.findElement(By.className("border-light w-100 rounded ship-gray")).sendKeys("Information to the travellers");
				//Link to event page
				driver.findElement(By.className("form-control rounded")).sendKeys("Information to the travellers");

				//Upload Image 
				//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
				//add picture
				driver.findElement(By.className("btn rounded-pill sb-btn-md sb-btn-primary-alt w-auto")).sendKeys("./photos/bs23.jpg");

			//} 
		    
		    
		    
		    */
	    
	    
		    
		    // Close the browser
		  //  driver.quit();
		     
		    
	  }
	}
