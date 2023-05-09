/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep4.Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class Comparadores {
    
    public static Comparator<Pelicula> duracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Integer.compare(t1.getDuracionPelicula_h(), t.getDuracionPelicula_h());
        }
    };
    
    public static Comparator<Pelicula> duracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Integer.compare(t.getDuracionPelicula_h(), t1.getDuracionPelicula_h());
        }
    };
    
    public static Comparator<Pelicula> tituloAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> directorAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
