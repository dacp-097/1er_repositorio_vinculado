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
public class EA8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


 System.out.println("Ingrese una frase de 8 de largo ");

        Scanner leer = new Scanner(System.in);
        
        String cad = leer.nextLine();
        
        System.out.println("extension: " + cad.length());
        
        
if (cad.length() ==8 ){
    
    System.out.println("Correcto");
} else{
    
    System.out.println("Incorrecto");
}


    }
    
}
