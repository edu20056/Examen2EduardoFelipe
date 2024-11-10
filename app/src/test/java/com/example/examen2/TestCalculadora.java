package com.example.examen2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class TestCalculadora {

    //Prueba para el método convertirNumero con un caso de excepción.
    //Intenta convertir una cadena inválida en binario, lo cual debería lanzar
    //una excepción de formato de número y retornar -1.

    @Test
    public void testConvertirNumeroException() {
        assertEquals(-1, Calculadora.convertirNumero("notBinary", 0));
    }

    //Prueba para el método realizarOperacion con un caso de excepción.
    //Intenta realizar una división por cero, lo cual debería lanzar
    //una excepción de tipo ArithmeticException.
    @Test
    public void testRealizarOperacionDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> {
            Calculadora.realizarOperacion(10, 0, "/");
        });
    }

    //Prueba para el método convertirADestino con un caso de excepción.
    //Intenta convertir un número a una base no soportada, lo cual debería
    //lanzar una excepción de tipo IllegalArgumentException.

    @Test
    public void testConvertirADestinoBaseNoSoportada() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculadora.convertirADestino(10, 5);
        });
    }

    // Test - convertirNumero
    @Test
    public void testConvertirNumero() {
        assertEquals(5, Calculadora.convertirNumero("101", 0));
    }

    // Test - realizarOperacion
    @Test
    public void testRealizarOperacion() {
        assertEquals(9, Calculadora.realizarOperacion(5, 4, "+"));
    }

    // Test - convertirADestino
    @Test
    public void testConvertirADestino() {
        assertEquals("ff", Calculadora.convertirADestino(255, 3));
    }

    @Test
    public void testEncuentra_elementoEnLista() {
        assertTrue(Calculadora.Encuentra(Arrays.asList(100, 99, 98, 97, 96, 95), 99));
    }

    @Test
    public void testEncuentra_elementoNoEnLista() {
        assertFalse(Calculadora.Encuentra(Arrays.asList(1, 2, 3, 4, 7, 6, 0), 5));
    }
}
