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
public class EA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(" ingrese palabra clave: ");

        Scanner leer = new Scanner(System.in);

        String cad = leer.nextLine();

        if (cad.equals("eureka") || cad.equals("EUREKA")) {

            System.out.println("correcto ");

        } else {
            System.out.println("Incorrecto");
        }

    }
    
   
    
    
    
    
    
    
    
    
}
