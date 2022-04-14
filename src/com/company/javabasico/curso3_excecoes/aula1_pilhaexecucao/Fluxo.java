package com.company.javapooalura.curso3_excecoes.aula1_pilhaexecucao;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");
    }

        public static void metodo1() {
            System.out.println("Início do metodo1");
            metodo2();
            System.out.println("Fim do metodo1");
        }

        public static void metodo2() {
            System.out.println("Início do metodo2");
            for(int i = 0; i <= 5; i++) {
                System.out.println(i);
            }
            System.out.println("Fim do metodo2");
        }




}
