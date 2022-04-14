package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula3_polimorfismo;

public class TestePolimorf3 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Gerente gerente = new Gerente();
        Designer designer = new Designer();

        funcionario.setSalario(1000);
        gerente.setSalario(2000);
        designer.setSalario(1500);

        ControleBonificacao_TSTPolimorf3 controleBonificacao = new ControleBonificacao_TSTPolimorf3();

        controleBonificacao.controlaBonificacao(funcionario); // 10% do salário = 10% de 1000
        System.out.println("A bonificação do funcionário é " + funcionario.getBonificacao()); // -> = 100
        System.out.println("A soma das bonificações é " + controleBonificacao.getSoma() + "\n"); // 0 + 100 = 100

        controleBonificacao.controlaBonificacao(gerente); //salario + 10% -> 2000 + (10% de 2000)
        System.out.println("A bonificação do gerente é " + gerente.getBonificacao()); // -> 2000 + 200 = 2200
        System.out.println("A soma das bonificações é " + controleBonificacao.getSoma() + "\n"); //2200 + soma -> 2200 + 100 = 2300

        controleBonificacao.controlaBonificacao(designer); //salario + 200 -> 1500 + 200
        System.out.println("A bonificação do designer é " + designer.getBonificacao()); // = 1700
        System.out.println("A soma das bonificações é " + controleBonificacao.getSoma() + "\n"); // 1700 + soma -> 1700 + 2300 = 4000
    }
}
