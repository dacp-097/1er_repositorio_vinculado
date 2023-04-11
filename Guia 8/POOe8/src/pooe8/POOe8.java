/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe8;

import Servicio.CadenaServicio;
import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POOe8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadenaServicio cs = new CadenaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cadena A = cs.crearCadena();
        System.out.println("El numero de vocales es: "+cs.contarVocales(A));
        System.out.println("La frase invertida es: "+ cs.invertirFrase(A));
        System.out.println("Que caracter desea conocer si se repite: ");
        String caracter = leer.next();
        System.out.println("el caracter "+caracter+" se repite "+cs.vecesRepetido(A, caracter)+ " vez / veces");
        String nCad =cs.compararLongitud(A);
        String frasesU = cs.unirFrases(A,nCad);
        System.out.println("Cadenas unidas: "+frasesU);
        String aa=cs.reemplazar(frasesU);
        System.out.println("La frase reemplaza la letra a por @: "+aa);
        System.out.println("Ingrese una letra pasa saber si la contiene ");
        String letra =leer.next();
        System.out.println(""+cs.contiene(A, aa, letra));
    }   
    
       
}
