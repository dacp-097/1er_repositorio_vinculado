/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EA17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad n de enteros ");
        int n = leer.nextInt();
                
        int[] vector = new int[n];
                
        for (int i=0;i<n;i++){
            
            vector[i] = (int)(Math.random()*100000);
         }
            int c1,c2,c3,c4,c5;
            c1=0;
            c2=0;
            c3=0;
            c4=0;
            c5=0;
            
          for (int elemento:vector){  
           
            if (elemento > 0 && elemento < 10){c1=c1+1;}
            if (elemento >= 10 && elemento < 100){c2=c2+1;}
            if (elemento >= 100 && elemento < 1000){c3=c3+1;}
            if (elemento >= 1000 && elemento < 10000){c4=c4+1;}
            if (elemento >=10000 && elemento < 100000){c5=c5+1;}
                
            
            }
          System.out.println(" 1 digito: "+c1);
          System.out.println(" 2 digito: "+c2);
          System.out.println(" 3 digito: "+c3);
          System.out.println(" 4 digito: "+c4);
          System.out.println(" 5 digito: "+c5);
            
        }
          
        
        
        
  //       digit_val[i] = String.valueOf(vector[i][0]);
//            vector[i][1] = digit_val[i].length();

            
        
        
        
        
   
        
        
        
        
        
        
        
        
        
    }
    
}
