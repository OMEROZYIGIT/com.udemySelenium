package testNG1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testNG {

    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void testtenOncekiAdimlar() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void anaSayfaBaglama(){

        driver.get("https://www.google.com.tr/");
    }
    @AfterTest
    public void testtenSonrasiAdimlar() {
        System.out.println("test başarılı");
        driver.quit();

    }
}
