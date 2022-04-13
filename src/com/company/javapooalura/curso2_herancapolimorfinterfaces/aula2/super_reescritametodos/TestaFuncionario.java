package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula2.super_reescritametodos;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000);

        System.out.println(funcionario.getBonificacao());
    }
}
