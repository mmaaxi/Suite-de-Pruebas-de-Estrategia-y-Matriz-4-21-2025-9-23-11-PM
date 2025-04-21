package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.estrategia_001Page;

public class estrategia_001Steps {
    estrategia_001Page page = new estrategia_001Page();

    @Given("^estoy en Google Sheets$")
    public void navegarAGoogleSheets() {
        page.irAGoogleSheets();
    }

    @When("^cargo la estrategia$")
    public void cargarEstrategia() {
        page.cargarEstrategia();
    }

    @Then("^la estrategia se carga correctamente$")
    public void validarEstrategiaCargada() {
        assertTrue(page.estrategiaCargada());
    }
}