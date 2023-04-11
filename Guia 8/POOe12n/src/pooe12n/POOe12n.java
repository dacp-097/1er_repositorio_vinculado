/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe12n;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POOe12n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PersonaServicio ps = new PersonaServicio();
        
        Persona p1 = ps.crearPersona();
        System.out.println("valores persona1: "+p1);
        
        System.out.println("Ingrese edad de otra persona: ");
        int edadSegundaPersona= leer.nextInt();
        boolean valido=ps.menorQue(p1, edadSegundaPersona);
        System.out.println(p1.getNombre()+" es menor que la segunda edad: "+valido);
        ps.mostrarPersona(p1);
        

    }
    
}
