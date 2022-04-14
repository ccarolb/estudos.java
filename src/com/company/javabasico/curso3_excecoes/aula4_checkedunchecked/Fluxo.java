package com.company.javapooalura.curso3_excecoes.aula4_checkedunchecked;

public class Fluxo {
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
                                        //obs: sem mensagem aparece que a mensagem da exceção é null (pra ver a msg usa o .getMessage())
            throw new MinhaException("deu bastante erro");

        }




}
