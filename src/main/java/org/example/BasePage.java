package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BasePage {
    // this program to do automation on filling the register form
    protected static WebDriver driver;//declaring a variable for webdriver

    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver");//giving a chromedriver path
        driver=new ChromeDriver();      //creating a chromedriver object
        String timeStamp =new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println();
        driver.get("https://demo.nopcommerce.com/");// giving the web address
        driver.manage().window().maximize();//opening and customising window
        driver.findElement(By.className("ico-register")).click();
        // finding the element within the webpage as class(in locator) and clicking on it
        driver.findElement(By.id("gender-female")).click();//finding the element within the webpage as id(in locator) and clicking on it
        driver.findElement(By.id("FirstName")).sendKeys("Daisha");// finding the element with in the webpage as id(in locator) and adding data in it
        driver.findElement(By.id("LastName")).sendKeys("Kanani");// finding the element with in the webpage as id(in locator) and adding data in it
        driver.findElement(By.xpath("//select [@name =\"DateOfBirthDay\"]")).sendKeys("10");
        // finding the element with in the webpage from xpath(in locator) and adding data in it
        driver.findElement(By.xpath("//select [@name =\"DateOfBirthMonth\"]")).sendKeys("February");
        // finding the element with in the webpage from xpath(in locator) and adding data in it
        driver.findElement(By.xpath("//select [@name =\"DateOfBirthYear\"]")).sendKeys("2000");
        // finding the element with in the webpage from xpath(in locator) and adding data in it
        driver.findElement(By.id("Email")).sendKeys("dish"+timeStamp+"kan@gamil.com");
        // finding the element with in the webpage as id(in locator) and adding data in it
        driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Unique private ltd.");
        // finding the element with in the webpage from xpath(in locator) and adding data in it
        driver.findElement(By.id("Password")).sendKeys("dish@5903");// finding the element with in the webpage as id(in locator) and adding data in it
        driver.findElement(By.id("ConfirmPassword")).sendKeys("dish@5903");// finding the element with in the webpage as id(in locator) and adding data in it
        driver.findElement(By.id("register-button")).click();//finding the element within the webpage as id(in locator) and clicking on it

        String regMsg = driver.findElement(By.className("result")).getText(); // Storing string value after finding text in regMsg variable
        System.out.println(regMsg);// printing a stored data(text msg)

        driver.quit();// to close webdriver session and window



    }

}
