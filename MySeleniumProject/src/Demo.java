import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());*/
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Megha\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.get("https://www.yahoo.com/");
	driver.navigate().back();
	}

}
