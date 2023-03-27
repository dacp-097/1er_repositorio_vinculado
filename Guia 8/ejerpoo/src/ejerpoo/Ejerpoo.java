/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo;

import Entidad.Persona;
import Servicios.PersonaService;

/**
 *
 * @author DELL
 */
public class Ejerpoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona primeraPersona = new Persona();
        
        Persona segundaPersona = new Persona("Mariano ");
        
        primeraPersona.setNombre("Lucio");
        
        segundaPersona.getNombre();
        
        PersonaService persService = new PersonaService();
        
        Persona terceraPersona = persService.crearPersona();
        
       persService.mostrarNombre(terceraPersona);
        
      }
    
}
