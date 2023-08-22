package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG {

    @Test
    public void basariliMailTesti(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.tr/");
        System.out.println("Bu bir başarılı bir mail testidir");
        driver.close();

    }
    @Test
    public void basarisizMailTesti(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.tr/");
        System.out.println("Bu bir başarısız bir mail testidir");
        driver.close();

    }
}
