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
public class EA16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println(" ingrese tamanio del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * 5 + 1);

        }
        System.out.println("que numero desea buscar: ");
        int b = leer.nextInt();

        int c = 0;
        int lugar = 0;
        String aux = "";
        for (int i = 0; i < n; i++) {

            
            if (vector[i] == b) {

                System.out.println(" ubicacion: " + i);
                c = c+1;
                System.out.println("contador: "+ c);
            } 

        }
        
        
        if (c > 1) {
            System.out.println("El numero se repite en estas posiciones: ");
            
        }
        
    }

}

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
package g7ejercicio16;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tachi
 
public class G7ejercicio16 {

    
     * @param args the command line arguments
     
    public static void main(String[] args) {
        // TODO code application logic here
     //int [] vector;   
     Scanner leer = new Scanner(System.in);  
     System.out.println("Introduce tamaño del vector");
     int tamaño = leer.nextInt();
     int[] vector = new int[tamaño];
     System.out.println("Introduce numero a buscar dentro del vector");
     int num2 = leer.nextInt();

 
    llenaVector(vector);
    impri
posicionVector(vector,num2);
	}
	
    public static int[] llenaVector(int[] vector){
		System.out.println("LLenando vector....");
		for(int i=0;i<vector.length;i++){
			vector[i] = new Random().nextInt(10);
		}
		return vector;
	}
	public static void imprimeVector(int[] vector){
		System.out.println("Imprimiendo vector....");
		for(int i=0;i<vector.length;i++){
			System.out.print(String.valueOf(vector[i])+" ");
		}
	}

        public static void posicionVector(int[] vector, int num2){
		//System.out.println("Imprimiendo vector....");
                int band=0;
                int cont=0;
                
		for(int i=0;i<vector.length;i++){
			//System.out.print(String.valueOf(vector[i])+" ");
                        if (num2 == vector[i]){
                            //System.out.println("El numero si se encuentra dentro del vector");
                            band=1;
                            cont++;
                        }
}
                if (band==1){
                 System.out.println("El numero si se encuentra dentro del vector");
                }
                else
                {
                  System.out.println("");  
                  System.out.println("El numero buscado, no se encuentra dentro del vector");  
                }

		if (cont ==1){
                 System.out.println("el numero "+num2+": se encuentra repetido: "+cont+ "vez" );   
                }else
                System.out.println("el numero "+num2+": se encuentra repetido: "+cont+" veces");
	}
}
*/