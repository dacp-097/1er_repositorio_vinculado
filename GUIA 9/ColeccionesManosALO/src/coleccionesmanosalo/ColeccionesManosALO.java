/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesmanosalo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class ColeccionesManosALO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
    ArrayList <Integer> listado = new ArrayList();
    TreeSet<String> arbol = new TreeSet();
    HashMap<Integer,String> personas = new HashMap();
    */
        
        ArrayList<Integer> numerosA = new ArrayList();
        numerosA.add(5);
        numerosA.add(80);
        numerosA.add(2);
         int x =6;
        numerosA.add(x);
        numerosA.add(12);
        
        System.out.print("Valores de arraylist: "+numerosA);
        
        System.out.println("");
        
        HashSet <Integer> numerosB = new HashSet();
        int y = 2;
        numerosB.add(y*6);
        numerosB.add(y*2);
        numerosB.add(1);
        numerosB.add(y*3);
        numerosB.add(y*1);
        
        System.out.println("Valores conjunto HashSet: "+numerosB);
        
        HashMap <Integer, String> letrasC = new HashMap();
        
        int yy = 0;
        String v = "a";
        letrasC.put(yy, v);
        
        int yy1 = yy+1;
        String v1 = "b";
        letrasC.put(yy1, v1);
        
        int yy2 = yy1+1;
        String v2 = "c";
        letrasC.put(yy2, v2);
        
        int yy3 = yy2+1;
        String v3 = "d";
        letrasC.put(yy3, v3);
        
        int yy4 = yy3+1;
        String v4 = "e";
        letrasC.put(yy4, v4);
        
        int yy5 = yy4+1;
        String v5 = "f";
        letrasC.put(yy5, v5);
        
        System.out.println("Valores colecciones HashMap: "+ letrasC);
        
        System.out.println("Eliminacion: ");
        System.out.println("Lista");
        numerosA.remove(1);
        System.out.println("final A: "+numerosA);
        
        System.out.println("Conjunto: ");
        numerosB.remove(y);
        System.out.println("final B: "+numerosB);
        
        
        System.out.println("Mapas: ");
        letrasC.remove(yy4);
        System.out.println("final c: "+letrasC);
        
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        
        int xy = 1;
        int xx = 2;
        personas.put(xy, n1);
        personas.put(xx, n2);
        
        ArrayList<String> bebidas = new ArrayList();
bebidas.add("café");
bebidas.add("té");
Iterator<String> it =bebidas.iterator();
while (it.hasNext()){
    
if (it.next().equals("café")){
    it.remove();
}
   
    }
    }
}
    
