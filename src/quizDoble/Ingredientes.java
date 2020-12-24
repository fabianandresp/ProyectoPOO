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
public class Ingredientes {

    String ingrediente;
    int precio;
    String codigo;

    public Ingredientes(String ingrediente, int precio) {
        this.ingrediente = ingrediente;
        this.precio = precio;
    }

    public Ingredientes() {

    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
