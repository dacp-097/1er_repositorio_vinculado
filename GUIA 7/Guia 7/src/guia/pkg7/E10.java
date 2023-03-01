
package guia.pkg7;

import java.util.Scanner;

public class E10 {


    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n = 0;
        int num;

        do {

            System.out.println(" escribir un numero entre 1 y 20 ");
            num = leer.nextInt();

            while (num < 1 || num > 20) {

                System.out.println("numero no valido vuelva a intentar");

                num = leer.nextInt();
            }

            n++;

            System.out.print(num);

            for (int i = 0; i < num; i++) {

                System.out.print("*");

            }

            System.out.println(" ");

        } while (n < 4);
    }

}

