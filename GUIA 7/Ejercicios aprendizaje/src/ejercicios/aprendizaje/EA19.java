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
public class EA19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];
     
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;

        System.out.println("Matriz A");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(" {" + matriz[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("Matriz B");
        
        //Segunda matriz
        int[][] matriz2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matriz2[j][i] = -1 * matriz[i][j];
                System.out.print(" {" + matriz2[j][i]);
            }
            System.out.println("");
        }

        boolean a = true;
        int i=0;
        while (a = true&& i < 3) {

            for (i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] == (-1)*matriz2[j][i]) {

                        a = true;

                    } else {
                        a = false;
                    }

                }

            }

        }

        if (a = true) {
            System.out.println(" La matriz A es antisimetrica ");
        } else {
            System.out.println(" La matriz A  no es antisimetrica ");
        }

    }
}
    
