
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una nota entre 0 y 10");
        int nota = leer.nextInt();
        
        while(nota<0 || nota>10) {
            
            System.out.println("Nota no valida vuelva a intentar"); 
            
            nota = leer.nextInt();
        }
        
        System.out.println("Nota correcta");
        }        
        
    }
    
