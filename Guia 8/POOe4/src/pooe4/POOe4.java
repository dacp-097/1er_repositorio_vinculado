/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe4;

import entidad.rectangulo;
import servicios.servicioRectangulo;

/**
 *
 * @author DELL
 */
public class POOe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        servicioRectangulo sr = new servicioRectangulo();
        rectangulo rect1 = sr.crearRectangulo();
        sr.calcularSuperficie(rect1);
        sr.calcularPerimetro(rect1);
        sr.dibujarPerimetro(rect1);
        
    }
    
}
