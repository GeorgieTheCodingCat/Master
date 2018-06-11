//***********************************************************************************************
// GREAT HOW TO TUTORIALS 
//http://www.automationtestinghub.com/download-and-install-selenium/
//https://examples.javacodegeeks.com/enterprise-java/selenium/selenium-tutorial-for-beginners/
//https://www.guru99.com/accessing-forms-in-webdriver.html
//***********************************************************************************************

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://www.google.com";					
        driver.get(baseUrl);
        
        WebElement search = driver.findElement(By.id("lst-ib"));
        search.sendKeys("test");
        search.submit();
    
        try 
        {
			TimeUnit.SECONDS.sleep(10);
		} 
        catch (InterruptedException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.close();
        
	}

}
