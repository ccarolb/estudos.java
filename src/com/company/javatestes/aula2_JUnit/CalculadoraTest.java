package com.company.javatestes.aula2_JUnit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

    @Test
    public void somaDoisNumPositivos() {
        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar(2, 3);

        assertEquals(5, soma);
    }

}
