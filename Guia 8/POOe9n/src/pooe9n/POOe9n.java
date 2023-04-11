/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe9n;

import entidades.matematica;
import servicios.matematicaServicio;

/**
 *
 * @author DELL
 */
public class POOe9n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        matematicaServicio mss = new matematicaServicio();
        matematica m1 = mss.asgValor();
        System.out.println("valores: "+m1);
        int may = mss.devolverMayor(m1);
        System.out.println("mayor: "+may);
        double potenc = mss.calcularPotencia(m1);
        System.out.println("potencia: "+ potenc);
        double raiz = mss.calculaRaiz(m1);
        System.out.println("La raiz cuadrada de: "+ Math.min(m1.getA(), m1.getB()) +" es:"+raiz);
    }
    
}
