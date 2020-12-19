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
public class EquipoSonido {

    Scanner input = new Scanner(System.in);
    String musica;
    String[] listaAudios = new String[1000];
    int cont = 0;

    public EquipoSonido() {

    }

    public void almacenarMusica() {
        System.out.println("VAMOS AGREGAR MUSICA A LA LISTA ");
        musica = input.next();

        if (cont < 100) {
            listaAudios[cont] = musica;
            cont++;

        }
    }

    public void reproducirLista() {
        System.out.println("QUE CANCION DESEA REPRODUCIR? ");
        System.out.println("Las opciones son las siguientes: ");
        for (int i = 0; i < listaAudios.length; i++) {
            if (listaAudios[i] != null) {
                System.out.println("1.- " + listaAudios[i]);
            }
        }

    }
    public void escogerCancion(){
        
    }

    public void mostrarLista() {
        for (int i = 0; i < cont; i++) {
            if (listaAudios[i] != null) {
                System.out.println(listaAudios[i]);
            }

        }
    }

    public boolean eliminarMusica() {
        boolean resultado = false;
        if (cont != 0) {
            listaAudios[cont - 1] = null;
            cont--;
            resultado = true;

        }
        return resultado;

    }

    public void reproducirRadio() {
        System.out.println("Se esta reproduciendo una cancion de MALUMA");

    }

}
