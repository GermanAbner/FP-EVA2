/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica16_2555058;

/**
 *
 * @author miria
 */
public class EVA2_Practica16_2555058 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matriz[][]= new int [3][4];
       matriz [0][0] = 100;
       matriz [0][1] = 200;
       matriz [0][2] = 300;
       matriz [0][3] = 400;
       //CICLOS ANIDADOS OMGGGGGGGGGGGGGGGGG
        for (int i = 0; i < matriz.length; i++) { // ES 3 PORQUE ES LA PRIMERA filas
            for (int j = 0; j < 4; j++) { // ES 4 PORQUE ES LA SEGUNDA columnas
                //POR CADA REPETICON QUE TENGA EL FOR EN LA i, VA A TENER 4 REPETICIONES EN LA j
                matriz [i][j] = (int)(Math.random()*100);
                               
            }
            //SOL EXISTE LA VARIABLE DENTRO DE LOS {} ASIQUE ECHALE GANAS PAPA
            
        }
            
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 4; j++) { 
               System.out.print("[" + matriz [i][j] + "]");
                               
            }
            
            System.out.println("");
            
            
        }
        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        
    }
    
}
