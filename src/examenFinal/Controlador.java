/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenFinal;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Controlador {

    Scanner input = new Scanner(System.in);

    EquipoSonido men = new EquipoSonido();
    Parlantes sonido = new Parlantes();

    int eleccion;

    public void menu() {
        
        System.out.println("BIENVENIDO");

        System.out.println("1.- REPRODUCIR RADIO");
        System.out.println("2.- VER LISTA DE CANCIONES EN LA LISTA");
        System.out.println("3.- AGREGAR CANCIONES A LA LISTA");
        System.out.println("4.- REPRODUCIR LISTA");
        System.out.println("5.- ELIMINAR CANCION DE LA LISTA ");
        System.out.println("6.- MODIFICAR VOLUMEN DE PARLANTES ");
        System.out.println("7. PROGRAMAR ENCENDIDO");
        System.out.println("8.- APAGAR");

        System.out.println("QUE DESEA HACER?");
        eleccion = input.nextInt();
        entradaMenu();
    }
    public void iniciar(){
          while (true) {
            menu();

        }
    }

    public void entradaMenu() {
        switch (eleccion) {
            case 1:
                men.reproducirRadio();
                break;

            case 2:
                men.mostrarLista();
                break;

            case 3:
                men.almacenarMusica();
                break;

            case 4:
                men.reproducirLista();
                sonido.sonarEquipo();
                break;
            case 5:
                men.eliminarMusica();
                break;

            case 6:
                sonido.volumenParlante();
                break;
            case 7: 
                men.programaEncendido();
                System.out.println("EL ENCENDIDO QUEDO PROGRAMADO PARA LAS: " + men.universal.getHora()+ men.universal.getMinutos());
                break;
            case 8:
                sonido.apagarEquipo();
                break;
                

        }
    }

}
