/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import problema1.*;
import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Tester1 {

    public static void main(String[] args) {
        //CONFIGURAR MONEDAS
        Moneda mColon = new Moneda("Colon", 0);
        Moneda mDolar = new Moneda("Dolar", 0);
        Moneda mEuro = new Moneda("Euro", 0);

        //INICIA 
        Scanner s = new Scanner(System.in);
        Convertidora maq = new Convertidora(mColon, mDolar, mEuro);
        //maq.setMonedaColon(mColon);
        //maq.setMonedaDolar(mDolar);
        //maq.setMonedaEuro(mEuro);

        while (true) {
            System.out.println("Digite la moneda de origen 1=Colon 2=Dolar 3=Euro");
            int numMonedaOrigen = s.nextInt();
            System.out.println("Digite la moneda de salida 1=Colon 2=Dolar 3=Euro");
            int numMonedaSalida = s.nextInt();
            System.out.println("Digite la cantidad");
            int cantidad = s.nextInt();

            if (numMonedaOrigen == 1) {//Colon
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mColon, cantidad));
                } else if (numMonedaSalida == 2) { //Dolar
                    System.out.println("Digite el valor de cambio del dolar: ");
                    float x = s.nextFloat();
                    mDolar.setValorColon(x);
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mDolar, cantidad));
                } else { //euro
                    System.out.println("Digite el valor de cambio del Euro");
                    float y = s.nextFloat();
                    mEuro.setValorColon(y);
                    System.out.println("El valor equivalente es: " + maq.convertir(mColon, mEuro, cantidad));
                }
            } else if (numMonedaOrigen == 2) {//Dolar
                if (numMonedaSalida == 1) {//Colon
                    System.out.println("Digite el valor de cambio del colon: ");
                    float z = s.nextFloat();
                    mColon.setValorColon(z);
                    System.out.println("El valor equivalente es: " + maq.convertir(mDolar, mColon, cantidad));

                } else if (numMonedaSalida == 2) { //Dolar
                    System.out.println("El valor equivalente es: " + maq.convertir(mDolar, mDolar, cantidad));
                } else { //euro
                    System.out.println("Digite el valor de cambio del Euro");
                    float y = s.nextFloat();
                    mEuro.setValorColon(y);
                    System.out.println("El valor equivalente es: " + maq.convertir(mDolar, mEuro, cantidad));
                }
            } else { //Euro

                if (numMonedaSalida == 1) {//Colon
                    System.out.println("Digite el valor de cambio del colon: ");
                    float z = s.nextFloat();
                    mColon.setValorColon(z);
                    System.out.println("El valor equivalente es: " + maq.convertir(mEuro, mColon, cantidad));
                } else if (numMonedaSalida == 2) { //Dolar
                    System.out.println("Digite el valor de cambio del dolar: ");
                    float x = s.nextFloat();
                    mDolar.setValorColon(x);
                    System.out.println("El valor equivalente es: " + maq.convertir(mEuro, mDolar, cantidad));
                } else { //euro
                    System.out.println("El valor equivalente es: " + maq.convertir(mEuro, mEuro, cantidad));
                }
            }
        }
    }

}
