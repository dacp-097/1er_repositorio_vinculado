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
public class Persona {
    public String nombre;
    public int edad;
 
    public Persona(String nombre, int edad, boolean genero) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

   
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


   
    
    
}
