/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Movil;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MovilServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular(){
        
        Movil m = new Movil();
        //marca, precio, modelo, memoriaRam, almacenamiento y codigo
        System.out.println("INGRESE INFORMACION DEL CELULAR");
        System.out.println("Marca: ");
        m.setMarca(leer.next());
        System.out.println("Precio: ");
        m.setPrecio(leer.nextDouble());
        System.out.println("Modelo: ");
        m.setModelo(leer.next());
        System.out.println("Memoria Ram: ");
        m.setMemoriaRam(leer.nextInt());
        System.out.println("Almacenamiento: ");
        m.setAlmacenamiento(leer.nextInt());
        System.out.println("Codigo: ");
        m.setCodigo(ingresarCodigo());
        
        return m;
    }
    
    public int[]  ingresarCodigo(){
        
        int[] cod = new int[7];
        for (int i = 0; i < 7; i++) {
            cod[i]=(int) (Math.random() * 5 + 1);
            System.out.println("Numero "+(i+1)+": "+cod[i]);
        }
        
        return cod;
    }
    
}
