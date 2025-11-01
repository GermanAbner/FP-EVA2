/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica26_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica26_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,r = 1;
        Scanner captu = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("Brindame un numero para sacar su factorial");
        System.out.println("******************************************");
        n = captu.nextInt();
        

        for (int i = 1; i <= n; i++) {
            r *= i;
                
                
            }
            System.out.println("*************************************************");
            System.out.println("El factorial de el numero que me brindaste es : " + r);
            System.out.println("*************************************************");
            // SU LIMITE ES DE 31 DESPUES DE ESTE MARCA CERO Y DESDE 32-34 MARCAN NUMEROS NEGATIVOS omgggg
        }
    }
    

