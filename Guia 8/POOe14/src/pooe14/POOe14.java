/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe14;

import Entidades.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author DELL
 */
public class POOe14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MovilServicio ms = new MovilServicio();
        
       Movil mo1 = ms.cargarCelular();
        System.out.println("Informacion final "+mo1);


    }
    
}
