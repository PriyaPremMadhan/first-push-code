import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class adactin {
	WebDriver driver;
	
@BeforeClass

public void launchdriver()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SampleP\\Lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/");
  
}

@Test
@Parameters({"username","password"})

public void adactintest(String s1, String s2) {
driver.findElement(By.id("username")).sendKeys(s1);
driver.findElement(By.id("password")).sendKeys(s2);
}

@AfterClass

public void verifyRes() {
	driver.findElement(By.id("login")).click();
	System.out.println("Test Pass");
}

}
