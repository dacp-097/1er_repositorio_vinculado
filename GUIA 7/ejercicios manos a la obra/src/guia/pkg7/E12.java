/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner leer= new Scanner(System.in);

        System.out.println("Ingrese dos valores para validar si son multiplos ");
        
        System.out.println("Ingrese num1: ");
        int num1 = leer.nextInt();

         System.out.println("Ingrese num2: ");
        int num2 = leer.nextInt();

      esMultiplo(num1,num2);
    }
    
    public static void esMultiplo (int num1,int num2){
            
        int resp;
        
        resp= num1%num2;
        
        if (resp !=0) {
            
        System.out.println("el numero: " + num1 + " NO es multiplo de: " + num2 );
        
        } else{ 
        
        System.out.println("el numero: "+num1+ " SI es multiplo de: "+num2);

        }
           
        }
            
}
