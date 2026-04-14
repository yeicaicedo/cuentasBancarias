/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

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
public class CuentaTest {
    
    public CuentaTest() {
    }
    
   @Test
    public void testConsignar() {

        Cuenta c = new Cuenta("Juan", "123", "01/01", 100);

        c.consignar(50);

        assertEquals(150, c.getSaldo(), "Fallo en Test");
    }

    @Test
    public void testMostrarDatos() {

        Cuenta c = new Cuenta("Juan", "123", "01/01", 100);

        String datos = c.mostrarDatos();

        assertTrue(datos.contains("Juan"), "Fallo en Test");
        assertTrue(datos.contains("123"), "Fallo en Test");
    }

    @Test
    public void testRetirarBase() {

        Cuenta c = new Cuenta("Juan", "123", "01/01", 100);

        boolean r = c.retirar(50);

        assertFalse(r, "Fallo en Test");
    }
}