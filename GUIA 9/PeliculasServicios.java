/* Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 * 
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class PeliculasServicios {
    private ArrayList<Pelicula> listaPeliculas;

    public PeliculasServicios() {
        listaPeliculas = new ArrayList();
    }
    public void agregarPelicula() {
        Scanner leer = new Scanner(System.in);
     do {
            System.out.print("Ingrese el título de la película: ");
            String titulo = leer.nextLine();

            System.out.print("Ingrese el nombre del director: ");
            String director = leer.nextLine();

            System.out.print("Ingrese la duración de la película (en horas): ");
            double duracion = leer.nextDouble();
            leer.nextLine();

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
           listaPeliculas.add(pelicula);

            System.out.print("¿Desea ingresar otra película? (s/n): ");
        } while (leer.nextLine().equalsIgnoreCase("s"));

        leer.close();
    }
 public void mostrarPeliculas() {
        System.out.println("Todas las películas:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
    }

    public void mostrarPeliculasMasDeUnaHora() {
        System.out.println("Películas con una duración mayor a 1 hora:");
        listaPeliculas.stream().filter((pelicula) -> (pelicula.getDuracion() > 1.0)).forEachOrdered((pelicula) -> {
            System.out.println(pelicula.toString());
        });
        
}
    public void ordenarPeliculasPorDuracionMayorAMenor() {
        Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) ->Double.compare(p2.getDuracion(), p1.getDuracion()));
        System.out.println("Películas ordenadas de mayor a menor duración:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
    }

    public void ordenarPeliculasPorDuracionMenorAMayor() {
        Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));
         System.out.println("Películas ordenadas de menor a mayor duración:");
         listaPeliculas.forEach((pelicula) -> {
             System.out.println(pelicula.toString());
        });
}
   
}
