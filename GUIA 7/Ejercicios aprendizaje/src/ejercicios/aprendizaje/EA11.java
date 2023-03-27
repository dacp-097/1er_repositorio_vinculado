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
public class EA11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean var = true;

        System.out.println(" Ingrese dos numeros para calculos ");

        System.out.println("Ingrese num1: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese num2: ");
        int num2 = leer.nextInt();

        int resp;
        resp = 0;
        String respSN;
        respSN="";
        do {

            System.out.println("MENU\n"
                      + "1. Sumar\n"
                      + "2. Restar\n"
                      + "3. Multiplicar\n"
                      + "4. Dividir\n"
                      + "5. Salir\n"
                      + "Elija opción:");

            resp = leer.nextInt();

            switch (resp) {

                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Su division es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respSN = leer.next();
                    break;
                    
                default:
                    System.out.println("Opcion no valida, vuelva a intentar ");
            }

            System.out.println("Adios...");
            
        } while (!("s".equalsIgnoreCase(respSN)));

    }

}
