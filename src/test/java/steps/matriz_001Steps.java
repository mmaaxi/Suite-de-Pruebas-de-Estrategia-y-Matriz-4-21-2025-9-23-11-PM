package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.matriz_001Page;

public class matriz_001Steps {

    matriz_001Page matrizPage = new matriz_001Page();

    @Given("el usuario carga la matriz de datos")
    public void cargarMatrizDeDatos() {
        matrizPage.loadDataMatrix();
    }

    @Then("la matriz se carga correctamente")
    public void matrizSeCargaCorrectamente() {
        Assert.assertTrue(matrizPage.isDataMatrixLoaded());
    }
}