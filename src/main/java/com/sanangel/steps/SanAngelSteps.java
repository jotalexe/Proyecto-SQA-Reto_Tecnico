package com.sanangel.steps;

import com.sanangel.pageObjects.SanAngelPage;
import com.sanangel.utils.DatosExcel;
import com.sanangel.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class SanAngelSteps {


    SanAngelPage sanAngelPage = new SanAngelPage();
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    private static final String Ruta = "sanangel.xlsx";
    private static final String PaginaWeb = "Url";
    private static final String Cantidad1 = "Cantidad1 ";
    private static final String Cantidad2 = "Cantidad2 ";




    @Step("Abrir Navegador")
    public void abrirnavegador() throws IOException {
        sanAngelPage.openUrl(datosExcel.leerDatosExcel(Ruta,PaginaWeb,1,0));
    }

    @Step("Clic en Destellos")
        public void clicdestellos(){
        sanAngelPage.getDriver().findElement(sanAngelPage.getTxtDestellos()).click();

    }

     /*@Step("Clic Agregar Cantidad")
    public void clicagregarcantidad() throws IOException {
        sanAngelPage.getDriver().findElement(sanAngelPage.getTxtCantida()).
                sendKeys(datosExcel.leerDatosExcel(Ruta, Cantidad1,1,0));
         esperaImplicita.EsperaImplicita(5);
    }*/

   @Step("Agregar Carrito")
    public void agregarcarrito(){
        sanAngelPage.getDriver().findElement(sanAngelPage.getBtnAgregar()).click();
        esperaImplicita.EsperaImplicita(8);
    }

    @Step("Menu Principal")
    public void menuprincial(){
        sanAngelPage.getDriver().findElement(sanAngelPage.getImgMenuPrincipal()).click();
    }

    @Step("Clic Presente")
        public void clipresente(){
            sanAngelPage.getDriver().findElement(sanAngelPage.getTxtPresente()).click();
    }

    @Step("Agregar Carrito2")
    public void agregarcarrito2(){
        sanAngelPage.getDriver().findElement(sanAngelPage.getBtnAgregar()).click();
        esperaImplicita.EsperaImplicita(8);
    }

    @Step
    public void validarTotal(){
          Assert.assertThat(sanAngelPage.getDriver().findElement(sanAngelPage.getTxtTotal())
                .isDisplayed(), Matchers.is(true));

   }
}
