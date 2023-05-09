/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep2n;

import Servicio.RazaServicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EP2n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RazaServicio rs = new RazaServicio();
        Scanner leer = new Scanner(System.in);

        ArrayList<String> razas = new ArrayList();

        String r;
        int resp;
        boolean a = true;
        boolean b = false;

        do {
            System.out.println("Ingrese una raza de perro");
            razas.add(leer.next());

            System.out.println("desea continuar para guardar otra raza o desea salir?\n"
                      + "1. Agregar otra raza\n"
                      + "2. Salir");

            resp = leer.nextInt();

            while (resp != 1 && resp != 2) {
                System.out.println("Valor no valido, vuelva a intentar...");
                System.out.println("desea continuar para guardar otra raza o desea salir?\n"
                      + "1. Agregar otra raza\n"
                      + "2. Salir");
                resp = leer.nextInt();
            }

            switch (resp) {
                case 1:
                    continue;
                case 2:
                    for (String aux : razas) {
                        System.out.print("[" + aux + "] + ");
                        a = false;
                    }
            }
            System.out.println("");

        } while (a);

        rs.eliminarRaza( razas);

        Collections.sort(razas);

        /*while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }*/
        for (String aux : razas) {
            System.out.print("[" + aux + "] + ");
        }
        System.out.println("");
    }

    }
    

