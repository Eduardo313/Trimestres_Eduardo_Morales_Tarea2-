/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario_eduardo_morales_tarea2;
import java.util.Scanner;
/**
 *
 * @author Best Buy Uptown
 */
public class Horario_Eduardo_Morales_Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una hora");
        int hora = entrada.nextInt();
        
        if(hora >= 1 && hora <= 24){
            if(hora == 6){
                System.out.println("Despertar a las" + hora);
            } else if(hora == 7){
                System.out.println("Clase de administración y desayuno a las " + hora );
            } else if(hora >= 8 && hora < 10){
                System.out.println("Clases de organizacion Computacional de 8 a 10 de la mañana");
            } else if(hora >= 10 && hora < 12){
                System.out.println("Clase de Fisica de 10 a 12 de la mañana");
            } else if(hora == 12){
                System.out.println("Clase de Herramientas a las " + hora );
            } else if(hora >= 13 && hora < 15){
                System.out.println("Tiempo libre desde la 1 a las 3 de la tarde");
            } else if(hora == 15){
                System.out.println("Almorzar a las"+ hora);
            } else if(hora >= 16 && hora < 20 ){
                System.out.println("Tiempo libre desde las 4 hasta las 8 de la tarde" );
            } else if(hora == 20){
                System.out.println("Cenar a las 8 de la tarde");
            } else if(hora >= 21 && hora < 23){
                System.out.println("Tiempo libre desde las 9 hasta las 11 de la noche");
            } else if((hora >= 23 && hora <= 24) || (hora >= 1 && hora < 6)){
                System.out.println("Dormir desde las 11 de la noche hasta las 6 de la mañana");
            }
        } else {
            System.out.println("Hora no válida");
        }
    }
}