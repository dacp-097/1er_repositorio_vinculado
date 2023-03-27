/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe1;

import entidad.Libro;
import service.libroService;

/**
 *
 * @author DELL
 */
public class POOe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        libroService sl = new libroService();
        
        Libro primerLibro = sl.crearLibro();
        
        sl.mostrarLibro(primerLibro);
        
    }
    
}
