/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe3;

import Servicio.service;
import entidad.Operacion;

/**
 *
 * @author DELL
 */
public class POOe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        service sOp = new service();
        Operacion operacion1 = sOp.crearOperacion();
        sOp.sumar(operacion1);
        sOp.restar(operacion1);
        sOp.multiplicar(operacion1);
        sOp.dividir(operacion1);
        
        
    }
    
}
