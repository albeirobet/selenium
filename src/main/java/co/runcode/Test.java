package co.runcode;

import java.util.List;

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
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		List<WebElement> listElements = driver.findElements(By.className("r"));
		if (listElements != null && listElements.size() > 0) {
			for (WebElement webElement : listElements) {
				System.out.println(webElement.getText());
			}
		}else{
			System.out.println(" No encontre ningún link");
		}

	}

}
