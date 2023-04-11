/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeex2;

import Entidad.Puntos;
import Servicios.PuntosServicio;

/**
 *
 * @author DELL
 */
public class POOeex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntosServicio ps= new PuntosServicio();
        System.out.println("Bienvenido al calculo de Distancia por coordenadas");
        Puntos p1 = ps.crearPuntos();
        System.out.println("Valores ingresados: "+p1);
        double dist = ps.distnaciaP(p1);
        System.out.println("La distancia existente entre coordenadas es: "+String.format("%.2f", dist));
        
    }

    
}
