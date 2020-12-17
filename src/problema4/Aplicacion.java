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

    public void datosArreglo() {
        System.out.println("DIGITE EL NOMBRE DEL ARREGLO:");
        String x = s.next();
        nuevo.setNombreDelArreglo(x);

        System.out.println("TAMAÑO DEL ARREGLO: ");
        int size = s.nextInt();
        nuevo.setEspacio(size);

    }

    public void elementoArreglo() {
        int arreglo[] = new int[nuevo.getEspacio()];

        for (int i = 0; i < nuevo.getEspacio(); i++) {
            System.out.println("DIGITE LOS NUMEROS DEL ARREGLO: ");
            arreglo[i] = s.nextInt();
            
            
        }
        System.out.println();
        for (int i = 0; i <nuevo.getEspacio(); i++){
            System.out.println(nuevo.elementos);
        }
        

    }
}
