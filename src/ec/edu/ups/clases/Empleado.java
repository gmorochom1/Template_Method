/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

public abstract class Empleado {

    public double calcularSueldo() {
        calcularIngresos();
        calcularEgresos();
        calcularBonos();
        return (calcularIngresos() - calcularEgresos()) + calcularBonos();
    }

    public abstract double calcularIngresos();

    public abstract double calcularEgresos();

    public abstract double calcularBonos();

}
