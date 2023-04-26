/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class Ahorcado {
    
     private int n;
     private String[] letras = new String[n];
     private String[] respuesta = new String[n];
     private int cantLetrasEnc;
     private int intentosMaximos;

    public Ahorcado() {
    }

    public Ahorcado(int n, int cantLetrasEnc, int intentosMaximos) {
        this.n = n;
        this.cantLetrasEnc = cantLetrasEnc;
        this.intentosMaximos = intentosMaximos;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public int getCantLetrasEnc() {
        return cantLetrasEnc;
    }

    public void setCantLetrasEnc(int cantLetrasEnc) {
        this.cantLetrasEnc = cantLetrasEnc;
    }

    public int getIntentosMaximos() {
        return intentosMaximos;
    }

    public void setIntentosMaximos(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }
    
     @Override
    public String toString() {
        return "Ahorcado{" + "n=" + n + ", letras=" + Arrays.toString(letras) + ", cantLetrasEnc=" + cantLetrasEnc + ", intentosMaximos=" + intentosMaximos + '}';
    }
     
     
     
}
