package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab4Test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://tutorialsninja.com/demo/");
            driver.manage().window().setSize(new Dimension(945, 1060));

            driver.findElement(By.linkText("Desktops")).click();

            driver.findElement(By.linkText("Mac (1)")).click();

            Thread.sleep(1000);

            driver.findElement(By.id("input-sort")).click();

            WebElement dropdown = driver.findElement(By.id("input-sort"));

            dropdown.findElement(
                    By.xpath("//option[text()='Name (A - Z)']"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(
                    By.cssSelector(".button-group > button:nth-child(1)"))
                    .click();

            driver.findElement(By.name("search")).sendKeys("mobile");

            driver.findElement(
                    By.cssSelector(".input-group-btn > .btn"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(By.id("input-search")).clear();

            driver.findElement(By.id("input-search")).sendKeys(" ");

            driver.findElement(By.id("description")).click();

            driver.findElement(By.id("button-search")).click();

            System.out.println("Test Executed Successfully");

        } finally {
            driver.quit();
        }
    }
}