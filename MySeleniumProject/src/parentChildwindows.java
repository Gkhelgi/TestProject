import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChildwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
	}

}
