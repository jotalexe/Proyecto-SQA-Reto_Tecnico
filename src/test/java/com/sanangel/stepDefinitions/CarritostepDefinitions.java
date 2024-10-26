package com.sanangel.stepDefinitions;


import com.sanangel.steps.SanAngelSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CarritostepDefinitions {




    @Steps
    SanAngelSteps sanAngelSteps;




    @Dado("que estoy en la página de inicio de San Ángel")
    public void queEstoyEnLaPáginaDeInicioDeSanÁngel() throws IOException  {

        sanAngelSteps.abrirnavegador();

    }

    @Cuando("agrego un producto al carrito")
    public void agregoUnProductoAlCarrito() throws IOException   {

        sanAngelSteps.clicdestellos();
        //sanAngelSteps.clicagregarcantidad();
        sanAngelSteps.agregarcarrito();
        sanAngelSteps.menuprincial();
        sanAngelSteps.clipresente();
        sanAngelSteps.agregarcarrito2();

    }

    @Entonces("el carrito de compras debe mostrar una cantidad total")
    public void elCarritoDeComprasDebeMostrarUnaCantidadTotal() {

        sanAngelSteps.validarTotal();

    }

}
