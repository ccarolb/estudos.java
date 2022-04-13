package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula5_classesemetodosabstratos.funcionario;

public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        return super.getSalario();
    };

}
