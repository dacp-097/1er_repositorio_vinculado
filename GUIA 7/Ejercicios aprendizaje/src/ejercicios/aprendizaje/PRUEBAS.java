/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PRUEBAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero;
ArrayList numeros = new ArrayList();
ArrayList estrellas = new ArrayList();

// Genera 5 numeros entre 1 y 50
for (int i = 1; i <= 5; i++) {
    numero = (int) (Math.random() * 50 + 1);
    if (numeros.contains(numero)) {
        i--;
    } else {
        numeros.add(numero);
    }
}

System.out.println("La convinacion del Euromillones es:");
for (Integer n : numeros) {
    System.out.println(n + "");
}


// Genera 2 numeros entre 1 y 11
for (int i = 1; i <= 2; i++) {
    numero = (int) (Math.random() * 11 + 1);
    if (estrellas.contains(numero)) {
        i--;
    } else {
        estrellas.add(numero);
    }
}
System.out.println("\nY las estrellas son: ");
for (Integer n : estrellas) {
    System.out.println(n);
}
        
        
        
        
/*Scanner leer = new Scanner(System.in);

int[] vector= new int[10];

for (int i =0; i<10;i++) {

    vector[i]= (int) (Math.random()*5+1);
    System.out.println("numero "+i+ " es: "+ vector[i]);
    
    
}
    
    

    }
    
}
*/