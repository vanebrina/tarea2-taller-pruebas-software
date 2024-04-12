import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class edestinosTests {

    private WebDriver driver;

    @BeforeAll
    public static void configuracionGeneral() {
//        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Taller Software\\edgedriver_win64\\msedgedriver.exe");
    }

    @BeforeEach
    public void abrirNavegador() {
        driver = new EdgeDriver();
        driver.get("https://www.edestinos.com.co/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    void prueba1() {

    }

}
