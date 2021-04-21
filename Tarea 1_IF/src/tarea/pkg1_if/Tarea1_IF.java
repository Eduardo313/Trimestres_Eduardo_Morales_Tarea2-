/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1_if;
import java.util.Scanner;
/**
 *
 * @author Best Buy Uptown
 */
public class Tarea1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
       System.out.println("Introduce un año");
       int año = entrada.nextInt();
       int añoI = 0;
       if(año<2021){
           añoI=2021 - año;
           System.out.println("Pasaron " + añoI + " años");
       } else if(año > 2021){
           añoI = año - 2021;
           System.out.println("Faltan " + añoI + " años");
       } else{
           System.out.println("Es el año actual");
       }
       
    }

}
