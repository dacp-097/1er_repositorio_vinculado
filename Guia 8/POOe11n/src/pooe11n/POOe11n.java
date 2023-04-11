/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe11n;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POOe11n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese el dia de la fecha que desea poner");
        int dia= leer.nextInt();
        System.out.println("Ingrese el mes de la fecha que desea poner");
        int mes= leer.nextInt();
        System.out.println("Ingrese el anio de la fecha que desea poner");
        int anio= leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println("la fecha ingresada es: "+fecha);
        Date fechaActual = new Date();
        System.out.println("La fecha actual es: "+fechaActual);
        
        /*int difDia =Math.abs(fechaActual.getDate()-fecha.getDate());
        int difMes =Math.abs(fechaActual.getMonth()-fecha.getMonth());
        int difAnio =(fechaActual.getYear()-fecha.getYear());*/
        
        long diferencia = Math.abs(fechaActual.getTime()-fecha.getTime());
        System.out.println("diferencia en milisegundos: "+diferencia);
        
        /*System.out.println("La diferencia en unidades de tiempo entre fechas es: "
                  + "\n dias: "+difDia
                  + "\n meses: "+difMes
                  + "\n anios: "+difAnio);*/
        
        double seg =diferencia/1000;
        System.out.println("segundos: "+seg);
        double minutos = seg/60;
        System.out.println("minutos: "+minutos);
        double horas = minutos/60;
        System.out.println("horas: "+String.format("%.2f",horas));
        double dias = horas/24;
        System.out.println("dias: "+String.format("%.2f",dias));
        double annios = dias/365;
        System.out.println("anios: "+String.format("%.2f", annios));
        
        
    }
    
}
