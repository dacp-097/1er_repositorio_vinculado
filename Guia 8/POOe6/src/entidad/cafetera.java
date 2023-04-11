/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author DELL
 */
public class cafetera {
    
    private int qMax;
    private int qActual;

    public cafetera() {
    }

    public cafetera(int qMax, int qActual) {
        this.qMax = qMax;
        this.qActual = qActual;
    }

    public int getqMax() {
        return qMax;
    }

    public void setqMax(int qMax) {
        this.qMax = qMax;
    }

    public int getqActual() {
        return qActual;
    }

    public void setqActual(int qActual) {
        this.qActual = qActual;
    }
    
    
    
}
