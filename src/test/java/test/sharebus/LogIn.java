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
		//Select_TC001();
	}
	
  public static void Login_TC001() {
	  driver.navigate().to("https://test.sharebus.co/auth/signin");
	//Select for E-mail
	driver.findElement(By.id("email")).sendKeys("brainstation23@yopmail.com");
	
	//Select for Password
	driver.findElement(By.id("password")).sendKeys("Pass@1234");
	
	//Click for SignIn 
	//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/form/div[4]")).click();
	//driver.navigate().to("https://test.sharebus.co/my-buses");
	
}
 
  public static void Select_TC001() {
	/*
	//Select your user
	  //driver.findElement(By.linkText("Sharelead")).click();
	//Using Select class for selecting value from dropdown  
	  Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div")));  
	  dropdown.selectByVisibleText("Sharelead");    
}
 */
  
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
  
  
   }
}
