/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica6_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica6_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Scanner captu = new Scanner(System.in);
        int dia;
        
        String diasSemana [] ={"Domingo","Lunes","Martes",
                               "Miercoles","Jueves","Viernes"};
        
        System.out.println("Introduce el dia en numero (0-6)");
        dia = captu.nextInt();
        System.out.println("El dia es " + diasSemana[dia]);
        
    }
    
}
