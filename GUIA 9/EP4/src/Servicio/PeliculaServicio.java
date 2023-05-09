/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import ep4.Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList <Pelicula >llamarCreacion(){
        
        ArrayList <Pelicula> listaPeliculas = new ArrayList();
        String respuesta="";
        
        
        do {
           Pelicula p = ingresarDatosPelicula ();
           aumentarLista( listaPeliculas, p);
            do {
           System.out.println("Desea agregar otra pelicula?, si/no ");
            respuesta = leer.next();
            
            if(!(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("no"))){
                System.out.println("respuesta no valida, vuelva a intentar...");
            }
            
        } while(!(respuesta.equalsIgnoreCase("si")||respuesta.equalsIgnoreCase("no"))) ;
        } while ( respuesta.equalsIgnoreCase("si"));
        
        return listaPeliculas;
    }
    
    public Pelicula ingresarDatosPelicula (){
        
        Pelicula peliculaL = new Pelicula();
        
        System.out.println("Titulo de la pelicula: ");
        peliculaL.setTitulo(leer.next());
        System.out.println("Director de la pelicula: ");
        peliculaL.setDirector(leer.next());
        System.out.println("Duracion de la pelicula en horas ");
        peliculaL.setDuracionPelicula_h(leer.nextInt());
        
        return peliculaL;
    }
    
    //agregar al arraylist cada pelicula
    public void aumentarLista( ArrayList <Pelicula> listaPeliculas, Pelicula p){
        listaPeliculas.add(p);
    }
    
    public void mostrarListaBasica(ArrayList <Pelicula> listaPeliculas){
        
        System.out.println("Lista de peliculas ingresadas");
        Iterator it = listaPeliculas.iterator();
        while (it.hasNext()){
                   System.out.print(it.next()+" ");
        }
        System.out.println("");
    }
    
    public void mostrarDuracion1(ArrayList <Pelicula> listaPeliculas){
    
        System.out.println("-----Peliculas con duracion mayor a una hora-----");
        
    for (Pelicula peliAux :listaPeliculas ){
        if (peliAux.getDuracionPelicula_h() >= 1){
            System.out.println(peliAux);
        }
    }
}
    
    public void mostrarDuracionDesc(ArrayList <Pelicula> listaPeliculas){
    
        System.out.println("-----Peliculas ordenadas con duracion de mayor a menor-----");
        listaPeliculas.sort(Comparadores.duracionDesc);
        
        for (Pelicula peliAux :listaPeliculas ){
            System.out.println(peliAux);
    }
    
}
    
     public void mostrarDuracionAsc(ArrayList <Pelicula> listaPeliculas){
    
        System.out.println("-----Peliculas ordenadas con duracion de menor a mayor-----");
        listaPeliculas.sort(Comparadores.duracionAsc);
        
        for (Pelicula peliAux :listaPeliculas ){
            System.out.println(peliAux);
    }
    
}
     public void mostrarTituloAlf(ArrayList <Pelicula> listaPeliculas){
    
        System.out.println("-----Peliculas ordenadas por titulo alfabeticamente-----");
        listaPeliculas.sort(Comparadores.tituloAlf);
        
        for (Pelicula peliAux :listaPeliculas ){
            System.out.println(peliAux);
    }
    
}
      public void mostrarDirectoroAlf(ArrayList <Pelicula> listaPeliculas){
    
        System.out.println("-----Peliculas ordenadas por director alfabeticamente-----");
        listaPeliculas.sort(Comparadores.directorAlf);
        
        for (Pelicula peliAux :listaPeliculas ){
            System.out.println(peliAux);
    }
    
} 
     
}
