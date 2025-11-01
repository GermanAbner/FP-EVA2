/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica25_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica25_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int n; 
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("------------------");
        System.out.println("Ingresa un numero: ");
        n = captu.nextInt();
        System.out.println("------------------");
               
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
         for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}