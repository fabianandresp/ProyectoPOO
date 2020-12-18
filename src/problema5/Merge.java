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
    int arreglo2[] = {6, 1, 3, 15, 58, 60};

    public int[] mezclaDirecta(int[] arreglo) {
        int i, j, k;
        if (arreglo.length > 1) {
            int nElementoIzq = arreglo.length / 2;
            int nElementoDer = arreglo.length - nElementoIzq;
            int arregloIzq[] = new int[nElementoIzq];
            int arregloDer[] = new int[nElementoDer];

            for (i = 0; i < nElementoIzq; i++) {
                arregloIzq[i] = arreglo[i];

            }

            for (i = nElementoIzq; i < nElementoIzq + nElementoDer; i++) {
                arregloDer[i - nElementoIzq] = arreglo[i];

            }
            arregloIzq = mezclaDirecta(arregloIzq);
            arregloDer = mezclaDirecta(arregloDer);
            i = 0;
            j = 0;
            k = 0;
            while (arregloIzq.length != j && arregloDer.length != k) {
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    j++;
                    i++;

                } else {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;

                }
                while (arregloIzq.length != j) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;

                }

                while (arregloDer.length != k) {
                    arreglo[i] = arregloDer[k];
                    i++;
                    k++;
                }
            }

        }
        return arreglo;
    }}

