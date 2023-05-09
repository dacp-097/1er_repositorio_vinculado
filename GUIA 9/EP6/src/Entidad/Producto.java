/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Producto implements Comparable<Producto> {
    
    private String nombreProducto;
    private double precioProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombreProducto);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.precioProducto) ^ (Double.doubleToLongBits(this.precioProducto) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precioProducto) != Double.doubleToLongBits(other.precioProducto)) {
            return false;
        }
        if (!Objects.equals(this.nombreProducto, other.nombreProducto)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }

    @Override
    public int compareTo(Producto t) {
        
        return this.nombreProducto.compareTo(t.getNombreProducto());
    }
    
    
    
}
