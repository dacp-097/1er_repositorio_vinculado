/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class service {
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
       Operacion oper1 = new Operacion();
        System.out.println("ingrese dos numeros para operaciones: ");
        System.out.println("Ingrese numero 1");
        oper1.setNumero1(leer.nextInt());
        System.out.println("Ingrese numero 2");
        oper1.setNumero2(leer.nextInt());
        
        return oper1;
    }
    
    public int sumar(Operacion a){
        
        int suma= a.getNumero1()+a.getNumero2();
        System.out.println("la suma de los numeros es: "+suma);
        return suma;
    }
    
    public int restar(Operacion b){
        
        int resta= b.getNumero1()-b.getNumero2();
        System.out.println("la resta de los numeros es: "+resta);
        return resta;
    }
    
    public void multiplicar(Operacion c){
        
        if ( c.getNumero1()==0 || c.getNumero2()==0){
            System.out.println("uno de los numeros es 0, el resultado en multiplicacion sera 0 : ");
        } else {
            int producto= c.getNumero1()*c.getNumero2();
        System.out.println("la multiplicacion de los numeros es: "+producto);
        }
       
    }
    
    public void dividir(Operacion c){
        
        if ( c.getNumero2()==0){
            System.out.println("el segundo numero es 0, el resultado de la division sera erroneo ");
        } else {
            int division= c.getNumero1()/c.getNumero2();
        System.out.println("la division de los numeros es: "+division);
        }
       
    }
    
}
