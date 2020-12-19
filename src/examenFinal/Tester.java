/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenFinal;

/**
 *
 * @author pimie
 */
public class Tester {
    public static void main (String [ ] args){
        
        EquipoSonido a = new EquipoSonido();
        Parlantes prue = new Parlantes();
        
        a.almacenarMusica();
        a.mostrarLista();
        a.reproducirLista();
        
        prue.volumenParlante();
        
        
        
        
        
    }
}
