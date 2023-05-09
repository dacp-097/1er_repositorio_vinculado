/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);
    
    public ArrayList<Alumno> crearAlumnos(){
        
        ArrayList<Alumno> alumnos = new ArrayList();
        
        String resp;
        
        do {
            Alumno AlumnoLleno = new Alumno();
            ArrayList<Integer> notasAux = new ArrayList();
            
        System.out.println("Ingrese el nombre del alumno: ");
        AlumnoLleno.setNombre(leer.next());
        System.out.println("Ingrese nota 1 ");
        notasAux.add(leer.nextInt());
        System.out.println("Ingrese nota 2 ");
        notasAux.add(leer.nextInt());
        System.out.println("Ingrese nota 3 ");
        notasAux.add(leer.nextInt());
        
        AlumnoLleno.setNotas(notasAux);
        alumnos.add(AlumnoLleno);
        
            System.out.println("Desea agregar otro alunmo? ");            
             resp= leer.next();
                       
        } while ( resp.equalsIgnoreCase("si"));
 
       return alumnos;
    }
    
    public double buscarAlumno(ArrayList<Alumno> listaAlumnos){
        
        String nombreAlumno;
        double promedio=0;
        boolean verd= false;
        
        System.out.println("Ingrese el nombre del alumno para saber su nota final:");
        nombreAlumno = leer.next();
        
        for (Alumno alummnoAux :listaAlumnos){
            
            if(alummnoAux.getNombre().equalsIgnoreCase(nombreAlumno)){
            promedio = notaFinal(alummnoAux.getNotas());
                System.out.println("notas de alumno: "+alummnoAux.getNotas());
                verd=true;
            } 
            
        }
        
        if (verd!=true){
            System.out.println("Ese nombre no es valido");
        }
        
        
        return promedio;
    }
    
    public double notaFinal(ArrayList<Integer> listanotas){
        
        double prom;
        int c=0;
        double suma =0;
        
        for(int num : listanotas){
            
            suma = suma + num;
            c+=1;
        }
        
        prom= suma/c;

        
        return prom;
    }
}

