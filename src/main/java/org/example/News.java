package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class News {

    protected static WebDriver driver;//declare a variable for webdriver

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver");//Setting a path for a webdriver and creating basis for automation on chrome
        driver = new ChromeDriver();  //creating a chromedriver object
        driver.get("https://demo.nopcommerce.com/");// giving the web address
        driver.manage().window().maximize();//opening and customising window
        driver.findElement(By.xpath("//div[@class='news-list-homepage']/div[2]/div[2]/div[3]//a")).click();
        // finding the element with in the webpage from xpath(in locator) and clicking on it
        driver.findElement(By.className("enter-comment-title")).sendKeys("News");
        // finding the element within the webpage as class(in locator) and adding daya in it
        driver.findElement(By.className("enter-comment-text")).sendKeys(" Thank you so much\nThat was a stunning news");
        // finding the element within the webpage as class(in locator) and adding daya in it
        driver.findElement(By.name("add-comment")).click();
        // finding the element with in the webpage as name(in locator) and clicking on it

        String getMessage = driver.findElement(By.className("result")).getText();
        // Storing string value after finding text in regMsg variable
        System.out.println(getMessage);// printing a stored data(text msg)

        driver.quit();// to close webdriver session


    }
}
