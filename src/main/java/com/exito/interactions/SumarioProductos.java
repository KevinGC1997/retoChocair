package com.exito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static com.exito.userInterfaces.CategoriaSeleccionadaExitoUI.*;

public class SumarioProductos implements Interaction {

    List<Integer> arreglo;
    int num;

    public SumarioProductos(List<Integer> arreglo, int num) {
        this.arreglo = arreglo;
        this.num = num;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        int j=0;
        System.out.println(arreglo.get(num));

        //clickea hasta agregar la cantidad
        while (arreglo.get(num) > j ){
            actor.attemptsTo(
                    Click.on(BTN_AGREGAR_CANTIDAD)
            );
            j++;
        }


    }
    public static SumarioProductos EnSitio(List<Integer> arreglo, int num) {
        return Instrumented.instanceOf(SumarioProductos.class).withProperties(arreglo, num);
    }
}
