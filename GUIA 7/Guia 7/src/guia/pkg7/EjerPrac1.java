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
public class EjerPrac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros para sumar> ");

        System.out.println(" num1: ");
        int num1 = leer.nextInt();
        
        System.out.println(" num2: ");
        int num2 = leer.nextInt();
                        
        System.out.println(" el resultado es: " + (num1+num2));
        
    }
    
}
