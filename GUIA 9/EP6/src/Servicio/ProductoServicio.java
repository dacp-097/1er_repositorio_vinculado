/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ProductoServicio {

    HashMap<String, Double> listaProductos = new HashMap<>();
    Scanner leer = new Scanner(System.in);

    public HashMap<String, Double> menu() {

        int respMenu;
        boolean continuar = true;
        boolean continuarAg = true;
        String respAgreProduc = "";
        String respSN = "";

        do {

            System.out.println("-----   MENU    -----\n"
                      + "1.Introducir un producto\n"
                      + "2.Modificar el precio de un producto\n"
                      + "3.Eliminar un producto\n"
                      + "4.Mostrar productos existentes con su precio\n"
                      + "5.Salir");
            respMenu = leer.nextInt();

            switch (respMenu) {

                case 1:
                    do {
                        Producto productoLleno = crearProducto();
                        listaProductos.put(productoLleno.getNombreProducto(), productoLleno.getPrecioProducto());

                        do {
                            System.out.println("Desea agregar otro producto? si/no");
                            respAgreProduc = leer.next();
                            if (!(respAgreProduc.equalsIgnoreCase("si") || respAgreProduc.equalsIgnoreCase("no"))) {
                                System.out.println("Respuesta si/no invalida, vuelva a intentar");
                            }

                        } while (!(respAgreProduc.equalsIgnoreCase("si") || respAgreProduc.equalsIgnoreCase("no")));

                        if (respAgreProduc.equalsIgnoreCase("no")) {
                            continuarAg = false;
                        }

                    } while (respAgreProduc.equalsIgnoreCase("si") || continuarAg == true);
                    System.out.println("Borrar: " + listaProductos);
                    break;

                case 2:
                    cambiarPrecio(listaProductos);
                    System.out.println("Borrar nuevo precio producto: " + listaProductos);
                    break;
                case 3:
                    eliminarProducto(listaProductos);
                    break;
                case 4:
                    mostrarProductos(listaProductos);
                    break;
                case 5:
                    System.out.println("Adios :D");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion no valida, por favor vuelva a intentar...");

            }

        } while (continuar);

        return listaProductos;
    }

    public Producto crearProducto() {

        Producto productoLleno = new Producto();
        System.out.println("Ingrese el nombre del producto: ");
        productoLleno.setNombreProducto(leer.next());
        System.out.println("Ingrese el precio de dicho prodcuto: ");
        productoLleno.setPrecioProducto(leer.nextDouble());

        return productoLleno;
    }

    public void cambiarPrecio(HashMap<String, Double> listaProductos) {

        String cambiarPrecio;

        do {
            System.out.println("Ingrese el nombre del producto que desea cambiar de precio");
            cambiarPrecio = leer.next();
            if (!(listaProductos.containsKey(cambiarPrecio))) {
                System.out.println("El producto mencionado no existe...");

            } else {

                for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
                    String key = entry.getKey();
                    Double value = entry.getValue();
                    if (key.equalsIgnoreCase(cambiarPrecio)) {
                        System.out.println("Ingrese el nuevo precio del producto " + key + ": ");
                        double nuevoPrecio = leer.nextDouble();
                        listaProductos.replace(key, value, nuevoPrecio);
                    }

                }
            }

        } while (!(listaProductos.containsKey(cambiarPrecio)));

    }

    public void eliminarProducto(HashMap<String, Double> listaProductos) {

        String productoEliminar;

        do {
            System.out.println("Ingrese el nombre del producto que desea eliminar");
            productoEliminar = leer.next();
            if (!(listaProductos.containsKey(productoEliminar))) {
                System.out.println("El producto mencionado no puede ser eliminado...");

            } else {

                for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
                    String key = entry.getKey();
                    Double value = entry.getValue();
                    if (key.equalsIgnoreCase(productoEliminar)) {
                        listaProductos.remove(key);
                        System.out.println("Fue eliminado con exito");

                    }

                }
                break;
            }

        } while (!(listaProductos.containsKey(productoEliminar)));

    }

    public void mostrarProductos(HashMap<String, Double> listaProductos) {

        listaProductos.forEach((k, v) -> System.out.println("Producto: " + k + ": precio: " + v));
    }

}
