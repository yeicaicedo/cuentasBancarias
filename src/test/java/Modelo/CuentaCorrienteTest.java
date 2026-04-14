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
public class CuentaCorrienteTest {
    
    public CuentaCorrienteTest() {
    }
    
    @Test
    public void testRetiroConSaldo() {

        CuentaCorriente c = new CuentaCorriente("Carlos", "789", "01/01", 100, 50);

        boolean r = c.retirar(80);

        assertTrue(r, "Fallo en test");
        assertEquals(20, c.getSaldo(), "Fallo en test");
    }

    @Test
    public void testRetiroConSobregiro() {

        CuentaCorriente c = new CuentaCorriente("Carlos", "789", "01/01", 50, 50);

        boolean r = c.retirar(80);

        assertTrue(r, "Fallo en test");
        assertEquals(-30, c.getSaldo(), "Fallo en test");
    }

    @Test
    public void testRetiroExcedeCupo() {

        CuentaCorriente c = new CuentaCorriente("Carlos", "789", "01/01", 0, 50);

        boolean r = c.retirar(60);

        assertFalse(r, "Fallo en test");
    }
}