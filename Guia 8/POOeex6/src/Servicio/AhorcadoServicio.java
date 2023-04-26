/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author DELLagua
 */
public class AhorcadoServicio {
    
    Scanner leer = new Scanner(System.in);
    

    public Ahorcado crearJuego(){
        
        Ahorcado ah = new Ahorcado();
               System.out.println("Palabra a ser adivinada: ");
        String palabra = leer.next();
        int n = palabra.length();
        ah.setN(n);
        String [] respAux = new String[n];
        ah.setLetras(cargarLetras(palabra,n));
                
        for (int i = 0; i < ah.getN(); i++) {
            
            respAux[i]="_";
        }
        ah.setRespuesta(respAux);
        
        System.out.println("Cantidad de jugadas maxima? ");
        ah.setIntentosMaximos(leer.nextInt());
        
        ah.setCantLetrasEnc(0);

        return ah;
    }
    
    public String[] cargarLetras(String palab,int n){
        
        String[] letra = new String[n];
        
        for (int i = 0; i < n; i++) {
            letra[i]=palab.substring(i, i+1);
        }
        
        return letra;
    }
    
    public int longitud(Ahorcado a){
        int n = a.getLetras().length;
        return n;
    }
    
    public String[] buscar(Ahorcado a, String letra, String[] respAux){
 
            String mostrar[]= respAux;

            boolean validarLetra = false;

         for (int i = 0; i < a.getN(); i++) {

                if(letra.equals(Array.get(a.getLetras(), i))){
                    mostrar[i]=letra;
                    Array.set(respAux, i, letra);

                }else if (!(mostrar[i].equals("_"))) {
                    
                    mostrar[i]=respAux[i];
                } 
        }
            
            for (int i = 0; i < a.getN(); i++) {
            
                if(letra.equals(Array.get(a.getLetras(), i))){
                   validarLetra = true;
                   break;
                }
        }
            
            if(validarLetra==true){
                System.out.println("La letra esta contenida en la palabra");
            } else {
                System.out.println("La letra no esta contenida en la palabra");
            }
 
            return mostrar;
    }
    
public int encontradas(Ahorcado a, String letra){
    
    int cle=0;
    for (int i = 0; i < a.getN(); i++) {

                if(letra.equals(Array.get(a.getLetras(), i))){
                  cle+=1;
                }
        }
    return cle;
}
      
public int intentos(int a){
    int nIntentos =a;
    nIntentos = nIntentos+1;
    return nIntentos;
}
    
}
