/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author DELL
 */
public class Libro {
    
    private String libroTitulo;
    private int numeroHojas;
    private String colorLibro;

    public Libro() {
    }

    public Libro(String libroTitulo, int numeroHojas, String colorLibro) {
        this.libroTitulo = libroTitulo;
        this.numeroHojas = numeroHojas;
        this.colorLibro = colorLibro;
    }

    public String getLibroTitulo() {
        return libroTitulo;
    }

    public void setLibroTitulo(String libroTitulo) {
        this.libroTitulo = libroTitulo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public String getColorLibro() {
        return colorLibro;
    }

    public void setColorLibro(String colorLibro) {
        this.colorLibro = colorLibro;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + libroTitulo + ", numero de Hojas=" + numeroHojas + ", color de la pasta=" + colorLibro + '}';
    }
    
}
