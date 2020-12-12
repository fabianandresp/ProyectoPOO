/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizDoble;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Tester {
    
    public static void main( String [] args){
        Scanner s = new Scanner(System.in);
        
       Ingredientes n1 = new Ingredientes ("queso" , 450 );
       Ingredientes n2 = new Ingredientes ("Pepperoni ", 550); 
       Ingredientes n3 = new Ingredientes ("carne ", 650); 
       Ingredientes n4 = new Ingredientes ("tomate ", 350);
       
       
       Pizza familiar = new Pizza(n1,n2,n3,n4);
       
       
       familiar.setQueso(n1);
       familiar.setPepperoni(n2);
       
       familiar.calcularMonto();
       
       
       
        
        
        
        
        
        
    }
    
}
