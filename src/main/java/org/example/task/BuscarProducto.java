package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class BuscarProducto implements Task {

    private String descripcion;
    private String tipoCategoria;

    public BuscarProducto conDescripcion(String descripcion, String tipoCategoria){
        this.descripcion = descripcion;
        this.tipoCategoria = tipoCategoria;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(),
                SelectFromOptions.byVisibleText(tipoCategoria).from(),
                Hit.the(Keys.ENTER).into(),
                Click.on()
        );
    }

    public static BuscarProducto buscarProducto(){
        return new BuscarProducto();
    }
}
