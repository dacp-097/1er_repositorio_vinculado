/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class PaisServicio {
    
    Scanner leer = new Scanner(System.in);
    
    
    public HashSet<String> llenarPises(){
        
        HashSet<String> nombresPaises = new HashSet();
        String resp ="";
        String resp2 ="";
        String pais="";
        boolean confirmacion = true;
        
        do {
            System.out.println("Ingrese el nombre de un pais:");
            pais = leer.next();
            nombresPaises.add(pais);
            
            do {
                System.out.println("Desea agregar otro pais? si/no");
                resp=leer.next();
                
                if(!(resp.equalsIgnoreCase("si")||resp.equalsIgnoreCase("no"))){
                    System.out.println("Respuesta incorrecta vuelva a intentar...");
                }
                
            } while (!(resp.equalsIgnoreCase("si")||resp.equalsIgnoreCase("no")));
            
            if(resp.equalsIgnoreCase("no")){
                System.out.println("Esta seguro de que desea salir?? si/no");
                resp2 = leer.next();
                if(resp2.equalsIgnoreCase("si")){
                    confirmacion= false;
                } 
            }
            
        } while (resp.equalsIgnoreCase("si")&&confirmacion==true);

       return  nombresPaises;
    }
    
    public void mostrarPaises(HashSet<String> paises){
        System.out.println("-----Paises en el HashSet-----");
        for(String aux :paises){
            System.out.print("["+aux+"], ");
        }
        System.out.println("");
    }
    
    public TreeSet<String> ordenarAlf(HashSet<String> paises){
        
        TreeSet<String> paisesSet = new TreeSet(paises);
        
        return paisesSet;
    }
    
    public void ordenarAlfArray(HashSet<String> paises){
        
        ArrayList<String> paisesSet = new ArrayList(paises);
        Collections.sort(paisesSet);
        
        System.out.println("-----Pises ordenados Alfabeticamente en ArrayList-----");
        for(String aux : paisesSet){
            System.out.print("["+aux+"], ");
        }
        System.out.println("");
    }
    
    public void mostrarPaisesTree(TreeSet<String> paises){
        
        System.out.println("-----Impresion TreeSet-----");
        for(String aux :paises){
            System.out.print("["+aux+"], ");
        }
        System.out.println("");
    }
    
    public TreeSet<String> eliminacionPais(TreeSet<String> paises){

        System.out.println("Ingrese el pais a eliminar");
        String paisE =leer.next();
        boolean conf = false;
        
        Iterator<String> it = paises.iterator();
        
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase(paisE)){
                it.remove();
                System.out.println("El pais ingresado fue eliminado");
                conf = true;
            }
        }
        if(conf==false){
            System.out.println("El pais ingresado no se encontraba en la lista");
        }
        
        return paises;
    }
}
