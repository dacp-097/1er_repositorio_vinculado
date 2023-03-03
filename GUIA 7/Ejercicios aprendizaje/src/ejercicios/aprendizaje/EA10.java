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
public class EA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un limite para la suma ");
        int limit = leer.nextInt();
        
        System.out.println("Ingrese numeros hasta alcanzar el limite de su suma ");
       
        int suma;
        suma=0;
        
        do {
            
            System.out.println("Ingrese un numero: ");
             int num = leer.nextInt();
             
             suma= suma+num;
            
        } while ( suma <= limit );
        
        System.out.println(" Se alcanzo el limite ...");
    }
    
}
