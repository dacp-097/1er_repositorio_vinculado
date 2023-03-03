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
public class EjerciciosAprendizaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese una frase: ");
        
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        

        System.out.println(frase.toLowerCase()); 
        

        System.out.println(frase.toUpperCase());





    }
    
}
