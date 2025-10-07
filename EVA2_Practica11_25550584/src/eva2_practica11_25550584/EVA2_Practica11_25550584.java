/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica11_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica11_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int ini, fin, resi;
        System.out.println("Inicio: ");
        ini = captu.nextInt();
        System.out.println("Fin: ");
        fin = captu.nextInt();
        for (int i = 0; i < 10; i++) {
            resi = i % 2 ; // SABER SI EL NUMERO ES PAR OMGGGGG
                if (resi == 0) {//es parr
                System.out.print(i + " - ");    
            }
            
        }
    }
    
}
