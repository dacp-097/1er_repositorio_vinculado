/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mao2;

import Entidad.Libro;
import Servicio.libroServicio;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class MAO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        libroServicio ls = new libroServicio();
        
        ArrayList <Libro> listaLibros = new ArrayList();
        
        for (int i = 0; i < 3; i++) {
            Libro libroAux =ls.crearLibro();
            listaLibros.add(libroAux);
        }
        
        
        listaLibros.forEach((ejemp) -> {
            System.out.println(ejemp);
        });

    }
    
}
