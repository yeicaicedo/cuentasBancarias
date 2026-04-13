/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class CuentaAhorros extends Cuenta{
    
    public CuentaAhorros(String nombre, String numeroCuenta, String fechaApertura, double saldo){
        super(nombre, numeroCuenta, fechaApertura, saldo);
    }
    
    @Override
    public boolean retirar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}

