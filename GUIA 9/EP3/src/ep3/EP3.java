/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep3;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class EP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoServicio as = new AlumnoServicio();
        
        ArrayList<Alumno> listaAlumnos = as.crearAlumnos();
        
        double promedio =as.buscarAlumno(listaAlumnos);
        
        System.out.println("Lanota final del alumno es: "+promedio);
       



    }
    
}
