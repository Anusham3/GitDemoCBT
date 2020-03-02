package string;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	 //maximize the browser
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/Admin/Desktop/HTMLCSSJS/Selenium/SeleniumSinglleListbox.html");
    WebElement lb = driver.findElement(By.id("Fruit"));
	Select sel=new Select(lb);
	List<WebElement> list1 = sel.getOptions();
	for(WebElement list2:list1)
	{
		String  s=list2.getText();
		System.out.println(s);
	}
			HashSet hs=new HashSet();
			
			for(WebElement a:list1)
			{
				String s = a.getText();
				hs.add(s);
				
			}
			System.out.println(list1.get(list1.size()-1));
	}
	
}
