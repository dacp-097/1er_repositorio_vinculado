/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos() {
        
        Puntos puntoLleno = new Puntos();
        System.out.println("Ingrese la informacion de la primera coordenada");
        System.out.println("Valor x1:");
        puntoLleno.setX1(leer.nextInt());
        System.out.println("Valor y1:");
        puntoLleno.setY1(leer.nextInt());
        System.out.println("Valor x2:");
        puntoLleno.setX2(leer.nextInt());
        System.out.println("Valor y2:");
        puntoLleno.setY2(leer.nextInt());
      
       return puntoLleno; 
    }
    
    public double distnaciaP(Puntos a){
        
        double distancia = Math.sqrt(Math.pow((a.getX2()-a.getX1()), 2)+(Math.pow(a.getY2()-a.getY1(), 2)));
        
        return distancia;
    }
}
