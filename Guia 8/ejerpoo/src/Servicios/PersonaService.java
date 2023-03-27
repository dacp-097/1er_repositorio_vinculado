/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
       
        Persona personaCompleta = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        
        personaCompleta.setNombre(leer.next());
        
        return personaCompleta;
    }
    
    public void mostrarNombre(Persona a){

        System.out.println("el atributo es: " + a.getNombre());
        
    }

}
