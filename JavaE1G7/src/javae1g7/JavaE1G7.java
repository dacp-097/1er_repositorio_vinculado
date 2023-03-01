/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javae1g7;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaE1G7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
        System.out.println("?que edad tienes?");
        int edad = leer.nextInt();
        System.out.println("¿cual es tu nombre?");
        String cad = leer.next();
                 
         System.out.println("Tu edad es: " + edad);
         System.out.println("Tu nombre es: " + cad);
    }
    
}
