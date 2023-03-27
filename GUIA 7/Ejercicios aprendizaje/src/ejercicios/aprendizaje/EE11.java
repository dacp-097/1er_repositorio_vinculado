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
public class EE11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        int i=0;
      
        
        System.out.println("Ingrese un numero ");
        int num=leer.nextInt();
        
        while(num!=0){
            
        num=num/10;
        //num /= 10;
            i++;
            
        }
        
        
       
        
        System.out.println("El numero tiene " +i+ " digitos");
    }
    
}
