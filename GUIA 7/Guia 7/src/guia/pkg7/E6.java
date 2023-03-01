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
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25*/
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa num1 ");
        int num1;
        num1 = leer.nextInt();

        System.out.println("Ingresa num2 ");
        int num2;
        num2 = leer.nextInt();

        if ((num1 == 25) && (num2 == 25)) {

            System.out.println(" Ambos numeros son = 25 ");

        } else if ((num1 == 25) || (num2 == 25)) {

            System.out.println(" Al menos un numero es = 25 ");

        }
    }

}
