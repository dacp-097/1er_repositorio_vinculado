/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class libroService {
    
    public Libro crearLibro(){
        
        Scanner leer = new Scanner(System.in);
        
        Libro liComplet = new Libro();
        
        System.out.println("Ingrese el ISBN del libro: ");
        liComplet.setIsbn(leer.nextInt());
        
        System.out.println("Ingrese el titulo: ");
        liComplet.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor: ");
        liComplet.setAutor(leer.next());
        
        System.out.println("Ingrese el numero de paginas: ");
        liComplet.setNumeroPaginas(leer.nextInt());
        
        return liComplet;
    }
    
    public void mostrarLibro(Libro aMostrar){
        
        System.out.println("La informacion del libro es "+
                  "\n ISBN: " + aMostrar.getIsbn()+
                  "\n Titulo: " + aMostrar.getTitulo()+
                  "\n Autor: "+ aMostrar.getAutor()+
                  "\n Numero de paginas: "+ aMostrar.getNumeroPaginas());
        
            }
}
