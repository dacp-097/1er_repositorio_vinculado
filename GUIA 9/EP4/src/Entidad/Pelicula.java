/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracionPelicula_h;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracionPelicula_h) {
        this.titulo = titulo;
        this.director = director;
        this.duracionPelicula_h = duracionPelicula_h;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracionPelicula_h() {
        return duracionPelicula_h;
    }

    public void setDuracionPelicula_h(int duracionPelicula_h) {
        this.duracionPelicula_h = duracionPelicula_h;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionPelicula_h=" + duracionPelicula_h + '}';
    }
    
  }
