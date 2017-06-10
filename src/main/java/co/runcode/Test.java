package co.runcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Test {

	public static void main(String[] args) {

		WebDriver driver;
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Hola Mundo");
		WebElement oGoogleSearchBtn = driver.findElement(By.name("btnG"));
		oGoogleSearchBtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
