/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Persona {
    
    private String nombre;
    private Date fechaN;
    private double edad;

    public Persona() {
    }

    public Persona(String nombre, Date fechaN, double edad) {
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaN=" + fechaN + ", edad=" +String.format("%.2f", edad) + '}';
    }

        
        
}
