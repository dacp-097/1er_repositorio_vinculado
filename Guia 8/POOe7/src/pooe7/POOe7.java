/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe7;

import entidad.Persona;
import java.util.Scanner;
import servicios.serviciosPersona;

/**
 *
 * @author DELL
 */
public class POOe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        serviciosPersona sp = new serviciosPersona();
        
        System.out.println("Ingresar el numero de personas a generar: ");
        int num = leer.nextInt();
        Persona[] p = new Persona[num];
        int[] aa = new int[num];
        boolean[] bb = new boolean[num];
        double ca=0;
       double cb=0;
        double cc=0;
        int ceme=0;
        int cnme=0;
        
        for (int i = 0; i < num; i++) {
            
        p[i]= sp.crearPersona(i);
        aa[i]= sp.calcularIMC(p[i]);
            System.out.println("valor aa IMC en vector "+aa[i]);
        bb[i] = sp.esMayorDeEdad(p[i]);
        
        }

        for (int i = 0; i < num; i++) {

            if (aa[i] == -1) {
                ca = ca + 1;
            }
            if (aa[i] == 0) {
                cb = cb + 1;
            }
            if (aa[i] == 1) {
                cc = cc + 1;
            }
            
            if (bb[i]==true ){
                ceme=ceme+1;
            }
            
            if (bb[i]==false ){
                cnme=cnme+1;
            }
        }
        System.out.println("Los resultados del IMC son: "
                  + "\n Debajo del peso ideal: "+(ca / num)*100 +"% "
                  + "\n En peso ideal: " +(cb / num)*100+"% "
                  + "\n con sobrepeso: " +(cc / num)*100+"% ");
        
        System.out.println("Respecto de mayores de edad: "
                  + "\n mayores de edad: "+ ceme
                  + "\n menores de edad: "+ cnme);
    }
    
}
