package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula5_classesemetodosabstratos.funcionario;

public class ControleBonificacao {
    private double soma;

    public void controlaBonificacao(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();

        System.out.println("Chamou o controle de bonificação.");
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}
