/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe13;

import Servicio.CursoServicio;
import entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POOe13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CursoServicio cs = new CursoServicio();
        System.out.println("Cantidad de alumnos por clase: ");
        int num = leer.nextInt();
        System.out.println("Ingrese informacion del curso a crear");
        Curso cu =cs.crearCurso(num);
        System.out.println("informacion curso: "+cu);
        System.out.println("La ganacia por semana de este curso es: "+cs.calcularGananciaSemanal(cu));

    }
    
}
