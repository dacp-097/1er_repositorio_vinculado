/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ingrese un numero entero: ");
        
        Scanner leer= new Scanner(System.in);
        
        int num= leer.nextInt();
        
        System.out.println(" El doblre del numero ingresado es: " + (num*2));
        
        System.out.println(" El triple del numero ingresado es: " + (num*3));
        
        System.out.println(" La raiz cuadrada del numero ingresado es: " + Math.sqrt(num));
        


    }
    
}
