package com.exito.interactions;

import com.exito.utils.DatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;


import static com.exito.userInterfaces.CategoriaSeleccionadaExitoUI.*;




public class IrCarritoCompras implements Interaction {


    public static Target TXT_NOMBRE_PRUDCITO_CARRITO = null;

    @Override
    public <T extends Actor> void performAs(T actor) {

        DatosExcel datos = new DatosExcel();
        actor.attemptsTo(Click.on(BTN_CARRITO));
        for (int i=0; i< 5; i++){
            try {
                String texto = datos.leerDatoExcel("Hoja de datos","data.xlsx",i,0);
                TXT_NOMBRE_PRUDCITO_CARRITO = Target.the("xpath")
                        .locatedBy("//*[contains(text(), "+"'"+texto+"')]");
                System.out.println(datos.leerDatoExcel("Hoja de datos","data.xlsx",i,0));

                actor.attemptsTo(
                        Ensure.that(TXT_NOMBRE_PRUDCITO_CARRITO).text().contains(datos.leerDatoExcel("Hoja de datos","data.xlsx",i,0))
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static IrCarritoCompras on(){
        return Instrumented.instanceOf(IrCarritoCompras.class).withProperties();
    }
}
