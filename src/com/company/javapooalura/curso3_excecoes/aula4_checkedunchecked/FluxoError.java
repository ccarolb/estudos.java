package com.company.javapooalura.curso3_excecoes.aula4_checkedunchecked;

public class FluxoError {
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch(ArithmeticException | MinhaException exception ) {
            System.out.println("Exception: " + exception.getMessage());
        }

        System.out.println("Fim do main");
    }

        public static void metodo1() {
            System.out.println("Início do metodo1");
            metodo2();
            System.out.println("Fim do metodo1");
        }

        public static void metodo2() {
            System.out.println("Início do metodo2");
            metodo2();
            throw new MinhaException("deu bastante erro");

        }




}
