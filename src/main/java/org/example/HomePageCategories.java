package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories {

    protected static WebDriver driver;//declaring a variable for webdriver

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver"); //giving a chromedriver path and creating a basis for automation
        driver = new ChromeDriver(); //creating a chromedriver object
        driver.get("https://demo.nopcommerce.com/"); //Giving a web path
        driver.manage().window().maximize(); //opening and customising window

        String categories = driver.findElement(By.className("header-menu")).getText(); //Storing a String variable
        System.out.println(categories); //Printing the String variable in console

        driver.quit();  //Closing all the browser window and terminating  webdriver session


    }
}
