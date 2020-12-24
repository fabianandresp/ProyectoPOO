/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizDoble;

/**
 *
 * @author pimie
 */
public class Pizza {

    Ingredientes queso;
    Ingredientes pepperoni;
    Ingredientes carne;
    Ingredientes tomate;

    public Pizza(Ingredientes queso, Ingredientes pepperoni, Ingredientes carne, Ingredientes tomate) {
        this.queso = queso;
        this.pepperoni = pepperoni;
        this.carne = carne;
        this.tomate = tomate;
    }

    Pizza() {

    }

    public void calcularMonto() {
        float resultado = 0;
        if (queso != null) {
            resultado += queso.getPrecio();

        } else if (queso != null) {
            resultado += pepperoni.getPrecio();
        } else if (queso != null) {
            resultado += carne.getPrecio();
        } else if (queso != null) {
            resultado += tomate.getPrecio();
        }
        resultado = (float) ((queso.getPrecio() + pepperoni.getPrecio() + carne.getPrecio() + tomate.getPrecio()) * 1.30);

        System.out.println("El precio de la Pizza es : " + resultado);
        System.out.println("Los ingrendientes que tiene la Pizza es: \n Queso \n Pepperoni \n Carne \n Tomate");
    }

    public void mostrarPrecio() {

    }

    public Ingredientes getQueso() {
        return queso;
    }

    public void setQueso(Ingredientes queso) {
        this.queso = queso;
    }

    public Ingredientes getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Ingredientes pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Ingredientes getCarne() {
        return carne;
    }

    public void setCarne(Ingredientes carne) {
        this.carne = carne;
    }

    public Ingredientes getTomate() {
        return tomate;
    }

    public void setTomate(Ingredientes tomate) {
        this.tomate = tomate;
    }

}
