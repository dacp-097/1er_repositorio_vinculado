/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe2;

import Entidad.Circunferencia;
import Servicios.serviciosCircunfer;

/**
 *
 * @author DELL
 */
public class POOe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        serviciosCircunfer sc = new serviciosCircunfer();
        
        Circunferencia nuevCirculo = sc.crearCircunferencia();
        
        sc.calcularArea(nuevCirculo.getRadio());
        sc.calcularPerimetro(nuevCirculo.getRadio());
    }
    
}
