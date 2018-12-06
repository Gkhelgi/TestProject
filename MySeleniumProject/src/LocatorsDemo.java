import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("this is my first code");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("xyz");
		driver.findElement(By.cssSelector("#u_0_2")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"header_block\"]/span")).getText());
	}

}
