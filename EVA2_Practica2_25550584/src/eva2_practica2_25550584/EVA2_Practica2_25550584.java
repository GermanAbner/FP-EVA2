/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica2_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica2_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Retirar Monto");
        System.out.println("3. Depositar Monto");
        System.out.println("Selecciona una opcion del menú");
         
        opc= captu.nextInt();
        switch(opc){
            case 1:
                System.out.println("Eligiste imprimir Saldo!!");
                break;//ROMPE O DETIENE LA INSTRUCCION OMGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG SOUT    SOUT    SOUT    SOUT    
                       
            case 2:
                System.out.println("Eligiste Retirar Monto!!");
                break;
                
            case 3:
                System.out.println("Elegiste Depositar Monto!!");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
      }
    
}
