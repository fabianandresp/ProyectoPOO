/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pimie
 */
public class Menu {

    // Atributos 
    int opcion;

    //Funciones o metodos
    //Metodo para dar opciones y solicitar eleccion
    public void opciones() {
        System.out.println("Bienvenido!");
        System.out.println(" ESTAS SON LAS OPCIONES DISPONIBLES ");
        System.out.println("1.- INGRESAR DATOS DE ALUMNOS");
        System.out.println("2.- INGRESAR NOTAS");
        System.out.println("3.- INGRESAR DATOS DEL PADRE Y LA MADRE");
        System.out.println("4.- MOSTRAR DATOS ALMACENADOS");

    }

    public void opciones2() {
        System.out.println("2.- INGRESAR NOTAS");
        System.out.println("3.- INGRESAR DATOS DEL PADRE Y LA MADRE");
        System.out.println("4.- MOSTRAR DATOS ALMACENADOS");
        System.out.println("5.- FINALIZAR");
    }

    public void opciones3() {

        System.out.println("3.- INGRESAR DATOS DEL PADRE Y LA MADRE");
        System.out.println("4.- MOSTRAR DATOS ALMACENADOS");
        System.out.println("5.- FINALIZAR");

    }

    public void opcionNew() {
        System.out.println("4.- MOSTRAR DATOS ALMACENADOS");
        System.out.println("5.- FINALIZAR");

    }
    public void opcionnew2(){
        System.out.println("5.- FINALIZAR");
    }

    public void opciones4() {
        System.out.println("1.- INGRESAR DATOS DE ALUMNOS");
        System.out.println("2.- INGRESAR NOTAS");
        System.out.println("3.- INGRESAR DATOS DEL PADRE Y LA MADRE");
        System.out.println("4.- MOSTRAR DATOS ALMACENADOS");
        System.out.println("5.- FINALIZAR");
    }

    public Menu() {

    }

}
