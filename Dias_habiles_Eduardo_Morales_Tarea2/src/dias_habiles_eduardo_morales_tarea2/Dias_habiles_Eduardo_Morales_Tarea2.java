/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dias_habiles_eduardo_morales_tarea2;
import java.util.Scanner;
/**
 *
 * @author Best Buy Uptown
 */
public class Dias_habiles_Eduardo_Morales_Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        MetodoDia dia = new MetodoDia();
        System.out.println("Escribe un dia de la semana");
        dia.setDia(entrada.nextLine());
        System.out.println(dia.getDia());
    }
}
class MetodoDia {
    private String dia;
    private String diaHF;
    public void setDia(String dia){
        this.dia = dia;
        if(this.dia.equalsIgnoreCase("lunes") || this.dia.equalsIgnoreCase("Martes") || 
           this.dia.equalsIgnoreCase("Miercoles") || this.dia.equalsIgnoreCase("Jueves") || 
           this.dia.equalsIgnoreCase("Viernes")){
            this.diaHF = "Dia habil";
        } else if(this.dia.equalsIgnoreCase("sabado") || this.dia.equalsIgnoreCase("domingo")){
            this.diaHF = "Fin de semana";
        } else{
                 this.diaHF = "Día incorrecto";
        }
    }
    public String getDia(){
        return this.diaHF;
    }
}