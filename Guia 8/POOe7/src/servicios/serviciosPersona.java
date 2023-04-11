/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class serviciosPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(int a){
             /*
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private double altura;
        */
             
        Persona per = new Persona();
        System.out.println("Ingrese el nombre de la persona "+(a+1)+": ");
        per.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona "+(a+1)+": ");
        per.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona "+(a+1)+": ");
        String cad =leer.next();
        
        while (!(cad.equalsIgnoreCase("H")||cad.equalsIgnoreCase("m")||cad.equalsIgnoreCase("o"))){
                        System.out.println("El sexo ingresado no es valido, vuelva a intentar");
                        cad =leer.nextLine();
        }
     
        if (cad.equalsIgnoreCase("H")||cad.equalsIgnoreCase("m")||cad.equalsIgnoreCase("o")){
            per.setSexo(cad);
        } 
        
        System.out.println("Ingrese el peso en kg de la persona "+(a+1)+": ");
        per.setPeso(leer.nextInt());
    
        System.out.println("Ingrese la altura en metros de la persona " + (a+1 )+ ": ");
        per.setAltura(leer.nextDouble());

        return per;
    }
    
public int calcularIMC(Persona a){
    int num=3;
    int formula = (int) ((a.getPeso())/(Math.pow(a.getAltura(), 2)));
    
    if (formula <20){
        System.out.println(a.getNombre()+ " esta por debajo de su peso ideal");
            num=-1;
    }
    if (formula >=20&&formula <=25){
        System.out.println(a.getNombre()+ " tiene un peso ideal");
            num=0;
    }
    if (formula >25){
        System.out.println(a.getNombre()+ " tiene sobrepeso ");
            num=1;
    }
    return num;
}
    
public boolean esMayorDeEdad(Persona a){
    boolean xx;
    
    if ( a.getEdad()>=18){
        System.out.println("Es mayor de edad");
        xx=true;
    }else {
        System.out.println("Es menor de edad");
        xx=false;
    }
    
    return xx;
}

}
