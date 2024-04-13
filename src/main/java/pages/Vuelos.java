package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Vuelos {

    private WebDriver driver;

    public Vuelos(WebDriver driver){this.driver = driver;}

    public String recomendacion(){
        WebElement fechaCercana =
                driver.findElement(By.xpath("/html/body/fsr-app/fsr-flights-search-result/fsr-qsf-layout/section/div/flights-list/div/div[2]/div/div/div[1]/esky-prices-bar/div/div/div/div/div/span[1]"));
        System.out.println(fechaCercana.getText());
        return fechaCercana.getText();
    }

}
