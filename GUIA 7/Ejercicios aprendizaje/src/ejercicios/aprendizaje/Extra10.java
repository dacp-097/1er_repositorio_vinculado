/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package javaintroejerciciosextras;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Extra10 {
    public static void main(String[] args) {
        int n1, n2, producto, n;
        Scanner leer=new Scanner (System.in);
    n1=(int)(Math.random()*11);
    n2=(int)(Math.random()*11);
    producto=n1*n2;
    
    do{
        System.out.print("Adivine la multiplicación de "+ n1 +" x "+ n2+" ");
        n=leer.nextInt();
        if(n==producto){
            System.out.println("La multiplicación de "+n1+" x "+n2+" = "+producto);
            break;
        } else{
            System.out.println("El resultado es incorrecto. Intente nuevamente...");
        }
    }while(true);
    
    }
}
