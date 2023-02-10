package test.sharebus;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Browsers;

public class LogIn extends Browsers {
	public static void main(String[] args) {
		launch_chrome();
		open_URL("https://test.sharebus.co/");
		Login_TC001();
		//open_URL("https://test.sharebus.co/setup-sharebus");
		//Main_TC001();
	}

	public static void Login_TC001() {
		driver.navigate().to("https://test.sharebus.co/auth/signin");
		//Select for E-mail
		driver.findElement(By.id("email")).sendKeys("brainstation23@yopmail.com");

		//Select for Password
		driver.findElement(By.id("password")).sendKeys("Pass@1234");

		//Click for SignIn 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/form/div[4]")).click();
		//driver.navigate().to("https://test.sharebus.co/my-buses");

	}

	public static void Main_TC001() {

		//Select your user
		//driver.findElement(By.linkText("Sharelead")).click();
		//Using Select class for selecting value from dropdown  
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div")));  
		dropdown.selectByVisibleText("Sharelead");    


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

	} 
}
