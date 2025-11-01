/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica23_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica23_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, posi = -1;   //SIGNIFICICA QUE NO LO ENCONTRAMOS
                
        int datos [] = new int [10];
        
        for (int i = 0; i < datos.length; i++) {
            int dato = datos[i];
            datos [i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
        }
        System.out.println("");
        System.out.println("Valor a buscar: ");
        valor = captu.nextInt();
        //BUSQUEDA LINEAL
            for (int i = 0; i < datos.length; i++) {
                if (valor ==  datos[i]) {//lo encontramos
                    // posi ES LA VARIABLE QUE DEFINE LA POSICION
                    posi = i; // regresamos donde la encontramos
                    System.out.println("Posicion: " + posi);
                    break;
                    
                }
//                System.out.println("Posicion: " + posi);
            
            
            }
            
            
    }
    
}
