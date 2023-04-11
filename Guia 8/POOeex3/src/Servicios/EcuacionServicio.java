/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Ecuacion;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EcuacionServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Ecuacion crearEcuacion(){
        
        Ecuacion ecuacionL = new Ecuacion();
        System.out.println("Ingrese la informacion de la ecuacion");
        System.out.println("valor de a: ");
        ecuacionL.setA(leer.nextInt());
        System.out.println("valor de b: ");
        ecuacionL.setB(leer.nextInt());
        System.out.println("valor de c: ");
        ecuacionL.setC(leer.nextInt());
        double d = calculoD(ecuacionL.getA(),ecuacionL.getB(),ecuacionL.getC());
        ecuacionL.setDiscriminante(d);
        
        return ecuacionL;
    }
    
    public double calculoD(int a, int b, int c){
        
        double discriminante = (Math.pow(b, 2)-4*a*c);
                  
        return discriminante;
    }
    
    public double getDiscriminante(Ecuacion a){
        
        double discriminante = Math.pow(a.getB(), 2)-4*a.getA()*a.getC();
        return discriminante;
    }
    
    public boolean tieneRaices(double d){
        
        boolean raices = false;
                  
                  if (d>=0 ){
                      raices = true;
                  }
                  
        return raices;        
    }
    
   public boolean tieneRaiz(double d){
        
        boolean raiz = false;
                  
                  if (d==0 ){
                      raiz = true;
                  }
                  
        return raiz;        
    }
    
   public void obtenerRaices(Ecuacion a){
       
       double x1 = (-a.getB()+ Math.sqrt(Math.pow(a.getB(), 2)-(4*a.getA()*a.getC())))/(2*a.getA());
       double x2 = (-a.getB()- Math.sqrt(Math.pow(a.getB(), 2)-(4*a.getA()*a.getC())))/(2*a.getA());
       
       System.out.println("Soluciones raices, x1: "+x1+" x2: "+x2);          
   }
   
   public void obtenerRaiz(Ecuacion a){
       
       double x = (-a.getB()+ Math.sqrt(Math.pow(a.getB(), 2)-(4*a.getA()*a.getC())))/(2*a.getA());
       
       System.out.println("Solucion raiz x: "+x);          
   }
   
   
   
   public void calcular(Ecuacion aa){
       
       boolean validaRaices = tieneRaices(aa.getDiscriminante());
       System.out.println("Tiene raices: "+validaRaices );
        boolean validaRaiz = tieneRaiz(aa.getDiscriminante());
       System.out.println("Tiene una raiz: "+validaRaiz );
       
          if(validaRaices==true){
              obtenerRaices(aa);
          }
          
          if (validaRaiz==true){
              obtenerRaiz(aa);
          }
       
   }
   
   
}
