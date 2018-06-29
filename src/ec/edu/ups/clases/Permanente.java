/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

public class Permanente extends Empleado{

    @Override
    public double calcularIngresos() {
        return 1000.00;
    }

    @Override
    public double calcularEgresos() {
        return 100.00;
    }

    @Override
    public double calcularBonos() {
        return 0.00;
    }
    
}
