/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep5;

import Servicio.PaisServicio;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class EP5 {

    /**
     * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PaisServicio ps = new PaisServicio();
        HashSet<String> listaPaises = ps.llenarPises();
        ps.mostrarPaises(listaPaises);
        //Uso de TreeSet para ordenar el HashSet
        TreeSet<String> paisesOrdenadosAlf = ps.ordenarAlf(listaPaises);
        ps.mostrarPaisesTree(paisesOrdenadosAlf);
        //Uso de un ArrayList + Comparator para ordenar el HashSet 
        ps.ordenarAlfArray(listaPaises);
        TreeSet<String> nuevaListaPiases =ps.eliminacionPais(paisesOrdenadosAlf) ;
        ps.mostrarPaisesTree(nuevaListaPiases);
    }
    
}
