/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.cuenta;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class cuentaServicios {
    Scanner leer = new Scanner(System.in);
    public cuenta crearCuenta(){
        
        cuenta c1 = new cuenta();
        System.out.println("ingrese su numero de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese DNI de la cuenta: ");
        c1.setDni(leer.nextLong());
        System.out.println("SALDO ACTUAL ");
        c1.setSaldoActual(leer.nextInt());
        return c1;
    }
    
    public double ingresarDinero(cuenta a){
        
        System.out.println("Ingrese la cantidad de dinero a sumar: ");
        double incremento = leer.nextDouble();
        double result= incremento +a.getSaldoActual();
        a.setSaldoActual((int) result);
        System.out.println("Saldo actual: "+a.getSaldoActual());
       return result;
      
    }
    
    public double retirarDinero(cuenta a){
        
        System.out.println("Ingrese la cantidad a retirar: ");
        double retiro = leer.nextDouble();
       if (retiro>a.getSaldoActual()){
           System.out.println("saldo insuficiente");
           a.setSaldoActual(0);
       } else {
             double result = a.getSaldoActual()- retiro;
             a.setSaldoActual((int)result);
               }
        System.out.println("Saldo actual: "+ a.getSaldoActual());
        return a.getSaldoActual();
    }
    
    public void extraccionRapida(cuenta a){
        
        System.out.println("su retiro sera maximo del 20% si lo dispone");
        
        System.out.println("Ingrese la cantidad a retirar: ");
        double retiro = leer.nextDouble();
       if (retiro>(0.2*a.getSaldoActual())){
           System.out.println("saldo insuficiente");
           
       } else {
             double result = a.getSaldoActual()- retiro;
             a.setSaldoActual((int)result);
               }
        System.out.println("Saldo actual: "+ a.getSaldoActual());
        
    }
    
    public void consultarSaldo(cuenta a){
        System.out.println("El saldo actual es: "+a.getSaldoActual());
    }
    
    
    public void consultarDatos(cuenta a){
        System.out.println("INFORMACION DE LA CUENTA: "
                  + "\n Numero de cuenta: "+a.getNumeroCuenta()
                  + "\n DNI del cliente: "+ a.getDni()
                  + "\n Saldo actual: "+ a.getSaldoActual());
    }
    
    
}
