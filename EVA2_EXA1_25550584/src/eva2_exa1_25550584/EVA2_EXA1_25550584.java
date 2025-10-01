/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_exa1_25550584;

import java.util.Scanner;

/**
 *
 * @author miria
 */
public class EVA2_EXA1_25550584 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);
      int pin, opc, monto, calculo;
      int Saldo = 5000;
      System.out.println("Introduce el PIN: ");
      pin = captu.nextInt();
       if (pin == 1234){
            System.out.println("1.Consultar Saldo");
            System.out.println("2. Retirar Monto");
            System.out.println("3. Depositar Monto");      
            System.out.println("Selecciona la opcion");
            opc = captu.nextInt();
            if (opc ==1){
                System.out.println("Tu saldo es de " + Saldo);
            }else if (opc == 2){
                System.out.println("Cuanto vas a retirar?");
            monto = captu.nextInt();
             if (monto <= Saldo){
                 calculo = Saldo - monto;
                 System.out.println("Tu saldo es de " + calculo);
                 }else{
                 System.out.println("Monto mayor al saldo");}
             
            }else if (opc == 3){
                   System.out.println("Tu saldo es de " + Saldo);
                   System.out.println("Cuanto vas a depositar?");
            monto = captu.nextInt();
             if (monto >= 0){
                 calculo = Saldo + monto;
                 System.out.println("Tu saldo es de " + calculo);
                 }else{
                 System.out.println("Monto mayor al saldo");}
            }else{
                System.out.println("Opcion incorrecta");
            }
       }else{
       System.out.println("PIN INCORRECTO");
       }
    }
    
}
