/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author USUARIO
 */

/**
 *
 * @author USUARIO
 */
import Modelo.Cuenta;
import Modelo.CuentaAhorros;
import Modelo.CuentaCorriente;
import java.util.ArrayList;

public class Controlador {

    private ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Cuenta buscar(String numeroCuenta) {
        for (Cuenta c : cuentas) {
            if (c.getNumeroCuenta().equalsIgnoreCase(numeroCuenta)){
                return c;
            }
        }
        return null;
    }

    // Crear cuenta AHORROS
    public String crearCuentaAhorros(String nombre, String numeroCuenta, String fecha, double saldo) {

        if (buscar(numeroCuenta) != null) {
            return "La cuenta ya existe";
        }
        cuentas.add(new CuentaAhorros(numeroCuenta, nombre, fecha, saldo));
        return "Cuenta de ahorros creada";
    }

    // Crear cuenta CORRIENTE
    public String crearCuentaCorriente(String nombre, String numeroCuenta, String fecha, double saldo, double cupo) {
        if (buscar(numeroCuenta) != null) {
            return "La cuenta ya existe";
        }

        cuentas.add(new CuentaCorriente( numeroCuenta, nombre, fecha, saldo, cupo));
        return "Cuenta corriente creada";
    }

    // Consignar
    public String consignar(String numeroCuenta, double valor) {

        Cuenta c = buscar(numeroCuenta);

        if (c == null) return "Cuenta no encontrada";
        if (valor <= 0) return "Valor inválido";

        c.consignar(valor);
        return "Consignación exitosa";
    }

    // Retirar
    public String retirar(String numeroCuenta, double valor) {
         Cuenta c = buscar(numeroCuenta);

        if (c == null) return "Cuenta no encontrada";
        if (valor <= 0) return "Valor inválido";

        if (c.retirar(valor)) {
            return "Retiro exitoso";
        } else {
            return "Fondos insuficientes";
        }
    }

    // Ver saldo
   public String verDatos(String numeroCuenta) {

        Cuenta c = buscar(numeroCuenta);

        if (c == null) return "Cuenta no encontrada";

        return c.mostrarDatos();
    }
}
