/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NifServicio {
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNif(){
        
        NIF n = new NIF();
        
        System.out.println("Ingrese su  DNI: ");
        n.setDni(leer.nextLong());
        
        String dniString = Long.toString(n.getDni());
        int ls= dniString.length();
        System.out.println("string ingreso dni "+dniString+" longitud numero:"+ls);
        
        int residuo = (int) (n.getDni()%23);
        System.out.println("residuo: "+residuo);
        
        String[] letras = new String[23];
        
        letras[0]="T";
        letras[1]="R";
        letras[2]="W";
        letras[3]="A";
        letras[4]="G";
        letras[5]="M";
        letras[6]="Y";
        letras[7]="F";
        letras[8]="P";
        letras[9]="D";
        letras[10]="X";
        letras[11]="B";
        letras[12]="N";
        letras[13]="J";
        letras[14]="Z";
        letras[15]="S";
        letras[16]="Q";
        letras[17]="V";
        letras[18]="H";
        letras[19]="L";
        letras[20]="C";
        letras[21]="K";
        letras[22]="E";
        
        for (int i = 0; i < 23; i++) {
            
            if(residuo==i){
                n.setNif(Long.toString(n.getDni())+"-"+letras[i]);
            }
            
        }
        
        
        return n;
    }
    
    public void mostrar(NIF a){
        
        System.out.println("valor nif final: "+a.getNif());
    }
    
    
}
