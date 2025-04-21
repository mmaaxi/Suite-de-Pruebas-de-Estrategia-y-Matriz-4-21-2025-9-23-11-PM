package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class estrategia_001Page {
    WebDriver driver;

    public estrategia_001Page() {
        System.setProperty("webdriver.chrome.driver", "ruta/al/driver/chromedriver");
        driver = new ChromeDriver();
    }

    public void irAGoogleSheets() {
        driver.get("https://docs.google.com/spreadsheets/");
        // Asegurar que estamos logueados o manejo de autenticación aquí
    }

    public void cargarEstrategia() {
        // Código para navegar a la hoja de cálculo específica y cargar estrategia
        // Puede ser: driver.findElement(By.xpath("rutaXPath")).click();
    }

    public boolean estrategiaCargada() {
        // Verificar que la estrategia se haya cargado
        // Puede ser: boolean resultado = driver.findElement(By.id("resultadoId")).isDisplayed();
        return true; // Implementar verificación real
    }
}