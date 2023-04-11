/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.cafetera;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class servicioCafetera {
    
    Scanner leer = new Scanner(System.in);
    
     public cafetera crearCafetera(){
        cafetera ca = new cafetera();
        System.out.println("Ingrese cantidad actual");
        ca.setqActual(leer.nextInt());
        System.out.println("Ingrese capacidad maxima");
        ca.setqMax(leer.nextInt());
       return ca;
    }
    
    public void llenarCafetera(cafetera a){
        a.setqActual(a.getqMax());
        System.out.println("Cantidad actual:"+ a.getqActual());
        }
    
    public void servirTaza(cafetera a){
        
        System.out.println("Ingrese la capacidad de la taza en ml ");
        int qTaza = leer.nextInt();
        if(qTaza>a.getqActual()){
            System.out.println("No se pudo llenar la taza"
                      + "\n falto por llenar: "+ (qTaza -a.getqActual()));
                      vaciarCafetera(a);//a.setqActual(0);
        } else {
            System.out.println("Se lleno exitosamente la taza");
            a.setqActual(a.getqActual()-qTaza);
        }
        
       }
    
    public void vaciarCafetera(cafetera b){
        b.setqActual(0);
        System.out.println("q actual despues de taza incompleta: "+ b.getqActual());
    }
    
    public cafetera agregarCafe(cafetera a){
        System.out.println(" ingrese cantidad de cafe a rellenar: ");
        int nuevoCafe=leer.nextInt();
        if(nuevoCafe+a.getqActual()<=a.getqMax()){
            System.out.println("Se agrego exitosamente el nuevo cafe");
            a.setqActual(nuevoCafe+a.getqActual());
        } else {
            System.out.println("La cantidad a rellenar sobrepasa la capacidad de la cafetera...");
            int s = a.getqMax()-a.getqActual();
            System.out.println("Se agrego solamente: " +s);
            a.setqActual(s+a.getqActual());
        }
        System.out.println("cafe actual despues de agregar cafe: "+ a.getqActual());
        return a;
    }
    
}
