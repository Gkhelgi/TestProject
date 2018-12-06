import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://www.spicejet.com/");
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_DropDownListCurrency\"]")));
		s.selectByVisibleText("USD");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		//driver.findElement(By.xpath("//*[@id=\\\"ctl00_mainContent_ddl_originStation1_CTXT\\\"]\")).click();")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
	}

}
