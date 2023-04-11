/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.matematica;

/**
 *
 * @author DELL
 */
public class matematicaServicio {
    
    public matematica asgValor(){
        
        matematica aa= new matematica();
      
        aa.setA((int)(Math.random()*10+1));
        aa.setB((int)(Math.random()*10+1));
        return aa;
    }
    
    public int devolverMayor(matematica a){
        
        int mayor=0;
        
        if(a.getA()>a.getB()){
            mayor=a.getA();
        } else if(a.getB()>a.getA()){
            mayor = a.getB();
        }
        return mayor;
    }
    
    public long calcularPotencia(matematica a) {
        
        int mayor=0;
        int menor=0;
        
        if(a.getA()>a.getB()){
            mayor=a.getA();
        } else if(a.getB()>a.getA()){
            mayor = a.getB();
        }
        
        if(a.getA()<a.getB()){
            menor=a.getA();
        } else if(a.getB()<a.getA()){
            menor = a.getB();
        }
        
        if( a.getA()==a.getB()){
            System.out.println(" los numeros son iguales, no ahy mayor ni menor ");
        }
        System.out.println("Mayor: "+mayor +" menor: "+menor);

        long pot = (int) Math.pow(mayor, menor);
        int aaa= (int) Math.pow(5, 2);
        System.out.println("valor prueba "+aaa);
        return pot;
    }
    
    public double calculaRaiz(matematica a){
        
        double menor;
        
        menor = Math.min(a.getA(), a.getB());
        
        double raiz = Math.sqrt(Math.abs(menor));
        
        return raiz;
    }
    
}
