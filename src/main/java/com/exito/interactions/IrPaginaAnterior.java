package com.exito.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class IrPaginaAnterior implements Interaction {


    WebDriver driver;

    public static IrPaginaAnterior onThePage() {

        return Tasks.instrumented(IrPaginaAnterior.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().navigate().back();

    }


}
