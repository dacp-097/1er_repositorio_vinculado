/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooeex6;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class POOeex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        AhorcadoServicio as = new AhorcadoServicio();
        System.out.println("Bienvenido al juego del ahorcado, empecemos...");
        juego(as, leer);

    }

    public static void juego(AhorcadoServicio as, Scanner leer) {

        Ahorcado juego1 = as.crearJuego();
        String mostrarAux[] = new String[juego1.getN()];
        String mostAux[] = new String[juego1.getN()];
        int Aux;
        int cIntent = 0;
        int iR;
        int encontradas;
        String letras;
        boolean comparacion = false;

        do {
            System.out.println("Ingrese una letra: ");
            letras = leer.next();

            mostrarAux = as.buscar(juego1, letras, juego1.getRespuesta());
            mostAux = mostrarAux;

            System.out.println("La longitud de la palabra es de " + as.longitud(juego1) + " letras");

            System.out.println(":" + Arrays.toString(mostrarAux));

            encontradas = (juego1.getCantLetrasEnc() + as.encontradas(juego1, letras));
            juego1.setCantLetrasEnc(encontradas);

            System.out.println("Número de letras (encontradas, faltantes): (" + juego1.getCantLetrasEnc() + ", " + (juego1.getLetras().length - juego1.getCantLetrasEnc()) + ")");

            Aux = as.intentos(cIntent);
            cIntent = Aux;
            iR = juego1.getIntentosMaximos() - cIntent;

            System.out.println("Número de oportunidades restantes:" + iR);

            if (Arrays.equals(juego1.getLetras(), juego1.getRespuesta())) {
                comparacion = true;
            }

            if (comparacion == true) {
                System.out.println("Felicitaciones encontraste la palabra :D ...");
                break;

            } else {
                System.out.println(" Lo sentimons, fallaste, vuelve a intentarlo...");
            }

        } while (juego1.getIntentosMaximos() > cIntent && mostrarAux != juego1.getLetras());

    }

}
