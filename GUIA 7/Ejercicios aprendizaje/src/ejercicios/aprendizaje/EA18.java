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
public class EA18 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
     * A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     */
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        System.out.println("Matriz A");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 100);

                System.out.print(" {" + matriz[i][j]);

            }

            System.out.println("");

        }

        //xxxx
        System.out.println("Matriz B");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(" {" + matriz[j][i]);
            }
            System.out.println("");
        }
    }
}
