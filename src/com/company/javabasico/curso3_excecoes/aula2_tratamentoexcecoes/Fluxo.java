package com.company.javapooalura.curso3_excecoes.aula2_tratamentoexcecoes;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Início do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException exception) {
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
            for(int i = 1; i <= 5; i++) {
                System.out.println(i);
                Conta conta = null;
                conta.deposita();
            }
            System.out.println("Fim do metodo2");
        }




}
