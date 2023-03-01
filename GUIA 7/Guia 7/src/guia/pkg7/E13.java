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
public class E13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String[] equipo = new String[5];

        System.out.println("ingrese los nombres del equipo ");

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese un nombre: ");
            equipo[i] = leer.nextLine();

        }
        for (int i = 0; i < 5; i++) {

            System.out.println("nombre " + i + " es : " + equipo[i]);

        }

    }
