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
public class Parlantes {

    String izquierdo, derecho, soobwofer;
    int volumen[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 1 al 10
    int funcion; //encendido o apagado
    Scanner input = new Scanner(System.in);

    public void volumenParlante() {
        System.out.println("Que volumen desea? ");
        for (int i = 0; i < 10; i++) {
            System.out.println("las opciones de volumen son de 0 a 10");
            System.out.println("Siendo 0 el mas bajo y 10 el mas alto");
            i = input.nextInt();
            System.out.println("El volumen esta en " + volumen[i]);
            break;
        }
    }
    
        public void sonarEquipo(){
           
        
    }
        public void apagarEquipo(){
            
        }
}
