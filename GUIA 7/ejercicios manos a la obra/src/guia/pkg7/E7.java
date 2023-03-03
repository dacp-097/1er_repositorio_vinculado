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
public class E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese un valor entre 1 y 4 (detalle de motor)");

        int opc = leer.nextInt();

        switch (opc) {

            case 1:
                System.out.println("es una bomba de agua");
                break;

            case 2:
                System.out.println("es una bomba de gasolina ");
                break;

            case 3:
                System.out.println(" es una bomba de hormigon ");
                break;

            case 4:
                System.out.println(" es una bomba de pasta alimenticia ");
                break;

            default:
                System.out.println(" no existe un valor para esta bomba ");

        }
    }

}
