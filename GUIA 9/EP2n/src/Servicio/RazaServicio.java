/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RazaServicio {
    
    Scanner leer = new Scanner(System.in);
    boolean b = false;
    
    public void eliminarRaza(ArrayList<String> razas){ 
        
 
    System.out.println("Ingrese una raza a consultar en la lista: ");
        String razaC = leer.next();

        Iterator<String> it = razas.iterator();

        while (it.hasNext()) {
            if (it.next().equals(razaC)) {
                it.remove();
                b = true;
            }
        }

        if (b == true) {
            System.out.println("La raza escrita estaba en la lista y fue eliminada");
        } else {
            System.out.println("Esa raza no esta en la lista");
        }
       }
    
}
