/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author pimie
 */
public class Arreglo {

    int elementos;
    int espacio;
    String nombreDelArreglo;
    
    public Arreglo (){
        
    }

    public Arreglo(int elementos, int espacio, String nombreDelArreglo) {
        this.elementos = elementos;
        this.espacio = espacio;
        this.nombreDelArreglo = nombreDelArreglo;
    }

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getNombreDelArreglo() {
        return nombreDelArreglo;
    }

    public void setNombreDelArreglo(String nombreDelArreglo) {
        this.nombreDelArreglo = nombreDelArreglo;
    }
    

}
