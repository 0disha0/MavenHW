package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {
    // this program to do automation on getting data from web page
    protected static WebDriver driver;//declaring a variable for webdriver

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver");//giving a chromedriver path and creating a basis for automation
        driver = new ChromeDriver();   //creating a chromedriver object
        driver.get("https://demo.nopcommerce.com/");// giving the web address
        driver.manage().window().maximize();//opening and customising window
        driver.findElement(By.linkText("Computers")).click();
        //finding the element within the webpage from link text(in locator) and clicking on it
        driver.findElement(By.linkText("Desktops")).click();
        //finding the element within the webpage from link text(in locator) and clicking on it

        String store = driver.findElement(By.className("center-2")).getText();// Storing string value after finding text in regMsg variable
        System.out.println(store);// printing a stored data(text msg)

        driver.quit();// to quit browser window or to close webdriver session
    }
}
