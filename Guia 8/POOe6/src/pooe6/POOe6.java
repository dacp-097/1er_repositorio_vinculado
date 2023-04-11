/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe6;

import entidad.cafetera;
import servicios.servicioCafetera;

/**
 *
 * @author DELL
 */
public class POOe6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

servicioCafetera sc= new servicioCafetera();
cafetera cafetera1= sc.crearCafetera();
sc.llenarCafetera(cafetera1);
sc.servirTaza(cafetera1);
sc.agregarCafe(cafetera1);
    }
    
}
