package seleniumProject;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {

	public static void main(String[] args) {
		
		
		//https://github.com/rajsharma-bot/SauceWeb.git
			
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		String text= driver.getPageSource();
		try {
			 FileWriter writer = new FileWriter("C:\\Users\\rajsh\\eclipse-workspace\\febTestOmeter\\seleniumProject\\Files\\output.txt");
			 writer.write(text);
			 writer.close();
			 System.out.println("Text is saved");
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occurred while saving the text: " + e.getMessage());
		}
		
		driver.quit();

	}

}
