/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class CuentaCorriente extends Cuenta {

    private double cupoSobregiro;

    public CuentaCorriente(String nombre, String numeroCuenta, String fechaApertura, double saldo, double cupoSobregiro) {
        super(nombre, numeroCuenta, fechaApertura, saldo);
        this.cupoSobregiro = cupoSobregiro;
    }

    @Override
    public boolean retirar(double valor) {
        
        double disponible;
        if (saldo >= 0) {
            disponible = saldo + cupoSobregiro;
        } else {
            disponible = cupoSobregiro;
        }

        if (disponible < valor) {
            return false;
        }
        saldo -= valor;

        if (saldo < 0) {
            cupoSobregiro += saldo;
        }

        return true;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()
                + "\nCupo Sobregiro: " + cupoSobregiro;
    }

    public double getCupoSobregiro() {
        return cupoSobregiro;
    }

    public void setCupoSobregiro(double cupoSobregiro) {
        this.cupoSobregiro = cupoSobregiro;
    }
}
