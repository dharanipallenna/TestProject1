package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\programfiles\\p\\NNN\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[3]/ul/li[1]/span"))).build().perform();
	Thread.sleep(5000);

	action.click(driver.findElement(By.xpath("//*[@id=\'container\']//div/header//div[3]//ul//li[6]//span"))).build().perform();
	Thread.sleep(5000);
	
     action.doubleClick(driver.findElement(By.xpath("//*[@id=\'container\']/div/header/div[3]/ul/li[6]/span"))).build().perform();
     Thread.sleep(5000);
     action.contextClick(driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]"))).build().perform();
   driver.close();
	}
	
	
	

}
