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
public class EA9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nuna frase o palabra para validar: ");
        String frase = leer.nextLine();

        char letra = 'A';

        for (int i = 0; i == 0; i++) {

            xx = frase.charAt(i);

            if (frase.charAt(0) == letra) {

                System.out.println("CORRECTO");

            } else {
                System.out.println("INCORRECTO");
            }
        }

    }

}
