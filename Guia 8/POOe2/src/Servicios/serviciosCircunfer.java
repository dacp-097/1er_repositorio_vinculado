/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class serviciosCircunfer {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia circ = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia ");
        circ.setRadio(leer.nextDouble());
        return circ;

    }
    
      public void calcularArea (double a){
            
          double area;
          area=(Math.PI)*(Math.pow(a,2));
          System.out.println("El area del radio ingresado es: " + area);
   
        }
    
    public void calcularPerimetro (double a){
            
        double perimetro;
        perimetro=2*Math.PI*a;
        System.out.println("El perimetro del radio ingresado es: "+perimetro);                  
        }
}
