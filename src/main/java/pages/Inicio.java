package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Inicio {
    private WebDriver driver;

    public Inicio(WebDriver driver) {this.driver = driver;}

    public void soloIda(){
        List<WebElement> ida =
                driver.findElements(By.name("ot"));
        ida.get(1).click();
    }

    public void origen(String origen){
        WebElement campoOrigen =
                driver.findElement(By.id("departureOneway"));
        campoOrigen.sendKeys(origen);
    }

    public void destino(String destino){
        WebElement campoDestino =
                driver.findElement(By.id("arrivalOneway"));
        campoDestino.sendKeys(destino);
    }

    // public void FechaSalida(String fecha){
    //    WebElement campoFechaSalida =
    //        driver.findElement(By.id("departureDateOneway"));
    //    campoFechaSalida.sendKeys(fecha);
    // }

    public void fechaSalida(){
        driver.findElement(By.cssSelector(".oneway-qsf .departure-date > .ui-datepicker-trigger")).click();
        WebElement element =
                driver.findElement(By.cssSelector(".oneway-qsf .departure-date > .ui-datepicker-trigger"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(By.linkText("24")).click();
    }

    // public void FechaRegreso(String fecha){
    //    WebElement campoFechaRegreso =
    //        driver.findElement(By.id("returnDateOneway"));
    //    campoFechaRegreso.sendKeys(fecha);
    // }

    public void fechaRegreso(){
        WebElement element =
                driver.findElement(By.cssSelector(".disabled > .ui-datepicker-trigger"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        driver.findElement(By.id("returnDateOneway")).click();
        driver.findElement(By.cssSelector(".ui-icon-circle-triangle-e")).click();
        driver.findElement(By.linkText("25")).click();
    }

    public void pasajeros(){
        WebElement pasajero =
                driver.findElement(By.xpath("//*[@id=\"qsf_form\"]/section[2]/div[2]/fieldset[1]/div"));
        pasajero.click();
    }

    public void numPasajeros(){
        List<WebElement> pasajeroAdulto =
                driver.findElements(By.className("plus"));
        //Realiza un clic al boton para seleccionar 1 pasajero adulto más del que aparece al inicio de pagína
        // for (int i = 0; i < 2; i++) {
        //      pasajeroAdulto.get(0).click();
        // }
        pasajeroAdulto.get(0).click();

        List<WebElement> pasajeroNino =
                driver.findElements(By.className("plus"));
        //Realiza un clic al boton para seleccionar 1 pasajero niño
        pasajeroNino.get(2).click();
    }

    public void buscarInfo(){
        WebElement buscar =
                driver.findElement(By.className("transaction"));
        buscar.click();
    }

    //Vuelos + Hotel

    public void vuelosHotel(){
        WebElement vh =
                driver.findElement(By.xpath("//*[@id=\"multiQsf\"]/div[1]/div[3]/div/div[2]/a"));
        vh.click();
    }

}
