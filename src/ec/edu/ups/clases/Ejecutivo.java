/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

public class Ejecutivo extends Empleado{

    @Override
    public double calcularIngresos() {
        return 1500.00;
    }

    @Override
    public double calcularEgresos() {
        return 200.00;
    }

    @Override
    public double calcularBonos() {
        return 500.00;
    }
    
}
