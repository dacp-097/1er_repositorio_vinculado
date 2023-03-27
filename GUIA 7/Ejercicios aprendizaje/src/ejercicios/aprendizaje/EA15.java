/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

/**
 *
 * @author DELL
 */
public class EA15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector = new int[100];
        int x =0;
        for (int i = 0; i<100;i++){
            
           vector[i]=x++;
           System.out.println(" numero: "+ (i+1) + " es: " + (100-vector[i]));
        }

    }
    
}

