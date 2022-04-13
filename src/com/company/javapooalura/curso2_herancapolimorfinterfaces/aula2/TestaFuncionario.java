package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula2;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
//        funcionario.setSalario(2000); correto

        funcionario.salario = 2000; //errado, o ideal é q os atributos sejam private, não protected nem public.
        System.out.println(funcionario.getBonificacao());
    }
}
