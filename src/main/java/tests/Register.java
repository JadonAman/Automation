package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        try {
        	driver.get("https://tutorialsninja.com/demo/");
            driver.manage().window().setSize(new Dimension(785, 864));
            driver.findElement(By.cssSelector(".fa-user")).click();
            driver.findElement(By.linkText("Register")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("input-firstname")).click();
            driver.findElement(By.id("input-firstname")).sendKeys("Aman");
            driver.findElement(By.id("input-lastname")).sendKeys("Jadon");
            driver.findElement(By.id("input-email")).click();
            driver.findElement(By.id("input-email")).sendKeys("AMAN@gmail.com");
            driver.findElement(By.id("input-telephone")).click();
            driver.findElement(By.id("input-telephone")).sendKeys("8282828282");
            driver.findElement(By.id("input-password")).click();
            driver.findElement(By.id("input-password")).sendKeys("AMAN@12345");
            driver.findElement(By.id("input-confirm")).click();
            driver.findElement(By.id("input-confirm")).sendKeys("AMAN@12345");
            driver.findElement(By.name("agree")).click();
            driver.findElement(By.cssSelector(".btn-primary")).click();
            System.out.println("Test Executed Successfully");
        } finally {
            driver.quit();
        }
        
	}
        
}
