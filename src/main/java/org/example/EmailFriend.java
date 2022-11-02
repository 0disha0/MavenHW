package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailFriend {
    protected static WebDriver driver;//

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver"); //giving a chromedriver path and creating a basis for automation
        driver = new ChromeDriver(); //creating a chromedriver object
        driver.get("https://demo.nopcommerce.com/");    //Giving a web path
        driver.manage().window().maximize(); //opening and customising window
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click(); //Passing unique locator and sending click action
        driver.findElement(By.className("email-a-friend")).click(); //Passing unique locator and sending click action
        driver.findElement(By.className("friend-email")).sendKeys("F.R.I.E.N.D@gmail.com"); //Passing unique locator and sending user value
        driver.findElement(By.id("YourEmailAddress")).sendKeys("Myself@gmai.com"); //Passing unique locator and sending user value
        driver.findElement(By.id("PersonalMessage")).sendKeys("Hey!\nHow are you?\nI thought this might help you, and it has exclusive price to buys\n Don't be late to buy"); //Passing unique locator and sending user value
        driver.findElement(By.name("send-email")).click(); //Passing unique locator and sending click action

        String getMessage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText(); //Storing the String value after getting the texts
        System.out.println(getMessage); //Printing in console

        driver.quit();  //Closing the web browser and quitting webdriver session





    }
}