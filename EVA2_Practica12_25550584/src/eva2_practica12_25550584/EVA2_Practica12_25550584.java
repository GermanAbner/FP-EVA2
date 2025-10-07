/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica12_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica12_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int numero;
        System.out.println("*******************************************************");
        System.out.println("Brindame un numero y te dare su tabla de multiplicacion");            
        Scanner captu = new Scanner(System.in);   
        numero = captu.nextInt();   
        System.out.println("*******************************************************");
    
       for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
                
                }
        System.out.println("*******************************************************");
    }
    
    
}
