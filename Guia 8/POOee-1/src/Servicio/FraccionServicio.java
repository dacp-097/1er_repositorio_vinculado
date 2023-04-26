/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class FraccionServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Fraccion crearFraciones(){
        
        Fraccion fr = new Fraccion();
        
        System.out.println("Ingrese el numerador de la primera fraccion: ");
        fr.setNumerador1(leer.nextInt());
        System.out.println("Ingrese el denominador de la primera fraccion: ");
        fr.setDenominador1(leer.nextInt());
        System.out.println("Ingrese el numerador de la segunda fraccion: ");
        fr.setNumerador2(leer.nextInt());
        System.out.println("Ingrese el denominador de la segunda fraccion: ");
        fr.setDenominador2(leer.nextInt());
         
       return fr; 
    }
    
    public void Menu(Fraccion a){
        System.out.println("MENU DE OPERACIONES:"
                  + "1.SUMAR"
                  + "2.RESTAR"
                  + "3.MULTIPLICAR"
                  + "4.DIVIDIR");
        
        System.out.println("Que desea hacer? ");
        int num = leer.nextInt();
       
        
        
        switch(num){
           
            case 1: System.out.println("Resultado suma: ");
           suma( a);
            
        }
    }
    
    public void suma(Fraccion a){
        
         int nResulSuma;
         
         if(a.getDenominador1()==a.getDenominador2()){
             System.out.println((a.getNumerador1()+a.getNumerador2())+"/"+a.getDenominador1());
         } else 
    }
}
