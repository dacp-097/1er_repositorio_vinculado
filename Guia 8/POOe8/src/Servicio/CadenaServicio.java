/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cadena crearCadena(){
    Cadena fra = new Cadena();
    
     System.out.println("Ingrese una frase: ");
        fra.setFrase(leer.nextLine());
        fra.setLongitudFrase(fra.getFrase().length());
        return fra;
    }
    
    public int contarVocales(Cadena a){
  
        String letra;
        int cVocales=0;
        for (int i = 0; i <a.getLongitudFrase(); i++) {
            
            
            letra=(a.getFrase().substring(i, i+1));
            if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){
                cVocales = cVocales+1;
            }
        }
        
        return cVocales;
    }
    
  public String  invertirFrase(Cadena a){
      
      String letra="";
      String fraseInv="";
      for (int i = a.getLongitudFrase(); i >0; i--) {
          
          letra=(a.getFrase().substring(i-1, i));
         
          fraseInv+=a.getFrase().substring(i-1, i);
          
      }
      return fraseInv;
  }
  
  public int vecesRepetido(Cadena a, String caracter){
      String letra;
        int c=0;
        for (int i = 0; i < a.getFrase().length(); i++) {
            
            letra=a.getFrase().substring(i, i+1);
            if (letra.equalsIgnoreCase(caracter)){
                c+=1;
            }
        }
        return c;
  }
  public String  compararLongitud(Cadena a){
      
      String nCad;
      System.out.println("Ingrese una nueva frase: ");
      nCad=leer.nextLine();
      
      if(a.getLongitudFrase()==nCad.length()){
          System.out.println("La longitud de ambas frases es igual ");
          
      }else{
          System.out.println("La longitud de esta frase es diferente ");
      }
      return nCad;
  }
        
      public String unirFrases(Cadena a,String b){
          
          String frasesU;
          frasesU =a.getFrase().concat(b);
          
          return frasesU;
      }
      
public String reemplazar(String ab) {
    
   String aa = ab.replace("a", "@");
   
    return aa;
} 

public boolean contiene(Cadena a,String aa,String letra){
    boolean validar = false;
    String caracter;
    for (int i = 0; i < aa.length(); i++) {
        caracter = aa.substring(i, i+1);
        if (caracter.equalsIgnoreCase(letra)){
            validar=true;            
        }
    }
    return validar;
}
    
}
