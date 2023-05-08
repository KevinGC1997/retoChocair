package com.exito.interactions;

import com.exito.utils.DatosExcel;
import com.exito.utils.LimpiarNumero;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;
import java.util.List;


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
                TXT_NOMBRE_PRUDCITO_CARRITO = Target.the("xpath nombre")
                        .locatedBy("//*[contains(text(), "+"'"+texto+"')]");
                /*List<WebElementFacade> listaTotal = TXT_TOTAL_PRECIOS_PRODUCTOS.resolveAllFor(actor);
                String numLimpio = LimpiarNumero.LimpiarNumero(listaTotal.get(i).getText());*/
                actor.attemptsTo(
                        Ensure.that(TXT_NOMBRE_PRUDCITO_CARRITO).text().contains(texto)
                        /*Ensure.that(numLimpio).contains(datos
                                .leerDatoExcel("Hoja de datos","data.xlsx",i,3))*/
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
