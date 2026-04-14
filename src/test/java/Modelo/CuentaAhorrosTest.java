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
public class CuentaAhorrosTest {
    
    public CuentaAhorrosTest() {
    }
    
   @Test
    public void testRetiroExitoso() {

        CuentaAhorros c = new CuentaAhorros("Ana", "456", "01/01", 100);

        boolean r = c.retirar(40);

        assertTrue(r, "Fallo en test");
        assertEquals(60, c.getSaldo(), "Fallo en test");
    }

    @Test
    public void testRetiroFallido() {

        CuentaAhorros c = new CuentaAhorros("Ana", "456", "01/01", 100);

        boolean r = c.retirar(200);

        assertFalse(r, "Fallo en test");
        assertEquals(100, c.getSaldo(), "Fallo en test");
    }

}