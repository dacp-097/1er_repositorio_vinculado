/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.rectangulo;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class servicioRectangulo {
    Scanner leer = new Scanner(System.in);
   public rectangulo crearRectangulo(){
        rectangulo rectA = new rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        rectA.setBase(leer.nextInt());
         System.out.println("Ingrese la altura del rectangulo");
        rectA.setAltura(leer.nextInt());
        
        return rectA;
   }
    
    public void calcularSuperficie(rectangulo a){
        int superficie = a.getBase()*a.getAltura();
        System.out.println("La superficie del rectangulo es: "+superficie);
        
    }
    
    public void calcularPerimetro(rectangulo a){
        int perimetro = (a.getBase()+a.getAltura())*2;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        
    }
    
    public void dibujarPerimetro(rectangulo a){
        System.out.println("ReCTANGULO: ");
        for (int i = 0; i < a.getAltura(); i++) {
            
            for (int j = 0; j < a.getBase(); j++) {
                if( i==0 || j==0 || j==(a.getBase()-1)||i==(a.getAltura()-1)){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
    }
}
