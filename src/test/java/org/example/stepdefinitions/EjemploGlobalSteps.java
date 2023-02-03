package org.example.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.example.userinterfaces.HomePage;
import org.openqa.selenium.WebDriver;

import static org.example.task.AgregarProducto.agregarProducto;
import static org.example.task.BuscarProducto.buscarProducto;

public class EjemploGlobalSteps {

//TODO refactor en una clase padre setup
@Managed(driver = "chrome")
private WebDriver navegador;

private Actor actor = Actor.named("Global");
private HomePage homePage = new HomePage();

    @Dado("que un nuevo cliente accede hasta la web de compras")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("el agrega {string} unidades de {string} de {string} al carro")
    public void elAgregaUnidadesDeDeAlCarro(String cantidad, String descripcion, String tipoCategoria) {
        actor.attemptsTo(
                buscarProducto()
                        .conDescripcion(descripcion, tipoCategoria),
                agregarProducto()
                        .conCantidad(cantidad)

        );
    }

    @Entonces("el ve los productos listados en el carro de compras")
    public void elVeLosProductosListadosEnElCarroDeCompras() {
    }

    @Cuando("el agrega productos al carro")
    public void elAgregaProductosAlCarro() {

    }

}
