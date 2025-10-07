/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica9_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica9_25550584 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int rep;
        String mensaje;
        System.out.println("***");
        System.out.println("Mensaje a Repetir");
        mensaje = captu.nextLine();
        System.out.println("Cantidad de Repeticiones");
        rep = captu.nextInt();
        System.out.println("***");
        
        for (int i = 1; i <= rep; i++) {
            System.out.println(mensaje);
            
        
        }
        
        
       
    }
    
}
