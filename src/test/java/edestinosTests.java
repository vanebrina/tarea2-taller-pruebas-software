import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import pages.Inicio;
import pages.Vuelos;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        driver.manage().window().maximize();
        driver.get("https://www.edestinos.com.co/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

//    @AfterEach
//    public void cerrarNavegador() {
//        //cerrar ventana
//        driver.quit();
//    }

    @Test
    void Vuelos(){

        //Vuelos
        //----------------------------------------------------------
        Inicio paginaInicio = new Inicio(driver);

        paginaInicio.soloIda();

        paginaInicio.origen("Bogota");
        paginaInicio.destino("Miami");

        // Ingresar las fechas por medio de Strings
        // paginaInicio.FechaSalida(2024-04-25);
        // paginaInicio.FechaRegreso(2024-05-25);

        paginaInicio.fechaSalida();
        paginaInicio.fechaRegreso();

        paginaInicio.pasajeros();
        paginaInicio.numPasajerosAdultos();
        paginaInicio.pasajeros();

        paginaInicio.buscarInfo();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // entramos a la pagína de vuelos y hacemos los asserts necesarios
        Vuelos paginaVuelos = new Vuelos(driver);

        String recomienda = paginaVuelos.recomendacion();
        assertEquals("Vuelos en fechas cercanas", recomienda);

        //Vuelos + Hotel
        //-----------------------------------------------------------



    }

}
