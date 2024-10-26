package com.sanangel.pageObjects;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SanAngelPage extends PageObject  {


    // Localizadores de los productos

    By txtDestellos = By.xpath("//h2[text() = 'Destellos'][1]");
    By txtPresente = By.xpath("//h2[text() = 'Presente'][1]");


    By txtCantida = By.id("quantity_671c3634536ce");

    By btnAgregar = By.xpath("//button[@type='submit']");
    By imgMenuPrincipal = By.xpath("//img[@class='navmenu__logo'][1]");
    By txtTotal = By.xpath("//tr[@class='order-total']");

    public By getTxtDestellos() {return txtDestellos;}
    public By getTxtPresente() {return txtPresente;}
    public By getTxtCantida() {return txtCantida;}


    public By getBtnAgregar() {return btnAgregar;}
    public By getImgMenuPrincipal() {return imgMenuPrincipal;}
    public By getTxtTotal() {return txtTotal;}







}
