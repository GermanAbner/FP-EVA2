/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica10_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica10_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //IMPRIMANME LOS NUMEROS DEL 1 AL 20
        //1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 15 - 16 - 17 - 18 - 19 - 20
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " - ");
        //IMPRIMIR LOS NUMEROS PARES DEL 0 AL 100
        //0 - 2 - 4 - 6 - 8 - 10 - 12 - 14 - 16 ... 100
        // += SUMA  __ -= RESTA __ *= MULTIPLICA __ /= DIVIDE
        }
            System.out.println("");  
        for (int j = 0; j <= 100; j+=2) {
                System.out.print(j + " - ");
                
            }
        System.out.println("");
        for (int a = 100; a >= 0; a-=2) {
            System.out.print(a + " - ");
            
        }
        System.out.println("");
        for (int b = -15; b <= 5; b+=1) {
            System.out.print(b + " - ");
        }
        System.out.println("");
        
        for (int i = 5; i == 15; i--) {
            System.out.println(i + " - ");
            
        }
        
        System.out.println("*********************");
        
        
        int numero;
        System.out.println("Brindame un numero y te dare su tabla de multiplicacion");            
        Scanner captu = new Scanner(System.in);   
        numero = captu.nextInt();
    
       for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        }
    }
        
 
    

