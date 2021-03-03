/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Best Buy Uptown
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = entrada.nextInt();
        String[] unidades = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String[] decimos = {"diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte"};
        String[] decenas = {"veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        if(numero >= 0 && numero <= 9){
            System.out.println(unidades[numero]);
        } else if(numero >= 10 && numero <= 20) {
            System.out.println(decimos[numero - 10]);
        } else if(numero >= 21 && numero <= 30){
            if(numero < 30){
                System.out.println(decenas[0] + unidades[numero - 20]);
            } else{
                System.out.println(decenas[1]);
            }
        }  else if(numero >= 31 && numero <= 40){
            if(numero < 40){
                System.out.println(decenas[1] + " y " + unidades[numero - 30]);
            } else{
                System.out.println(decenas[2]);
            }
        } else if(numero >= 41 && numero <= 50){
            if(numero < 50){
                System.out.println(decenas[2] + " y " + unidades[numero - 40]);
            } else{
                System.out.println(decenas[3]);
            }
        } else if(numero >= 51 && numero <= 60){
            if(numero < 60){
                System.out.println(decenas[3] + " y " + unidades[numero - 50]);
            } else{
                System.out.println(decenas[4]);
            }
        } else if(numero >= 61 && numero <= 70){
            if(numero < 70){
                System.out.println(decenas[4] + " y " + unidades[numero - 60]);
            } else{
                System.out.println(decenas[5]);
            }
        } else if(numero >= 71 && numero <= 80){
            if(numero < 80){
                System.out.println(decenas[5] + " y " + unidades[numero - 70]);
            } else{
                System.out.println(decenas[6]);
            }
        } else if(numero >= 81 && numero <= 90){
            if(numero < 90){
                System.out.println(decenas[6] + " y " + unidades[numero - 80]);
            } else{
                System.out.println(decenas[7]);   
            }
        } else if(numero >= 91 && numero <= 99){
            System.out.println(decenas[7] + " y " + unidades[numero - 90]);
        }
    }
}