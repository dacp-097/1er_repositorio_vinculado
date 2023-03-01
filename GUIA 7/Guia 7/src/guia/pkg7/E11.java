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
public class E11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase terminada en punto (.)");
        String cad = leer.nextLine();

        System.out.println("LA NUEVA FRASE ES: " + funcionCadCodific(cad));

    }

    public static String funcionCadCodific(String cad) {

        String cadAux = " ";
        char letra;

        for (int i = 0; i < cad.length(); i++) {

            letra = cad.charAt(i);

            switch (letra) {

                case 'a':
                case 'A':
                    cadAux = cadAux + '@';
                    break;

                case 'e':
                case 'E':
                    cadAux = cadAux + '#';
                    break;

                case 'i':
                case 'I':
                    cadAux = cadAux + '$';
                    break;

                case 'o':
                case 'O':
                    cadAux = cadAux + '%';
                    break;

                case 'u':
                case 'U':
                    cadAux = cadAux + '*';
                    break;

                default:
                    cadAux = cadAux + letra;

            }

        }

        return cadAux;
    }

}
