package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Vuelos {

    private WebDriver driver;

    public Vuelos(WebDriver driver){this.driver = driver;}

    public String recomendacion(){
        WebElement fechaCercana =
                driver.findElement(By.className("header"));
        System.out.println(fechaCercana.getText());
        return fechaCercana.getText();
    }

}
