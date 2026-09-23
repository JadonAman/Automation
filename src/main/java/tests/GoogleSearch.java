package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

    public static void main(String[] args) {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        try {

            // Open Google
            driver.get("https://www.google.com");

            // Maximize browser window
            driver.manage().window().maximize();

            // Locate search box
            WebElement searchBox = driver.findElement(By.name("q"));

            // Type search text
            searchBox.sendKeys("Testing Methods");

            // Submit search
            searchBox.submit();

            // Wait for results page to load
            Thread.sleep(3000);

            // Print page title
            System.out.println("Page Title: " + driver.getTitle());

        } catch (Exception e) {

            System.out.println("Error occurred: " + e.getMessage());

        } finally {

            // Close browser
            driver.quit();
        }
    }
}