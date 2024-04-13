package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class VuelosHotel {

    private WebDriver driver;

    public VuelosHotel(WebDriver driver){this.driver = driver;}

    public void origen(String origen){
        WebElement campoOrigen =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/fieldset/div[1]/esky-autocomplete/span/esky-autocomplete-input/div/div/input"));
        campoOrigen.click();

        WebElement llenarCampoOrigen =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/fieldset/div[1]/esky-autocomplete/span/esky-autocomplete-picker/div[2]/esky-autocomplete-topbar/div/esky-autocomplete-input/div/div/input"));
        llenarCampoOrigen.sendKeys(origen);
    }

    public void escogerOrigen(){
        List<WebElement> listaOrigen =
                driver.findElements(By.className("hint-container"));
        listaOrigen.get(0).click();
    }

    public void destino(String destino){
        WebElement campoDestino =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/fieldset/div[2]/esky-autocomplete/span/esky-autocomplete-input/div/div/input"));
        campoDestino.click();

        WebElement llenarCampoDestino =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/fieldset/div[2]/esky-autocomplete/span/esky-autocomplete-picker/div[2]/esky-autocomplete-topbar/div/esky-autocomplete-input/div/div/input"));
        llenarCampoDestino.sendKeys(destino);
    }

    public void escogerDestino(){
        List<WebElement> listaDestino =
                driver.findElements(By.className("hint-container"));
        listaDestino.get(0).click();
    }

    public void fechas(){
        WebElement element =
                driver.findElement(By.cssSelector(".wrap:nth-child(1) .trip-date-input"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).clickAndHold().perform();

        WebElement element2 =
                driver.findElement(By.cssSelector(".ng-star-inserted:nth-child(4) > .disabled:nth-child(1)"));
        Actions builder2 = new Actions(driver);
        builder2.moveToElement(element2).release().perform();

        driver.findElement(By.cssSelector(".trip-dates")).click();
        driver.findElement(By.cssSelector(".calendar-month:nth-child(3) > .ng-star-inserted:nth-child(6) > .calendar-day:nth-child(4) .day")).click();
        driver.findElement(By.cssSelector(".calendar-month:nth-child(4) > .ng-star-inserted:nth-child(6) > .calendar-day:nth-child(6) > .day-number")).click();
        driver.findElement(By.cssSelector(".submit")).click();
    }

    public void pasajeros(){
        WebElement escojerPasajeros =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/div/div/fieldset/div/room-selector"));
        escojerPasajeros.click();
    }

    public void numPasajeroNino(){
        WebElement numNino =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/div/div/fieldset/div/room-selector/section/ul/li/div[2]/counter-input/div/a[2]"));
        numNino.click();

        WebElement Nino1 =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/div/div/fieldset/div/room-selector/section/ul/li/div[2]/div/ul/li/select-input/esky-dropdown/div/span"));
        Nino1.click();

        List<WebElement> edadNino =
                driver.findElements(By.className("options-option"));
        edadNino.get(0).click();

        WebElement terminar =
                driver.findElement(By.className("finished"));
        terminar.click();
    }

    public void buscarInfo(){
        WebElement buscar =
                driver.findElement(By.xpath("/html/body/lp-app/lp-landing-page-component/lp-page-header/esky-hero/esky-packages-search-form/form/div/div/button"));
        buscar.click();
    }

    public String verificar(){
        List<WebElement> recomendaciones =
                driver.findElements(By.className("desc"));
        System.out.println(recomendaciones.get(2).getText());
        return recomendaciones.get(2).getText();
    }

}
