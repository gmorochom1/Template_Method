/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejecutivo ejecutivo = new Ejecutivo();
        Temporal temporal=new Temporal();
        Permanente permanente=new Permanente();
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Calculo Sueldo Empleado Ejecutivo= "+ ejecutivo.calcularSueldo());      
        
        System.out.println("Calculo Sueldo Empleado Temporal= "+temporal.calcularSueldo());
        
        System.out.println("Calculo Sueldo Empleado Permanente= "+permanente.calcularSueldo());        
        
    }
}
