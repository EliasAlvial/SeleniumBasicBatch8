package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
                                                        //chromedriver.exe for windows users
                                                        //you can also use \\

        WebDriver driver=new ChromeDriver();
        driver.get("https:syntaxtechs.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
    }
}