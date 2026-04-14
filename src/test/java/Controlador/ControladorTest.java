/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Modelo.Cuenta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
public class ControladorTest {
    
    public ControladorTest() {
    }

    @Test
    public void testCrearCuenta() {

        Controlador c = new Controlador();
        String r = c.crearCuentaAhorros("123", "Ana", "01/01", 100);
        assertEquals("Cuenta de ahorros creada", r, "Fallo test");
    }

    @Test
    public void testConsignar() {
        
        Controlador c = new Controlador();
        c.crearCuentaAhorros("123", "Ana", "01/01", 100);
        String r = c.consignar("123", 50);
        assertEquals("Consignación exitosa", r, "Fallo test");
    }

    @Test
    public void testRetirar() {

        Controlador c = new Controlador();
        c.crearCuentaAhorros("123", "Ana", "01/01", 100);
        String r = c.retirar("123", 40);
        assertEquals("Retiro exitoso", r, "Fallo test");
    }

    @Test
    public void testCuentaNoExiste() {

        Controlador c = new Controlador();
        String r = c.consignar("999", 50);
        assertEquals("Cuenta no encontrada", r, "Fallo test");
    }

    @Test
    public void testVerDatos() {

        Controlador c = new Controlador();
        c.crearCuentaAhorros("123", "Ana", "01/01", 100);
        String datos = c.verDatos("123");
        assertTrue(datos.contains("Ana"), "Fallo test");
    }
}