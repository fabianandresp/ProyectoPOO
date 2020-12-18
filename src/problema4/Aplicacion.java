/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Aplicacion {

    Scanner s = new Scanner(System.in);
    Arreglo nuevo = new Arreglo();
    int arreglo[];

    public void datosArreglo() {
        System.out.println("DIGITE EL NOMBRE DEL ARREGLO:");
        String x = s.next();
        nuevo.setNombreDelArreglo(x);

        System.out.println("TAMAÑO DEL ARREGLO: ");
        int size = s.nextInt();
        nuevo.setEspacio(size);

    }

    public void elementoArreglo() {
        arreglo = new int[nuevo.getEspacio()];

        for (int i = 0; i < nuevo.getEspacio(); i++) {
            System.out.println("DIGITE LOS NUMEROS DEL ARREGLO, RECORDAR QUE DEBEN SER DE MENOR A MAYOR: ");
            arreglo[i] = s.nextInt();

        }
        System.out.println();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Los numero en el arreglo son " + arreglo[i]);
        }

    }

    public void busquedaBinaria() {
        System.out.println("VAMOS A BUSCAR UN NUMERO!!!");
        int numBuscado;
        System.out.println("¿QUE NUMERO DESEA BUSCAR?: ");
        numBuscado = s.nextInt();
        int inferior = 0;
        int centro;
        int superior = nuevo.getEspacio() - 1;

        while (inferior <= superior) {
            centro = (superior + inferior) / 2;

            if (arreglo[centro] == numBuscado) {
                System.out.println("El numero buscado esta en la posicion: " + centro);
                break;
            } else if (numBuscado < arreglo[centro]) {
                superior = centro - 1;
            } else {
                inferior = centro + 1;

            }
        }

    }
}
