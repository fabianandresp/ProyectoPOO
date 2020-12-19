/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

/**
 *
 * @author pimie
 */
public class MadreFamilia {
    //propiedades

    String nombre;
    String apellido;
    int edad;
    int carne;

    // Metodos
    public MadreFamilia() {

    }

    public MadreFamilia(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "MadreFamilia{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", carne=" + carne + '}';
    }

    //Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

}
