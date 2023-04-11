/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona per = new Persona();
        
        System.out.println("Ingrese el nombre de la persona: ");
        per.setNombre(leer.nextLine());
        System.out.println("Ingrese la fecha de nacimiento de "+per.getNombre()+": ");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        System.out.println("Anio: ");
        int anio = leer.nextInt();
        
        Date fechaN = new Date(anio-1900,mes-1,dia);
        per.setFechaN(fechaN);
        
        double edad = calcularEdad(fechaN);
        per.setEdad(edad);
        
        return per;
    }
    
    public double calcularEdad(Date a){
        
        Date fechaActual= new Date();
        double diferencia = Math.abs(a.getTime()-fechaActual.getTime());
        
        double edad =(((((diferencia/1000)/60)/60)/24)/365);
        
        return edad;
    }

    public boolean menorQue(Persona a,int edad){
        
        boolean valido = false;
        
        if(a.getEdad()<edad){
            valido = true;
        }
        
        return valido;
    }
    
    public void mostrarPersona(Persona a){
        
        System.out.println("resultados: "+a);
    }
    
}
