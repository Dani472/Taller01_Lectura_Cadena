/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EST_1F_GC1_02
 */
public class Taller01Test {
    
    
    public Taller01Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ContarCaracteres method, of class Taller01.
     */
    @Test
    public void testContarCaracteres() {
        System.out.println("ContarCaracteres");
        String x = "hola esto es una prueba";
        double result = Taller01.ContarCaracteres(x);
        Taller01 a = new Taller01();
        assertEquals(23, result, 0.0); //Esperado
        assertEquals(15, result, 0.0); //Resultado erroneo
    }

    /**
     * Test of ContarPalabras method, of class Taller01.
     */
    @Test
    public void testContarPalabras() {
        System.out.println("ContarPalabras");
        String cadena = "hola esto es una prueba";
        String[] a = cadena.split(" ");
        double result = Taller01.ContarPalabras(a);
        assertEquals(5, result, 0.0); //Esperado
        assertEquals(10, result, 0.0); //Resultado erroneo
    }

    /**
     * Test of ContarEspacios method, of class Taller01.
     */
    @Test
    public void testContarEspacios() {
        System.out.println("ContarEspacios");
        String z = "hola esto es una prueba";
        double result = Taller01.ContarEspacios(z);
        assertEquals(4, result, 0.0); //Esperado
        assertEquals(20, result, 0.0); //Resultado erroneo
    }

    /**
     * Test of main method, of class Taller01.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;      
    }
    
}
