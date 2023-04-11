/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeex3;

import Entidad.Ecuacion;
import Servicios.EcuacionServicio;

/**
 *
 * @author DELL
 */
public class POOeex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EcuacionServicio es = new EcuacionServicio();
        Ecuacion ec1 = es.crearEcuacion();
        System.out.println("Valores ecuacion: "+ec1);
        
        if(ec1.getDiscriminante()>0){
            System.out.println("La ecuacion tiene 2 soluciones");
        } else if(ec1.getDiscriminante()==0){
            System.out.println("Esta ecuacion tiene una solucion ");
        } else if (ec1.getDiscriminante()<0){
            System.out.println("Esta ecuacion no tiene soluciones reales");
        }
        
        double dd = es.getDiscriminante(ec1);
        System.out.println("Discriminante metodo: "+dd);
        
        System.out.println("SOLUCION... ");
        es.calcular(ec1);

    }
    
}
