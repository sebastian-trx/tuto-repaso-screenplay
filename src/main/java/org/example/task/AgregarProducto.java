package org.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AgregarProducto implements Task {

    private String cantidad;

    public AgregarProducto conCantidad(String cantidad){
       // this.cantidad = cantidad;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(),
                Enter.theValue(cantidad).into(),
                Click.on(),
                Click.on()
        );
    }

    public static AgregarProducto agregarProducto(){
        return new AgregarProducto();
    }
}
