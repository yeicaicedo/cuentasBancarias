/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Cuenta {
    //Atributos

    protected String nombre;
    protected String numeroCuenta;
    protected String fechaApertura;
    protected double saldo;

    public Cuenta(String nombre, String numeroCuenta, String fechaApertura, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    public void consignar(double valor) {
        saldo += valor;
    }

    public boolean retirar(double valor) {
        return false;
    }

    public String mostrarDatos() {
        return "Cuenta: " + numeroCuenta
                + "\n" + "Nombre: " + nombre
                + "\n" + "Fecha de apertura: " + fechaApertura
                + "\n" + "Saldo: " + saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
