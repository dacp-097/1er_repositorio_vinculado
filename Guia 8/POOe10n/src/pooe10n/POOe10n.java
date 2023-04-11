/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe10n;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class POOe10n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] a = new double[50];
        double[] b = new double[20];

        for (int i = 0; i < 50; i++) {

            a[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(a);
        System.out.println("Vector A ordenado: ");

        for (int i = 0; i < 50; i++) {
            System.out.print(+a[i] + ", ");

        }
        System.out.println("");
        System.out.println("Vector B: ");

        for (int i = 0; i < 20; i++) {

            if (i < 10) {
                b[i] = a[i];
            } else {
                b[i] = 0.5;
            }

            System.out.print(b[i] + ", ");
        }
    }

}
