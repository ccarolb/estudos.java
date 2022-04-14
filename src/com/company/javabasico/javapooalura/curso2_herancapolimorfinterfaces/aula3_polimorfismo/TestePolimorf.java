package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula3_polimorfismo;

public class TestePolimorf {
    public static void main(String[] args) {

        //variáveis do tipo Funcionário que apontam para objetos de tipos diferentes -> polimorfismo

        Funcionario funcionario = new Funcionario(); //variável do tipo Funcionário que aponta para uma instância do tipo Funcionário;

        Funcionario gerente = new Gerente(); //variável do tipo Funcionário que aponta para uma instância do tipo Gerente;
        //todos gerentes são funcionários

        Funcionario designer = new Designer(); //variável do tipo Funcionário que aponta para uma instância do tipo Designer;

        //Gerente gerente = new Funcionario(); -> não compila devido a hierarquia: nem todos funcionários são gerentes.

        funcionario.setSalario(1000);
        gerente.setSalario(2000);
        designer.setSalario(1500);

        System.out.println(funcionario.getBonificacao());
        System.out.println(gerente.getBonificacao());       //cada variável vai utilizar seu próprio método de bonificação, porque a chamada de método olha pro tipo da instância.
        System.out.println(designer.getBonificacao());      //variável do tipo Funcionario mas chamada de método específica de cada tipo de objeto.

    }
}
