package adac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


public class a1 {
	WebDriver driver;
	
@BeforeClass

public void launchdriver()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleP\\Lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/");
  
}

@BeforeMethod

public void sam() {
	System.out.println("beforeM");

}

@Test
@Parameters({"usernam","passwor"})

public void Test1(@Optional("Jananithiru")String s1,@Optional("Jana2thiru5") String s2) {
driver.findElement(By.id("username")).sendKeys(s1);
driver.findElement(By.id("password")).sendKeys(s2);
driver.findElement(By.id("login")).click();
}

@AfterMethod
public void sam1() {
	
	System.out.println("Test Pass");

}
@Test
private void Test2() {
	
WebElement d= driver.findElement(By.id("location"));
d.click();
Select s= new Select(d);
s.selectByValue("Los Angeles");
d.click();

WebElement d1=driver.findElement(By.id("hotels"));
d1.click();
Select s1= new Select(d1);
s1.selectByValue("Hotel Cornice");
d1.click();

WebElement d2= driver.findElement(By.id("room_type"));
d2.click();
Select s2= new Select(d2);
s2.selectByValue("Super Deluxe");

WebElement d3= driver.findElement(By.id("room_nos"));
d3.click();
Select s3= new Select(d3);
s3.selectByValue("4");
d3.click();

WebElement d4= driver.findElement(By.id("datepick_in"));
d4.clear();
d4.sendKeys("10/02/2020");


WebElement d5= driver.findElement(By.id("datepick_out"));
d5.clear();
d5.sendKeys("15/02/2020");

WebElement d6= driver.findElement(By.id("adult_room"));
d6.click();
Select s4= new Select(d6);
s4.selectByValue("3");
d6.click();

WebElement d7= driver.findElement(By.id("child_room"));
d7.click();
Select s5= new Select(d7);
s5.selectByValue("2");
d7.click();


}


@AfterClass

public void verifyRes() {
	driver.findElement(By.id("Submit")).click();
}


}
