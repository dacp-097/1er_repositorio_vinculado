/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class libroServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Libro crearLibro(){
        
        Libro libroLleno = new Libro();
        
        System.out.println("Ingrese el titulo del libro: ");
        libroLleno.setLibroTitulo(leer.next());
        
        System.out.println("Ingrese numero de hojas: ");
        libroLleno.setNumeroHojas(leer.nextInt());
        
        System.out.println("Ingrese color de la portada ");
        libroLleno.setColorLibro(leer.next());
        
        return libroLleno;
    }
    
}
