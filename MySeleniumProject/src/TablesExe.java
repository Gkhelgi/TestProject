import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Megha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20567/ausw-vs-nzw-10th-match-group-b-icc-womens-world-t20-2018");
	WebElement Table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
	int rowcount=Table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
	int count=Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	int sum=0;
	for(int i=0;i<count-2;i++)
		
	{
		String value=Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	int valueint=Integer.parseInt(value);
	 sum = sum+valueint;
	
	}
	System.out.println(sum);
	System.out.println(Table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
	System.out.println(Table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
	}

}
