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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String cad;
        String fde = "&&&&&";
        int cc = 0;
        int ci = 0;
        

        do {

            System.out.println("Ingrese cadena para analisis RS232 ");

            cad = leer.nextLine();
            
            if (cad.substring(0, 1).equals("X") && cad.substring(4, 5).equals("O") && cad.length() == 5) {

                cc++;

            } else {

                ci++;
            }

        } while (!("&&&&&".equals(cad)));

        System.out.println("cantidad de lecturas correctas: " + cc);
        System.out.println("cantidad de lecturas INcorrectas: " + ci);

    }
}