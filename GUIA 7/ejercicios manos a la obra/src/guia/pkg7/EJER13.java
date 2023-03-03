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
public class EJER13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner leer=new Scanner(System.in);
        String[] nombres;
        nombres = new String[4];
        

for (int i=0;i<4;i++) {
        
    System.out.println("Ingrese nombres de integrante ");
    nombres[i] = leer.next();

    }

for (int i=0;i<4;i++){
     System.out.print( nombres[i] + " " );
     

}


    }
    
}
