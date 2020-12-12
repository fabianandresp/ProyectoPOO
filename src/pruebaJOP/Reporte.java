/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaJOP;

import javax.swing.JOptionPane;

/**
 *
 * @author pimie
 */
public class Reporte {
    boolean GUI = true;

    public void imprimirReporte() {

        String mensaje = "Mensaje prueba";
        if (GUI) {
            JOptionPane.showMessageDialog(null, mensaje);

        } else {
            System.out.println(mensaje);
        }

    }
}
