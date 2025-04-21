package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class matriz_001Page {

    private WebDriver driver;

    // Constructor
    public matriz_001Page(WebDriver driver) {
        this.driver = driver;
    }

    // Method to load the data matrix
    public void loadDataMatrix() {
        // Example: navigating to a specific URL where the matrix is loaded
        driver.get("http://example.com/data-matrix");
    }

    // Method to verify if the matrix is loaded correctly
    public boolean isDataMatrixLoaded() {
        // Example check to see if a specific element is present that signifies the matrix is loaded
        WebElement matrixElement = driver.findElement(By.id("matrix-element-id"));
        return matrixElement.isDisplayed();
    }
}