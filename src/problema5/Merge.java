/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

/**
 *
 * @author pimie
 */
public class Merge {

    int arreglo1[] = {1, 2, 3, 4, 5};
    int arreglo2[] = {6, 1, 3, 15, 58};
    int arreglo3[] = new int [10];
    
    public void mezclar(){
        int j = 0;
        for(int i = 0;i<5;i++){
            arreglo3[j] = arreglo1[i];
            j++;
            arreglo3[j]= arreglo2[i];
            j++;
        }
    }
    public void imprimir(){
        System.out.println("El Arreglo final es: ");
        for(int i = 0 ; i<10;i++){
            System.out.println(arreglo3[i]);
        }
    }
    public void ordenar(){
        for(int i = 0; i <10;i++){
            for(int j = 0; j<10-1; j++){
                if (arreglo3[j]>arreglo3[j+1]){
                   int aux = arreglo3[j];
                   arreglo3[j] = arreglo3[j+1];
                   arreglo3[j+1]=aux;
                    
                    
                }
            }
        }
    }
    public void imprimirArrayFinal(){
        System.out.println("Arreglo Final ordenado es :");
        for(int i = 0 ; i<10;i++){
            System.out.print(arreglo3[i]+"-");
        }
    }
    
    

}

    
   
    
    
    

