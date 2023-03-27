/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.aprendizaje;

/**
 *
 * @author DELL
 */
public class EA17NEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  int vector[] = new int[100000];
    int count1 = 0;int count2 = 0;int count3 = 0;int count4 = 0;int count5 = 0;
    for(int i = 0;i < 100; i++)
    {
      vector[i] = (int) (Math.random() * 100000);
            if ( vector[i] < 10     ) {count1++;}
      else{ if ( vector[i] < 100    ) {count2++;}
      else{ if ( vector[i] < 1000   ) {count3++;}
      else{ if ( vector[i] < 10000  ) {count4++;}
      else{ if ( vector[i] < 100000 ) {count5++;}}}}} 
            System.out.println("" + vector[i]);
    }
    
    System.out.println(" Se encontraron: ");
    System.out.println( " " + count1 + " números de 1 dígito");
    System.out.println( " " + count2 + " números de 2 dígitos");
    System.out.println( " " + count3 + " números de 3 dígitos");
    System.out.println( " " + count4 + " números de 4 dígitos");
    System.out.println( " " + count5 + " números de 5 dígitos");

    }
    
}
