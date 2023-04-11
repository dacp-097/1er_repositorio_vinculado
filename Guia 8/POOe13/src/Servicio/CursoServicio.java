/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CursoServicio {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     public Curso crearCurso(int ext){
         
         Curso cursoLleno = new Curso();
         cursoLleno.setExtencion(ext);
         System.out.println("Ingrese el nombre del curso: ");
         cursoLleno.setNombreCurso(leer.nextLine());
         System.out.println("Ingrese la cantidad de horas por dia: ");
         cursoLleno.setCantidadHorasPorDia(leer.nextInt());
         System.out.println("Ingrese la cantidad de dias por semana: ");
         cursoLleno.setCantidadDiasPorSemana(leer.nextInt());
         System.out.println("Ingrese el turno (mañana o tarde)");
         cursoLleno.setTurno(leer.next());
         System.out.println("Ingrese el precio por hora");
         cursoLleno.setPrecioPorHora(leer.nextDouble());
         leer.nextLine();
         System.out.println("Ingrese el nombre de los alumnos...");
         cursoLleno.setAlumnos(cargarAlumnos(cursoLleno.getExtencion()));
         
         return cursoLleno;
         /* 
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];
          */
     }
     
     public String[] cargarAlumnos(int ext){
         String vectorA[]= new String[ext];
         
         for (int i = 0; i < ext; i++) {
             System.out.println("Ingrese el nombre del alumno: ");
             vectorA[i]=leer.nextLine();
         }
               
         return vectorA;
     }
     
     public double calcularGananciaSemanal(Curso a){
         
         double ganancia =(a.getExtencion()*a.getPrecioPorHora()*a.getCantidadHorasPorDia()*a.getCantidadDiasPorSemana());
         
         return ganancia;
     }
     
}
