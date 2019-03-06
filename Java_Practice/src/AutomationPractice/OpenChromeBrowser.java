package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/ss00341822/git/JavaPractice/Java_Practice/Jars/chromedriver.exe"); 
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		System.out.println("Ran successfully");
		
	}

}
