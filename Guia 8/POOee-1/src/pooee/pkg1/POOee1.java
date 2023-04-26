/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooee.pkg1;

import Entidad.Fraccion;
import Servicio.FraccionServicio;

/**
 *
 * @author DELL
 */
public class POOee1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FraccionServicio fs = new FraccionServicio();
        
        Fraccion f1 = fs.crearFraciones();
        fs.Menu(f1);


    }
    
}
