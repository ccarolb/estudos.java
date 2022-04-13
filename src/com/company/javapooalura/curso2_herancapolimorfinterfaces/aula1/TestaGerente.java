package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula1;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setSenha(222);

        System.out.println(gerente1.autentica(222));

        gerente1.setNome("João"); //setter que está na classe Funcionário e portanto herdado pela classe Gerente.
    }
}
