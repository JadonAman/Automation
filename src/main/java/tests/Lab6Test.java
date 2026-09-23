package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6Test {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://tutorialsninja.com/demo/");
            driver.manage().window().setSize(new Dimension(700, 871));

            driver.findElement(By.cssSelector(".list-inline .dropdown-toggle")).click();
            driver.findElement(By.linkText("Login")).click();

            Thread.sleep(2000);

            driver.findElement(By.id("input-email"))
                    .sendKeys("amanjadon.in@gmail.com");

            driver.findElement(By.id("input-password"))
                    .sendKeys("AMAN@0987");

            driver.findElement(By.cssSelector(".btn:nth-child(3)"))
                    .click();

            Thread.sleep(10000);

            driver.findElement(By.cssSelector(".btn-navbar")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Components")).click();
            driver.findElement(By.linkText("Monitors (2)")).click();

            Thread.sleep(2000);

            WebElement dropdown =
                    driver.findElement(By.id("input-limit"));

            dropdown.findElement(
                    By.xpath("//option[text()='25']"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(
                    By.cssSelector(".product-layout:nth-child(1) button:nth-child(1)"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.linkText("Specification"))
                    .click();

            Actions action = new Actions(driver);

            action.moveToElement(
                    driver.findElement(
                            By.cssSelector(".btn-group > .btn:nth-child(2)")))
                    .perform();

            action.moveToElement(
                    driver.findElement(By.tagName("body")), 0, 0)
                    .perform();

            action.moveToElement(
                    driver.findElement(
                            By.cssSelector(".btn-group > .btn-default:nth-child(1)")))
                    .perform();

            action.moveToElement(
                    driver.findElement(By.tagName("body")), 0, 0)
                    .perform();

            driver.findElement(
                    By.cssSelector(".btn > .fa-heart"))
                    .click();

            action.moveToElement(
                    driver.findElement(
                            By.cssSelector(".btn-group > .btn-default:nth-child(1)")))
                    .perform();

            action.moveToElement(
                    driver.findElement(
                            By.cssSelector(".btn > .fa-exchange")))
                    .perform();

            driver.findElement(By.name("search"))
                    .sendKeys("Mobile");

            driver.findElement(
                    By.cssSelector(".input-group-btn > .btn-lg"))
                    .click();

            Thread.sleep(3000);

            driver.findElement(By.id("description")).click();
            driver.findElement(By.id("content")).click();
            driver.findElement(By.id("button-search")).click();

            Thread.sleep(2000);

            driver.findElement(
                    By.cssSelector(".product-layout:nth-child(1) .img-responsive"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(By.id("input-quantity"))
                    .clear();

            driver.findElement(By.id("input-quantity"))
                    .sendKeys("3");

            driver.findElement(By.id("button-cart"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(
                    By.cssSelector("a > .fa-shopping-cart"))
                    .click();

            Thread.sleep(1000);

            driver.findElement(By.cssSelector(".caret"))
                    .click();

            driver.findElement(By.linkText("Logout"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.linkText("Continue"))
                    .click();

            System.out.println("Test Executed Successfully");

        } finally {

            driver.quit();
        }
    }
}