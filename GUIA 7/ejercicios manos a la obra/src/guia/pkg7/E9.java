
package guia.pkg7;

import java.util.Scanner;

public class E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese numeros positivos para sumar ");

        int num;
        int n;
        n = 1;
        int suma = 0;
        
        do {
            System.out.println("Ingrese un numero ");

            num = leer.nextInt();

            n++;
            System.out.println("n vale: " + n);

            if (num > 0) {

                suma = (num + suma);
            }
            
            if (num ==0 ){
                
                System.out.println("Se capturó el numero cero");
                break;
            }
            

        } while ((num != 0) && (n <= 5));

        System.out.println(" La suma de los numeros positivos es: " + suma);

    }

}
