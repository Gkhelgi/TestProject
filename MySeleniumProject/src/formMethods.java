import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com/");
		System.out.println("Before multicity bieng selected");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\"hp-widget__depart\"]")).click();
		driver.findElement(By.cssSelector("a[href*='>16</a']")).click();

		// driver.findElement(By.xpath("//*[@id=\"multicity\"]/label")).click();
		System.out.println("After multicity bieng selected");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).isDisplayed());

	}

}
