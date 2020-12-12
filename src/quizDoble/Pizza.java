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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int calcularMonto() {
        int resultado = 0;
        if (queso != null) {
            resultado += queso.getPrecio();
            
        }
        else if (queso != null) {
            resultado += pepperoni.getPrecio();
        }

        else if (queso != null) {
            resultado += carne.getPrecio();
        }
        else if (queso != null) {
            resultado += tomate.getPrecio();
        }
        
        return  resultado;
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
