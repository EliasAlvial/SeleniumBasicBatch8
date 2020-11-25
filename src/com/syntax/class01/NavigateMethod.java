package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.navigate().to("http://facebook.com");//this is used to go back and forward
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();// these are functionalities that do as they say
        Thread.sleep(1000);
        driver.navigate().refresh();//
        driver.close();//this will close current tab
        //driver.quit //this will close the whole browser

        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);
    }
}
