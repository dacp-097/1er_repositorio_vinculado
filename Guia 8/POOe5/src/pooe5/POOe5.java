/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe5;

import entidad.cuenta;
import servicios.cuentaServicios;

/**
 *
 * @author DELL
 */
public class POOe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

cuentaServicios cs = new cuentaServicios();
cuenta cu1 = cs.crearCuenta();
cs.ingresarDinero(cu1);
cs.retirarDinero(cu1);
cs.extraccionRapida(cu1);
cs.consultarSaldo(cu1);
cs.consultarDatos(cu1);

    }
    
}
