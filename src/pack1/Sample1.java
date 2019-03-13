package pack1;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\programfiles\\p\\NNN\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		System.out.println(driver.manage().window().getSize());
org.openqa.selenium.Dimension d=new Dimension(600,900);
 driver.manage().window().setSize(d);
 driver.close();

		
	}

}
