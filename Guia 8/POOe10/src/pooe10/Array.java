/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooe10;

/**
 *
 * @author DELL
 */
public class Array {
    
    private double[] vectorA;
    private double[] vectorB;

    public Array() {
        
        
    }

    public Array(double[] vectorA, double[] vectorB) {
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }

    @Override
    public String toString() {
        return "Array{" + "vectorA=" + vectorA + ", vectorB=" + vectorB + '}';
    }
    
    
    
    
}
