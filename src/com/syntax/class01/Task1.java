package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //we use "webdriver" because that is a parent of chromeDriver, FirefoxDriver...etc.
        // That way we can change "ChromeDriver" in the future without changing Webdriver"
        WebDriver driver=new ChromeDriver();//this is what launches the browser
        driver.get("https://www.amazon.com/");//this is what navigates to the url
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);

    }
}
