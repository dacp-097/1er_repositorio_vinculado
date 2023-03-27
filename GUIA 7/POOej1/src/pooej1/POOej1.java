/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author DELL
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Persona primeraPersona = new Persona();
       
       Persona segundaPersona = new Persona("Mariano");
       
       primeraPersona.setNombre("Lucio"); 
       
       segundaPersona.getNombre();
       
       PersonaService persServicio = new PersonaService();
       
       Persona terceraPersona = persServicio.crearPersona();
       
        System.out.println("El nombre de la persona es " + terceraPersona.getNombre());

        
    }
}
    

