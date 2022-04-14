package com.company.javatestes.aula1_testesautomatizados;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2, 3));

        System.out.println(calc.somar(0, 3));

        System.out.println(calc.somar(0, 0));

        System.out.println(calc.somar(2, -1));
    }
}
