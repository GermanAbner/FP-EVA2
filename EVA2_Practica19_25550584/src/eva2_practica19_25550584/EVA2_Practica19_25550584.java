/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica19_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_Practica19_25550584 {
    final static String Usuario = "Admin";
    final static String PWR = "Admin";
    public static void main(String[] args) {
        //PEDIMOS DATOS DE ACCESO
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        //Validamos
        //INCORRECTO --> volver a preguntar
        //Correcto --> Acceso al Sistema
        do {
                
            System.out.println("Usuario: ");
            usu = captu.nextLine();
            System.out.println("Contrasena: ");
            contra = captu.nextLine();
            //if (usu.equals(Usuario)&&contra.equals(PWR)) {
            
        }while(!(usu.equals(Usuario) && contra.equals(PWR)));
        
        //VALIDAR
    
        System.out.println("ACCESO CONCEDIDO, BIENVENIDO AL SISTEMA");
                
    }
    
}
