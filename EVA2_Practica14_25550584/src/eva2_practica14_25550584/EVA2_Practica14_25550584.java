/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica14_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica14_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
        int tama;
        System.out.println("Cuantas calificaicones va a capturar?");
        tama = captu.nextInt();
        
        int califas[] = new int[tama];
        for (int i = 0; i < califas.length; i++) {
            
            System.out.println("Calificacion " + (i+1) + ":");
            califas [i] = captu.nextInt();
            
        }
        //LECTOR DE INFORMACION OMG
        for (int i = 0; i < califas.length; i++) {
            
            System.out.print("[" + califas [i] + "]");
        
            
        }
        System.out.println("");
    }
    
}
