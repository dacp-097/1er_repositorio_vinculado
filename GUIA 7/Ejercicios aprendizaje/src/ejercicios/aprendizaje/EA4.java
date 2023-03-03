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
public class EA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese una cantidad de grados CENTIGRADOS ");
        
        Scanner leer = new Scanner(System.in);
        int gc = leer.nextInt();
        
        int f = 32 +(9*(gc/5));
        
        System.out.println(+gc +" grados centigrados equivalen a: " + f + " grados fahrenheit");
                
        
        
        
    }
    
}
