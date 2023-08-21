import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();   // tam ekran yapar
        int X = driver.manage().window().getPosition().getX();      // pencerenin x düzlemindeki konumunu verir
        int Y = driver.manage().window().getPosition().getY();      // pencerenin y düzlemindeki konumunu verir


        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);  // sayfanın yüklenmesini bekler
        driver.get("https://www.amazon.com/ref=nav_logo");                     // ilgili adrese gider
        String Title = driver.getTitle();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        String PageSource = driver.getPageSource();
        driver.navigate().forward();


        driver.quit();                                      // geçerl isekmeyi kapatır
    }
}
