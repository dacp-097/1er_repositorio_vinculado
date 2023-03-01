package guia7;

import java.util.Scanner;

/**
 *
 * @author Marcela
 */
public class Ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese dos numero: ");
        int A= leer.nextInt();
        int B= leer.nextInt();
        EsMultiplo ( A, B);
    }
    public static void EsMultiplo (int A, int B){
        int residuo = A%B;
        if (residuo == 0){
            System.out.println( A + "es multiplo de "+ B);
        }
        else {
            System.out.println(A +"no es multiplo de " + B);
        }
    }
}
