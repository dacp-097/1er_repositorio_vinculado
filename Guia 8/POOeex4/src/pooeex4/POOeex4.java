/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeex4;

import Entidad.NIF;
import Servicio.NifServicio;

/**
 *
 * @author DELL
 */
public class POOeex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NifServicio ns = new NifServicio();
        NIF nif1 = ns.crearNif();
        ns.mostrar(nif1);


    }
    
}
