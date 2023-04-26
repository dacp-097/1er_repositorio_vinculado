/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeex5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POOeex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        String[] mes = new String[12];
        
        mes[0]="enero";
        mes[1]="febrero";
        mes[2]="marzo";
        mes[3]="abril";
        mes[4]="mayo";
        mes[5]="junio";
        mes[6]="julio";
        mes[7]="agosto";
        mes[8]="septiembre";
        mes[9]="octubre";
        mes[10]="noviembre";
        mes[11]="diciembre";
        
        String mesSecreto = mes[5];
        
        System.out.println("Adivina el mes secreto...");
        String resp = leer.next();
        
         do {
                System.out.println("fallaste, intenta de nuevo...");
                System.out.println("Adivina el mes secreto...");
                resp = leer.next();
                
            }while(!(resp.equalsIgnoreCase(mesSecreto)));
   
        if(resp.equalsIgnoreCase(mesSecreto)){
            System.out.println("Felicidades adivinaste el mes!!! :D");
        } 

    }
    
}
